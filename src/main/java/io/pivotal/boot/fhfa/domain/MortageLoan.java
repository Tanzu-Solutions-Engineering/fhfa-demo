package io.pivotal.boot.fhfa.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Vinicius Carvalho
 */
@Entity
@javax.persistence.Table(name = "ama_pudb_export_123114")
public class MortageLoan {
	
	@javax.persistence.Column(name = "Year", nullable = true)

	private Integer year;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Id
	@javax.persistence.Column(name = "LoanNumber", nullable = false)
	private int loanNumber;

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	
	@javax.persistence.Column(name = "FHLBankID", nullable = true)
	private String fhlBankId;

	public String getFhlBankId() {
		return fhlBankId;
	}

	public void setFhlBankId(String fhlBankId) {
		this.fhlBankId = fhlBankId;
	}

	
	@javax.persistence.Column(name = "Program", nullable = true)
	private String program;

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	
	@javax.persistence.Column(name = "FIPSStateCode", nullable = true)
	private String fipsStateCode;

	public String getFipsStateCode() {
		return fipsStateCode;
	}

	public void setFipsStateCode(String fipsStateCode) {
		this.fipsStateCode = fipsStateCode;
	}

	
	@javax.persistence.Column(name = "FIPSCountyCode", nullable = true)
	private String fipsCountyCode;

	public String getFipsCountyCode() {
		return fipsCountyCode;
	}

	public void setFipsCountyCode(String fipsCountyCode) {
		this.fipsCountyCode = fipsCountyCode;
	}

	
	@javax.persistence.Column(name = "MSA", nullable = true)
	private Integer msa;

	public Integer getMsa() {
		return msa;
	}

	public void setMsa(Integer msa) {
		this.msa = msa;
	}

	
	@javax.persistence.Column(name = "FeatureID", nullable = true)
	private String featureId;

	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	
	@javax.persistence.Column(name = "Tract", nullable = true)
	private String tract;

	public String getTract() {
		return tract;
	}

	public void setTract(String tract) {
		this.tract = tract;
	}

	
	@javax.persistence.Column(name = "MinPer", nullable = true, precision = 0)
	private Double minPer;

	public Double getMinPer() {
		return minPer;
	}

	public void setMinPer(Double minPer) {
		this.minPer = minPer;
	}

	
	@javax.persistence.Column(name = "TraMedY", nullable = true)
	private Integer traMedY;

	public Integer getTraMedY() {
		return traMedY;
	}

	public void setTraMedY(Integer traMedY) {
		this.traMedY = traMedY;
	}

	
	@javax.persistence.Column(name = "LocMedY", nullable = true)
	private Integer locMedY;

	public Integer getLocMedY() {
		return locMedY;
	}

	public void setLocMedY(Integer locMedY) {
		this.locMedY = locMedY;
	}

	
	@javax.persistence.Column(name = "Tractrat", nullable = true, precision = 0)
	private Double tractrat;

	public Double getTractrat() {
		return tractrat;
	}

	public void setTractrat(Double tractrat) {
		this.tractrat = tractrat;
	}

	
	@javax.persistence.Column(name = "Income", nullable = true)
	private Integer income;

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	
	@javax.persistence.Column(name = "CurAreY", nullable = true)
	private Integer curAreY;

	public Integer getCurAreY() {
		return curAreY;
	}

	public void setCurAreY(Integer curAreY) {
		this.curAreY = curAreY;
	}

	
	@javax.persistence.Column(name = "IncRat", nullable = true, precision = 0)
	private Double incRat;

	public Double getIncRat() {
		return incRat;
	}

	public void setIncRat(Double incRat) {
		this.incRat = incRat;
	}

	
	@javax.persistence.Column(name = "UPB", nullable = true)
	private Integer upb;

	public Integer getUpb() {
		return upb;
	}

	public void setUpb(Integer upb) {
		this.upb = upb;
	}

	
	@javax.persistence.Column(name = "LTV", nullable = true, precision = 0)
	private Double ltv;

	public Double getLtv() {
		return ltv;
	}

	public void setLtv(Double ltv) {
		this.ltv = ltv;
	}

	
	@javax.persistence.Column(name = "MortDate", nullable = true)
	private Integer mortDate;

