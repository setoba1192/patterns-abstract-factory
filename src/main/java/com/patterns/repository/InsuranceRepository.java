package com.patterns.repository;

public interface InsuranceRepository<T> {

	public T findInsuranceByType(String insuranceType);

}
