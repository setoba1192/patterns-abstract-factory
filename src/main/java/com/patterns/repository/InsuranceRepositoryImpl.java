package com.patterns.repository;

import org.springframework.stereotype.Repository;

import com.patterns.factory.Factory;
import com.patterns.factory.FactoryProvider;
import com.patterns.util.Constant;

@Repository
public class InsuranceRepositoryImpl implements InsuranceRepository<Object> {

	Factory<Object> abstractFactory;

	@Override
	public Object findInsuranceByType(String insuranceType) {

		return FactoryProvider.getFactory(Constant.FactoryTypeProvider.INSURANCE_FACTORY).create(insuranceType);
	}

}
