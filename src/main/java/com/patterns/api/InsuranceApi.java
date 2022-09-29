package com.patterns.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patterns.service.InsuranceService;

@RestController
@RequestMapping("api/insurance")
public class InsuranceApi {

	@Autowired
	private InsuranceService insuranceService;

	@GetMapping("/type/{type}")
	public Object findInsuranceByType(@PathVariable(name = "type") String insuranceType) {
		return insuranceService.findInsuranceByType(insuranceType);

	}

	@GetMapping("/vehicle-calculate/licensePlate/{licensePlate}/model/{model}/category/{category}")
	public Object calculateVehicleInsurance(@PathVariable String licensePlate, @PathVariable int model,
			@PathVariable int category) {
		return insuranceService.calculateVehicleInsurance(model, category, licensePlate);

	}

}
