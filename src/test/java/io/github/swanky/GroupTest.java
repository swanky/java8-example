package io.github.swanky;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import io.github.swanky.model.Person;
import io.github.swanky.model.Pet;

public class GroupTest {
	@Test
	public void test() {
		Group group = new Group();

		Person person1 = new Person("John", "USA", "NYC", new Pet("Max", 5));
		Person person2 = new Person("Steve", "UK", "London", new Pet("Lucy", 8));
		Person person3 = new Person("Anna", "USA", "NYC", new Pet("Buddy", 12));
		Person person4 = new Person("Mike", "USA", "Chicago", new Pet("Duke", 10));

		List<Person> persons = Arrays.asList(person1, person2, person3, person4);

		group.singleLevelGrouping(persons);
		group.twoLevelGrouping(persons);
		group.threeLevelGrouping(persons);
	}
}
