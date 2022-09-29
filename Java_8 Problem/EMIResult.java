package com.bny.java_Q7;

public class EMIResult {

	public double input(EMI c,double principal,double rate, double time, double emi ) {
		return c.calculate(principal, rate, time,emi);
	}
	
	public static EMI emiCalculation() {
		EMI c1=(principal,rate,time,emi)->(principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
		return c1;
	}
}
