package com.patterns.model;

public abstract class Insurance {

	private int id;

	private String name;

	private String beneficiary;

	private int numOfYears;

	private Double baseValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public int getNumOfYears() {
		return numOfYears;
	}

	public void setNumOfYears(int numOfYears) {
		this.numOfYears = numOfYears;
	}

	public Double getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(Double baseValue) {
		this.baseValue = baseValue;
	}

	public abstract Double calculateTotalCost();

}
