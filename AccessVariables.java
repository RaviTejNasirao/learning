package com.learning.test;

import com.learning.Variables;
import com.learning.VariablesRedundant;

public class AccessVariables {
	
	
	

	public static void main(String[] args) {
		
		Variables myVariable = new Variables();
		VariablesRedundant redundantVariable = new VariablesRedundant();
		
		System.out.println(myVariable.weight);
		System.out.println(redundantVariable.weight);
	}

}
