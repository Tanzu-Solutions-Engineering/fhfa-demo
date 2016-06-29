package io.pivotal.boot.fhfa;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class FhfaApplicationTests {
	static HashMap<String,Integer> statesMap = new HashMap<>();

	static {
		String[] states = {"AL","AK","AZ","AR","CA","CO","CT","DE","DC","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","MD","MA","MI","MN","MS","MO","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		for(int i=0;i<states.length;i++){
			statesMap.put(states[i],i);
		}
	}
	@Test
	public void load() throws Exception{
		String path = "/Users/vcarvalho/Downloads";
		String filter = "AMA_PUDB";
		File dir = new File(path);
		File[] files = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.startsWith(filter);
			}
		});

		CSVFormat format = CSVFormat.DEFAULT;
		File outputFile = new File(path+"/sample.csv");
		FileWriter writer = new FileWriter(outputFile);
		CSVPrinter printer = new CSVPrinter(writer,format);

		for(File f : files){
			Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(new FileReader(f));

			for(CSVRecord record : records){
				List<Object> entries = new ArrayList<>();
				entries.add(record.get("Rate"));
				entries.add(record.get("Amount"));
				entries.add(record.get("Income"));
				entries.add(record.get("Borrower Credit Score"));
				entries.add(record.get("Term"));
				entries.add(record.get("LTV"));
				entries.add(record.get("SellSt"));
				printer.printRecord(entries);
			}
			writer.flush();
		}
		printer.close();
	}

	@Test
	public void stats() throws Exception {
		String path = "/Users/vcarvalho/Downloads";
		File file = new File(path+"/sample.csv");
		Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(new FileReader(file));
		double max[] = new double[6];
		for(int i=0;i<max.length;i++){
			max[i] = Double.MIN_VALUE;
		}
		int counter =0;

		for(CSVRecord record : records){
			max[0] = Math.max(max[0],Double.valueOf(record.get(1)));
			max[1] = Math.max(max[1],Double.valueOf(record.get(2)));
			max[2] = Math.max(max[2],Double.valueOf(record.get(3)));
			max[3] = Math.max(max[3],Double.valueOf(record.get(4)));
			max[4] = Math.max(max[4],Double.valueOf(record.get(5)));
			max[5] = Math.max(max[5],Double.valueOf(statesMap.get(record.get(6))));
			counter++;
		}
		CSVFormat format = CSVFormat.DEFAULT;
		File outputFile = new File(path+"/sample_normalized.csv");
		FileWriter writer = new FileWriter(outputFile);
		CSVPrinter printer = new CSVPrinter(writer,format);
		records = CSVFormat.RFC4180.parse(new FileReader(file));
		for(CSVRecord record : records){
			List<Double> entries = new ArrayList<>();
			entries.add(Double.valueOf(record.get(0)));
			entries.add(Double.valueOf(record.get(1))/max[0]);
			entries.add(Double.valueOf(record.get(2))/max[1]);
			entries.add(Double.valueOf(record.get(3))/max[2]);
			entries.add(Double.valueOf(record.get(4))/max[3]);
			entries.add(Double.valueOf(record.get(5))/max[4]);
			entries.add(Double.valueOf(statesMap.get(record.get(6)))/max[5]);
			printer.printRecord(entries);
		}
		writer.flush();
		System.out.println(max + " : " + counter);
	}

}
