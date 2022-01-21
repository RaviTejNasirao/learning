package com.learning;

public class TestVariables {
	
	
	

	public static void main(String[] args) {
		
		Variables myVariable = new Variables();
		
		Variables.printStaticMessage();
		
		System.out.println(Variables.distance);
		
		System.out.println(myVariable.weight);
		
		myVariable.printMessage();
		
		myVariable.printNumber(54);
		
		System.out.println(myVariable.addNumbers(1, 2));
		
	}

}
