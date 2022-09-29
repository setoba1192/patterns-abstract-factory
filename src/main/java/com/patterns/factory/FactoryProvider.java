package com.patterns.factory;

import com.patterns.util.Constant;

public class FactoryProvider {
	public static Factory<?> getFactory(Constant.FactoryTypeProvider factoryProvider) {

		if (Constant.FactoryTypeProvider.INSURANCE_FACTORY == factoryProvider) {
			return new InsuranceFactory();
		}
		return null;
	}
}