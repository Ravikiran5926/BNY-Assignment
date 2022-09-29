package com.bny.java_Q3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//  Que -3 User will be asked to enter two integer like 
// 1 34 or 2 44 or 3 151 or 4 454. 
// 1 to check given no is even, 2 for odd number, 3 for Armstrong number,
// 4 for palindrome number.

public class Even_Odd_Number {

	public static void main(String[] args) {
		
	List<Integer> number=Arrays.asList(34,44,151,454);
	      displayEvenNumber(number); 
		  displayOddNumber(number);
 }
	private static void displayOddNumber(List<Integer> num) 
	{
	  System.out.println("Odd Number");
	  num.stream().filter((number)->number %2!=0).forEach(System.out::println);	
	}
	private static void displayEvenNumber(List<Integer> num) 
	{
		  System.out.println("Even Number");
		  num.stream().filter((number)->number %2==0).forEach(System.out::println);			
	}
	
}
