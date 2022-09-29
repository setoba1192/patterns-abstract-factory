package com.patterns.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patterns.factory.Factory;
import com.patterns.factory.FactoryProvider;
import com.patterns.model.VehicleInsurance;
import com.patterns.repository.InsuranceRepository;
import com.patterns.util.Constant;

@Service
public class InsuranceService {

	private InsuranceRepository<Object> insuranceRepository;

	Factory<Object> factory;

	@Autowired
	public InsuranceService(InsuranceRepository<Object> insuranceRepository) {
		this.insuranceRepository = insuranceRepository;
	}

	public Object findInsuranceByType(String insuranceType) {
		return insuranceRepository.findInsuranceByType(insuranceType);
	}

	public Object calculateVehicleInsurance(int model, int category, String licensePlate) {
		VehicleInsurance vehicleInsurance = (VehicleInsurance) FactoryProvider
				.getFactory(Constant.FactoryTypeProvider.INSURANCE_FACTORY)
				.create(Constant.InsuranceFactoryName.VEHICLE_INSURANCE);

		vehicleInsurance.setBaseValue((double) 200);
		vehicleInsurance.setModel(model);
		vehicleInsurance.setCategory(category);
		vehicleInsurance.setLicensePlate(licensePlate);

		vehicleInsurance.setBaseValue(vehicleInsurance.calculateTotalCost());

		return vehicleInsurance;
	}

}
