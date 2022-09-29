package com.bny.java_Q2;

import java.util.Arrays;

//2.WAP to check the given sequence of character in given string. 
//Suppose that you are given following string  “Taj is situated in Agra.”
//And you have to find following sequence AST. AST should be one after another. 
//f you found sta, or tas, or tsa it should print string not found. 

public class Sequence {

	public static void main(String[] args) {
		String given[] = {"Taj is situated in Agra"};
		String find="ast";
		boolean anyMatch = Arrays.stream(given).anyMatch(s->s.contains(find));
		//System.out.println(anyMatch);
		if(anyMatch==true) {
			System.out.println(find+" String found");
		}
	 System.out.println(find+" String not found");
		
 }

}
