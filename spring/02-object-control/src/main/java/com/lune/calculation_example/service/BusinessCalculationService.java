package com.lune.calculation_example.service;

import com.lune.calculation_example.repository.DataRepository;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class BusinessCalculationService {
	
	private DataRepository dataRepository;

	public BusinessCalculationService(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	public int findMax() {
		return Arrays.stream(dataRepository.retrieveData()).max().orElse(0);
	}
}