	public Integer getMortDate() {
		return mortDate;
	}

	public void setMortDate(Integer mortDate) {
		this.mortDate = mortDate;
	}

	
	@javax.persistence.Column(name = "AcquDate", nullable = true)
	private Integer acquDate;

	public Integer getAcquDate() {
		return acquDate;
	}

	public void setAcquDate(Integer acquDate) {
		this.acquDate = acquDate;
	}

	
	@javax.persistence.Column(name = "Purpose", nullable = true)
	private Integer purpose;

	public Integer getPurpose() {
		return purpose;
	}

	public void setPurpose(Integer purpose) {
		this.purpose = purpose;
	}

	
	@javax.persistence.Column(name = "Coop", nullable = true)
	private Integer coop;

	public Integer getCoop() {
		return coop;
	}

	public void setCoop(Integer coop) {
		this.coop = coop;
	}

	
	@javax.persistence.Column(name = "Product", nullable = true)
	private Integer product;

	public Integer getProduct() {
		return product;
	}

	public void setProduct(Integer product) {
		this.product = product;
	}

	
	@javax.persistence.Column(name = "FedGuar", nullable = true)
	private Integer fedGuar;

	public Integer getFedGuar() {
		return fedGuar;
	}

	public void setFedGuar(Integer fedGuar) {
		this.fedGuar = fedGuar;
	}

	
	@javax.persistence.Column(name = "Term", nullable = true)
	private Integer term;

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	
	@javax.persistence.Column(name = "AmorTerm", nullable = true)
	private Integer amorTerm;

	public Integer getAmorTerm() {
		return amorTerm;
	}

	public void setAmorTerm(Integer amorTerm) {
		this.amorTerm = amorTerm;
	}

	
	@javax.persistence.Column(name = "FHFBID", nullable = true)
	private String fhfbid;

	public String getFhfbid() {
		return fhfbid;
	}

	public void setFhfbid(String fhfbid) {
		this.fhfbid = fhfbid;
	}

	
	@javax.persistence.Column(name = "Seller", nullable = true)
	private String seller;

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	
	@javax.persistence.Column(name = "SellCity", nullable = true)
	private String sellCity;

	public String getSellCity() {
		return sellCity;
	}

	public void setSellCity(String sellCity) {
		this.sellCity = sellCity;
	}

	
	@javax.persistence.Column(name = "SellSt", nullable = true)
	private String sellSt;

	public String getSellSt() {
		return sellSt;
	}

	public void setSellSt(String sellSt) {
		this.sellSt = sellSt;
	}

	
	@javax.persistence.Column(name = "SellType", nullable = true)
	private Integer sellType;

	public Integer getSellType() {
		return sellType;
	}

	public void setSellType(Integer sellType) {
		this.sellType = sellType;
	}

	
	@javax.persistence.Column(name = "NumBor", nullable = true)
	private Integer numBor;

	public Integer getNumBor() {
		return numBor;
	}

	public void setNumBor(Integer numBor) {
		this.numBor = numBor;
	}

	
	@javax.persistence.Column(name = "First", nullable = true)
	private Integer first;

	public Integer getFirst() {
		return first;
	}

	public void setFirst(Integer first) {
		this.first = first;
	}

	
	@javax.persistence.Column(name = "CICA", nullable = true)
	private Integer cica;

	public Integer getCica() {
		return cica;
	}

	public void setCica(Integer cica) {
		this.cica = cica;
	}

	private Integer boRace;

	
	@javax.persistence.Column(name = "BoRace", nullable = true)
	public Integer getBoRace() {
		return boRace;
	}

	public void setBoRace(Integer boRace) {
		this.boRace = boRace;
	}

	
	@javax.persistence.Column(name = "CoRace", nullable = true)
	private Integer coRace;

	public Integer getCoRace() {
		return coRace;
	}

	public void setCoRace(Integer coRace) {
		this.coRace = coRace;
	}

	
	@javax.persistence.Column(name = "BoGender", nullable = true)
	private Integer boGender;

	public Integer getBoGender() {
		return boGender;
	}

