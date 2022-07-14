package com.assignment.java8ArrayToMapSet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args)
	{

		// create a list
		List<Employee> lt = new ArrayList<>();

		// add the member of list
		lt.add(new Employee(1, "jamjam"));
		lt.add(new Employee(2, "Dinesh"));
		lt.add(new Employee(3, "sindhi"));
		lt.add(new Employee(4, "Kalu"));
		lt.add(new Employee(5, "arvind"));
		lt.add(new Employee(6, "Vinay"));
		lt.add(new Employee(7, "Hari"));
		lt.add(new Employee(8, "Rani"));
		lt.add(new Employee(9, "Avinash"));

		
		LinkedHashMap<Integer, String>
			map = lt.stream()
					.collect(
						Collectors
							.toMap(
									Employee::getId,
									Employee::getName,
								(x, y)
									-> x + ", " + y,
								LinkedHashMap::new));

		// print map
		map.forEach(
			(x, y) -> System.out.println(x + "=" + y));
	}
}
