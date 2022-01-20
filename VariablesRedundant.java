package com.learning;

public class VariablesRedundant {
	
	// Refer diagram for images.
	// https://www.geeksforgeeks.org/how-many-types-of-memory-areas-are-allocated-by-jvm/
	
	// instance variable will be inside a class but not within a method.
	// stored in heap memory
	public int weight = 102;
	
	// Final Variable can never be changed or assigned a new value
	// When we try to assign a new value, we get java.lang.Error 
	/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The final field Variables.earthGravity cannot be assigned
		at com.learning.Variables.main(Variables.java:20)*/
	final float earthGravity = 9.8f;
	
	public void getValues() {

		// local variable will be inside a method/function
		// stored in stack memory
		float temperature = 100.1f;
		
	}

}
