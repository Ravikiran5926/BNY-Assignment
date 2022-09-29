package com.bny.java_StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStateCity {

	public static void main(String[] args) {

		List<City> cs = Arrays.asList(
				new City(1, "mumbai", new State(101, "maharashtra"), 9.5f, 500000, 493),
				new City(2, "nagar", new State(101, "maharashtra"), 7.7f, 400000, 393),
				new City(3, "hydrabad", new State(102, "telangana"), 5.8f, 350000, 450),
				new City(4, "jalgaon", new State(102, "telangana"), 8f, 650000, 350),
				new City(5, "delhi", new State(103, "bihar"), 6f, 450000, 500),
				new City(6, "solapur", new State(103, "bihar"), 8.6f, 600000, 300));

		System.out.println("find city with less area and highest population");
		List<City> value = cs.stream().sorted(
				Comparator.comparing(City::getPopulation).thenComparing(City::getArea_of_city).reversed())
				.limit(1).collect(Collectors.toList());
		System.out.println(value);
		
        System.out.println("***************************************************************************");
        
		System.out.println("find city with high population index and high city area");
		List<City> value1 = cs.stream().sorted(Comparator.comparing(City::getPollutionIndex)
				.thenComparing(City::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value1);
		
		 System.out.println("***************************************************************************");

		System.out.println("print city with less population index first");
		List<City> value2 = cs.stream().sorted(Comparator.comparing(City::getPollutionIndex))
				.collect(Collectors.toList());
		System.out.println(value2);
		
		 System.out.println("***************************************************************************");
	       
		System.out.println("print city with lowest population index and lowest area");
		List<City> value3 = cs.stream()
				.sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city))
				.limit(1).collect(Collectors.toList());
		System.out.println(value3);
		
		 System.out.println("***************************************************************************");
	        
		System.out.println("count how many city in state");
		long count = cs.stream().map(City::getCityname).count();
		System.out.println(count);
		
		 System.out.println("***************************************************************************");
	        
		System.out.println("total area of each state");
		long sum = cs.stream().collect(Collectors.summingLong(City::getArea_of_city));
		System.out.println(sum);

	}
}

