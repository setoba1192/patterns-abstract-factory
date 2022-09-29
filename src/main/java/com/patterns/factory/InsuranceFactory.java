package com.patterns.factory;

import com.patterns.model.Insurance;
import com.patterns.model.LifeInsurance;
import com.patterns.model.PropertyInsurance;
import com.patterns.model.VehicleInsurance;
import com.patterns.util.Constant;

public class InsuranceFactory implements Factory<Insurance> {

	@Override
	public Insurance create(String insuranceType) {

		switch (insuranceType) {
		case Constant.InsuranceFactoryName.PERSON_INSURANCE: {

			return new LifeInsurance();
		}
		case Constant.InsuranceFactoryName.VEHICLE_INSURANCE: {

			return new VehicleInsurance();
		}
		case Constant.InsuranceFactoryName.PROPERTY_INSURANCE: {

			return new PropertyInsurance();
		}
		default:
			throw new IllegalArgumentException("Not kind of Insurance found: " + insuranceType);
		}
	}

}