	public void setBoGender(Integer boGender) {
		this.boGender = boGender;
	}

	
	@javax.persistence.Column(name = "CoGender", nullable = true)
	private Integer coGender;

	public Integer getCoGender() {
		return coGender;
	}

	public void setCoGender(Integer coGender) {
		this.coGender = coGender;
	}

	
	@javax.persistence.Column(name = "BoAge", nullable = true)
	private Integer boAge;

	public Integer getBoAge() {
		return boAge;
	}

	public void setBoAge(Integer boAge) {
		this.boAge = boAge;
	}

	
	@javax.persistence.Column(name = "CoAge", nullable = true)
	private Integer coAge;

	public Integer getCoAge() {
		return coAge;
	}

	public void setCoAge(Integer coAge) {
		this.coAge = coAge;
	}

	
	@javax.persistence.Column(name = "Occup", nullable = true)
	private Integer occup;

	public Integer getOccup() {
		return occup;
	}

	public void setOccup(Integer occup) {
		this.occup = occup;
	}

	
	@javax.persistence.Column(name = "NumUnits", nullable = true)
	private Integer numUnits;

	public Integer getNumUnits() {
		return numUnits;
	}

	public void setNumUnits(Integer numUnits) {
		this.numUnits = numUnits;
	}

	
	@javax.persistence.Column(name = "Bed1", nullable = true)
	private Integer bed1;

	public Integer getBed1() {
		return bed1;
	}

	public void setBed1(Integer bed1) {
		this.bed1 = bed1;
	}

	
	@javax.persistence.Column(name = "Bed2", nullable = true)
	private Integer bed2;

	public Integer getBed2() {
		return bed2;
	}

	public void setBed2(Integer bed2) {
		this.bed2 = bed2;
	}

	
	@javax.persistence.Column(name = "Bed3", nullable = true)
	private Integer bed3;

	public Integer getBed3() {
		return bed3;
	}

	public void setBed3(Integer bed3) {
		this.bed3 = bed3;
	}

	
	@javax.persistence.Column(name = "Bed4", nullable = true)
	private Integer bed4;

	public Integer getBed4() {
		return bed4;
	}

	public void setBed4(Integer bed4) {
		this.bed4 = bed4;
	}

	
	@javax.persistence.Column(name = "Aff1", nullable = true)
	private Integer aff1;

	public Integer getAff1() {
		return aff1;
	}

	public void setAff1(Integer aff1) {
		this.aff1 = aff1;
	}

	
	@javax.persistence.Column(name = "Aff2", nullable = true)
	private Integer aff2;

	public Integer getAff2() {
		return aff2;
	}

	public void setAff2(Integer aff2) {
		this.aff2 = aff2;
	}

	
	@javax.persistence.Column(name = "Aff3", nullable = true)
	private Integer aff3;

	public Integer getAff3() {
		return aff3;
	}

	public void setAff3(Integer aff3) {
		this.aff3 = aff3;
	}

	
	@javax.persistence.Column(name = "Aff4", nullable = true)
	private Integer aff4;

	public Integer getAff4() {
		return aff4;
	}

	public void setAff4(Integer aff4) {
		this.aff4 = aff4;
	}

	
	@javax.persistence.Column(name = "Rent1", nullable = true)
	private Long rent1;

	public Long getRent1() {
		return rent1;
	}

	public void setRent1(Long rent1) {
		this.rent1 = rent1;
	}

	
	@javax.persistence.Column(name = "Rent2", nullable = true)
	private Long rent2;

	public Long getRent2() {
		return rent2;
	}

	public void setRent2(Long rent2) {
		this.rent2 = rent2;
	}

	
	@javax.persistence.Column(name = "Rent3", nullable = true)
	private Long rent3;

	public Long getRent3() {
		return rent3;
	}

	public void setRent3(Long rent3) {
		this.rent3 = rent3;
	}

	
	@javax.persistence.Column(name = "Rent4", nullable = true)
	private Long rent4;

	public Long getRent4() {
		return rent4;
	}

	public void setRent4(Long rent4) {
		this.rent4 = rent4;
	}

	
	@javax.persistence.Column(name = "RentUt1", nullable = true)
	private Long rentUt1;

