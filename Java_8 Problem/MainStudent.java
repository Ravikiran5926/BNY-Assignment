package com.bny.java_StreamApi;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MainStudent {

public static void main(String[] args) {
		
		List l=Arrays.asList(
				new StudentStream(1, LocalDate.of(2021, 8, 23), LocalDate.of(2005,8,23), new StudentSubject(80, 70, 60, 40, 44), "10th"),
				new StudentStream(2, LocalDate.of(2021, 5, 22), LocalDate.of(2004,4,13), new StudentSubject(45, 62, 54, 44, 44), "10th"),
				new StudentStream(3, LocalDate.of(2021, 9, 26), LocalDate.of(2004,10,14), new StudentSubject(35, 37, 41, 46, 34), "10th"),
				new StudentStream(4, LocalDate.of(2021, 2, 28), LocalDate.of(2005,12,22), new StudentSubject(45, 51, 48, 42, 34), "10th"),
				new StudentStream(5, LocalDate.of(2021, 4, 19), LocalDate.of(2003,6,7), new StudentSubject(45, 65, 63, 40, 44), "10th"),
				new StudentStream(6, LocalDate.of(2021, 6, 3), LocalDate.of(2006,9,8), new StudentSubject(44, 75, 40, 83, 42), "10th")
				
				);
		System.out.println("student who scored less than 40%");
		l.stream().filter(null);
		
		
	}

}
