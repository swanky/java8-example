package io.github.swanky.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
	private final String name;
	private final int age;
}
