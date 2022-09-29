package com.patterns.model;

public class PropertyInsurance extends Insurance {

	private String propertyName;

	private String address;

	private int antiquityYears;

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAntiquityYears() {
		return antiquityYears;
	}

	public void setAntiquityYears(int antiquityYears) {
		this.antiquityYears = antiquityYears;
	}

	@Override
	public Double calculateTotalCost() {

		return (double) (super.getNumOfYears() * super.getBaseValue() + (10000 * antiquityYears));
	}

}
