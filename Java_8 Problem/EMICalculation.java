package com.bny.java_Q7;

public class EMICalculation {
	public static void main(String[] args) {

		EMIResult r = new EMIResult();
		EMI c;
		double d = 0;
		c = EMIResult.emiCalculation();

		d = r.input(c, 1200, 10, 12, 1);

		System.out.println(d);

	}

}

