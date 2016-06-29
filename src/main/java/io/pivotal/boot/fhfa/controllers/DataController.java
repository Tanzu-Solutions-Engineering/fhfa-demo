package io.pivotal.boot.fhfa.controllers;

import java.util.List;

import io.pivotal.boot.fhfa.repository.MortageLoanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinicius Carvalho
 */
@RequestMapping("/data")
@RestController
public class DataController {

	private MortageLoanRepository repository;

	@Autowired
	public DataController(MortageLoanRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/region")
	public List<Object[]> getRegionData(@RequestParam("type")String type){
		List<Object[]> data = null;
		switch (type){
			case "income" :
			data = repository.averageIncomePerState();
			break;
			case "amount" :
			data = repository.averageAmountPerState();
			break;

		}
		return data;
	}

}
