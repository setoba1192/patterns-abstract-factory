package com.patterns.util;

public class Constant {

	private Constant() {

	}

	public class InsuranceFactoryName {

		public static final String VEHICLE_INSURANCE = "VEHICLE_INSURANCE";

		public static final String PERSON_INSURANCE = "PERSON_INSURANCE";

		public static final String PROPERTY_INSURANCE = "PROPERTY_INSURANCE";

		private InsuranceFactoryName() {

		}

	}

	public enum FactoryTypeProvider {

		INSURANCE_FACTORY

	}

}
