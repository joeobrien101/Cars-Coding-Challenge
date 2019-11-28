package com.esure.cars.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.esure.cars.model.Car;
import com.esure.cars.model.CarWrapper;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Joe
 *
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    /**
     * Gets the lists of cars.
     * @param colour the car's colour (passed from a request parameter).
     * @throws IOException if the input file cannot be found.
     * @return a list of cars corresponding to the colour parameter.
     */
	@GetMapping
	public List<Car> getCars(@RequestParam(required=false) String colour) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
        
		
		CarWrapper wrapper = mapper.readValue(new File("src/main/resources/json/cars.json"), CarWrapper.class);
		List<Car> cars = wrapper.getCars();
		List<Car> selectedCars = new ArrayList<>();
		
		if(colour==null) {
			return cars;
		}
		for(Car car : cars) {
			if(car.getColour().equals(colour)) {
				selectedCars.add(car);
			}
		}
		return selectedCars;
	}
}
