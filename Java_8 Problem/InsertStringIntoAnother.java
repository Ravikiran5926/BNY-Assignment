package com.bny.java_Q4;

import java.util.Arrays;
import java.util.List;

public class InsertStringIntoAnother 
{
		public static void main(String[] args) {

			List<String> list = Arrays.asList("hello ", " world");

			StringBuilder sb = new StringBuilder();
			list.forEach(sb::append);
			
			System.out.println(sb.insert(5, " my"));

		System.out.println(sb);
	}

	}

