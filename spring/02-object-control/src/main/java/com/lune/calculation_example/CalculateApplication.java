package com.lune.calculation_example;

import com.lune.calculation_example.config.ApplicationConfig;
import com.lune.calculation_example.service.BusinessCalculationService;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculateApplication {
	
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