	public Long getRentUt1() {
		return rentUt1;
	}

	public void setRentUt1(Long rentUt1) {
		this.rentUt1 = rentUt1;
	}

	
	@javax.persistence.Column(name = "RentUt2", nullable = true)
	private Long rentUt2;

	public Long getRentUt2() {
		return rentUt2;
	}

	public void setRentUt2(Long rentUt2) {
		this.rentUt2 = rentUt2;
	}

	
	@javax.persistence.Column(name = "RentUt3", nullable = true)
	private Long rentUt3;

	public Long getRentUt3() {
		return rentUt3;
	}

	public void setRentUt3(Long rentUt3) {
		this.rentUt3 = rentUt3;
	}

	
	@javax.persistence.Column(name = "RentUt4", nullable = true)
	private Long rentUt4;

	public Long getRentUt4() {
		return rentUt4;
	}

	public void setRentUt4(Long rentUt4) {
		this.rentUt4 = rentUt4;
	}

	
	@javax.persistence.Column(name = "Geog", nullable = true)
	private Integer geog;

	public Integer getGeog() {
		return geog;
	}

	public void setGeog(Integer geog) {
		this.geog = geog;
	}

	
	@javax.persistence.Column(name = "Rate", nullable = true, precision = 0)
	private Double rate;

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	
	@javax.persistence.Column(name = "Amount", nullable = true)
	private Integer amount;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	
	@javax.persistence.Column(name = "Front", nullable = true, precision = 0)
	private Double front;

	public Double getFront() {
		return front;
	}

	public void setFront(Double front) {
		this.front = front;
	}

	
	@javax.persistence.Column(name = "Back", nullable = true, precision = 0)
	private Double back;

	public Double getBack() {
		return back;
	}

	public void setBack(Double back) {
		this.back = back;
	}

	
	@javax.persistence.Column(name = "BorrowerCreditScore", nullable = true)
	private Integer borrowerCreditScore;

	public Integer getBorrowerCreditScore() {
		return borrowerCreditScore;
	}

	public void setBorrowerCreditScore(Integer borrowerCreditScore) {
		this.borrowerCreditScore = borrowerCreditScore;
	}

	
	@javax.persistence.Column(name = "CoBorrowerCreditScore", nullable = true)
	private Integer coBorrowerCreditScore;

	public Integer getCoBorrowerCreditScore() {
		return coBorrowerCreditScore;
	}

	public void setCoBorrowerCreditScore(Integer coBorrowerCreditScore) {
		this.coBorrowerCreditScore = coBorrowerCreditScore;
	}

	
	@javax.persistence.Column(name = "PMI", nullable = true, precision = 0)
	private Double pmi;

	public Double getPmi() {
		return pmi;
	}

	public void setPmi(Double pmi) {
		this.pmi = pmi;
	}

	
	@javax.persistence.Column(name = "Self", nullable = true)
	private Integer self;

	public Integer getSelf() {
		return self;
	}

	public void setSelf(Integer self) {
		this.self = self;
	}

	
	@javax.persistence.Column(name = "PropType", nullable = true)
	private String propType;

	public String getPropType() {
		return propType;
	}

	public void setPropType(String propType) {
		this.propType = propType;
	}

	
	@javax.persistence.Column(name = "ArmIndex", nullable = true)
	private Integer armIndex;

	public Integer getArmIndex() {
		return armIndex;
	}

	public void setArmIndex(Integer armIndex) {
		this.armIndex = armIndex;
	}

	
	@javax.persistence.Column(name = "ArmMarg", nullable = true)
	private Integer armMarg;

	public Integer getArmMarg() {
		return armMarg;
	}

	public void setArmMarg(Integer armMarg) {
		this.armMarg = armMarg;
	}

	
	@javax.persistence.Column(name = "PrepayP", nullable = true)
	private String prepayP;

	public String getPrepayP() {
		return prepayP;
	}

	public void setPrepayP(String prepayP) {
		this.prepayP = prepayP;
	}

	
	@javax.persistence.Column(name = "BoEth", nullable = true)
	private Integer boEth;

	public Integer getBoEth() {
		return boEth;
	}

