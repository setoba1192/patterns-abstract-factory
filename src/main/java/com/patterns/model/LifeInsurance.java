package com.patterns.model;

import java.time.LocalDate;
import java.time.YearMonth;

public class LifeInsurance extends Insurance {

	private String secondBeneficiary;

	private LocalDate dateOfBirth;

	public String getSecondBeneficiary() {
		return secondBeneficiary;
	}

	public void setSecondBeneficiary(String secondBeneficiary) {
		this.secondBeneficiary = secondBeneficiary;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public Double calculateTotalCost() {

		int yearOfBirth = dateOfBirth.getYear();
		int currentYear = YearMonth.now().getYear();

		return (double) (super.getNumOfYears() * super.getBaseValue() + (1000 * (currentYear - yearOfBirth)));
	}

}
