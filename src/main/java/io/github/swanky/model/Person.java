package io.github.swanky.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
	private final String name;
	private final String country;
	private final String city;
	private final Pet pet;
}