	public void setBoEth(Integer boEth) {
		this.boEth = boEth;
	}

	
	@javax.persistence.Column(name = "Race2", nullable = true)
	private Integer race2;

	public Integer getRace2() {
		return race2;
	}

	public void setRace2(Integer race2) {
		this.race2 = race2;
	}

	
	@javax.persistence.Column(name = "Race3", nullable = true)
	private Integer race3;

	public Integer getRace3() {
		return race3;
	}

	public void setRace3(Integer race3) {
		this.race3 = race3;
	}

	
	@javax.persistence.Column(name = "Race4", nullable = true)
	private Integer race4;

	public Integer getRace4() {
		return race4;
	}

	public void setRace4(Integer race4) {
		this.race4 = race4;
	}

	
	@javax.persistence.Column(name = "Race5", nullable = true)
	private Integer race5;

	public Integer getRace5() {
		return race5;
	}

	public void setRace5(Integer race5) {
		this.race5 = race5;
	}

	
	@javax.persistence.Column(name = "CoEth", nullable = true)
	private Integer coEth;

	public Integer getCoEth() {
		return coEth;
	}

	public void setCoEth(Integer coEth) {
		this.coEth = coEth;
	}

	
	@javax.persistence.Column(name = "Corace2", nullable = true)
	private Integer corace2;

	public Integer getCorace2() {
		return corace2;
	}

	public void setCorace2(Integer corace2) {
		this.corace2 = corace2;
	}

	
	@javax.persistence.Column(name = "Corace3", nullable = true)
	private Integer corace3;

	public Integer getCorace3() {
		return corace3;
	}

	public void setCorace3(Integer corace3) {
		this.corace3 = corace3;
	}

	
	@javax.persistence.Column(name = "Corace4", nullable = true)
	private Integer corace4;

	public Integer getCorace4() {
		return corace4;
	}

	public void setCorace4(Integer corace4) {
		this.corace4 = corace4;
	}

	
	@javax.persistence.Column(name = "Corace5", nullable = true)
	private Integer corace5;

	public Integer getCorace5() {
		return corace5;
	}

	public void setCorace5(Integer corace5) {
		this.corace5 = corace5;
	}

	
	@javax.persistence.Column(name = "HOEPA", nullable = true)
	private Integer hoepa;

	public Integer getHoepa() {
		return hoepa;
	}

	public void setHoepa(Integer hoepa) {
		this.hoepa = hoepa;
	}

	
	@javax.persistence.Column(name = "LienStatus", nullable = true)
	private Integer lienStatus;

	public Integer getLienStatus() {
		return lienStatus;
	}

	public void setLienStatus(Integer lienStatus) {
		this.lienStatus = lienStatus;
	}

	
	@javax.persistence.Column(name = "SpcHsgGoals", nullable = true)
	private Integer spcHsgGoals;

	public Integer getSpcHsgGoals() {
		return spcHsgGoals;
	}

	public void setSpcHsgGoals(Integer spcHsgGoals) {
		this.spcHsgGoals = spcHsgGoals;
	}

	
	@javax.persistence.Column(name = "FedFinStbltyPlan", nullable = true)
	private Integer fedFinStbltyPlan;

	public Integer getFedFinStbltyPlan() {
		return fedFinStbltyPlan;
	}

	public void setFedFinStbltyPlan(Integer fedFinStbltyPlan) {
		this.fedFinStbltyPlan = fedFinStbltyPlan;
	}

	
	@javax.persistence.Column(name = "AcqTyp", nullable = true)
	private Integer acqTyp;

	public Integer getAcqTyp() {
		return acqTyp;
	}

	public void setAcqTyp(Integer acqTyp) {
		this.acqTyp = acqTyp;
	}

	
	@javax.persistence.Column(name = "GSEREO", nullable = true)
	private Integer gsereo;

	public Integer getGsereo() {
		return gsereo;
	}

	public void setGsereo(Integer gsereo) {
		this.gsereo = gsereo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MortageLoan that = (MortageLoan) o;

		return loanNumber == that.loanNumber;

	}

	@Override
	public int hashCode() {
		return loanNumber;
	}
}
