package com.patterns.model;

import java.time.YearMonth;

public class VehicleInsurance extends Insurance {

	private String licensePlate;

	private int category;

	private int model;

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public Double calculateTotalCost() {

		int currentYear = YearMonth.now().getYear();

		return (double) (category * super.getBaseValue() + (100000 * (currentYear - model)));
	}

}
