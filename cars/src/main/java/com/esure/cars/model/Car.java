package com.esure.cars.model;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Joe
 *
 */
@Data
@NoArgsConstructor
public class Car {
	
	private String brand;
	
	private String model;
	
	private String fuel;
	
	private int doors;
	
	private String colour;

}
