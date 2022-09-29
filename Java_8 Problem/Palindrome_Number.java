package com.bny.java_Q1;

import java.util.List;
import java.util.stream.IntStream;

//1.WAP to check the given no is palindrome or not. Don’t use divide method. 

public class Palindrome_Number {

	public static boolean isPalindrome(int number) {

	    return number == IntStream.iterate(number, i -> i / 10)
	        .map(n -> n % 10)
	        .limit(String.valueOf(number).length())
	        .reduce(0, (a, b) -> a = a * 10 + b);
	}
	
	public static void main(String[] args) {
		
	Boolean palindrome=Palindrome_Number.isPalindrome(151);
		System.out.println(palindrome);
	 }
}
