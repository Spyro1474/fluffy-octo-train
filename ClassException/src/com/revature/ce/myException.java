package com.revature.ce;

public class myException extends Exception {
	
	public myException(int x) {				
		super();
		
		
		
		if (x > 4) {
			throw new ArithmeticException("x cannot be greater than 4");
				
			}			
			else
			System.out.println("x is correct");
			
			
		
			

	}
	
	

}
