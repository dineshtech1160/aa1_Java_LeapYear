package com.incubyte;

public class CheckLeapYear {
	
	public static boolean isLeapYear(long year) throws InvalidLeapYearExeption{
		
		if(year<1582)
			  throw new InvalidLeapYearExeption("Enter a Year from 1582 onwards."
					  + " " + "Because these leap year rules were introduced in 1582 by the Gregorian Calendar," 
					  + " " + "named after Pope Gregory XIII.");
		
		return ((isMultipleOf(year,4) && !isMultipleOf(year,100)) 
				|| isMultipleOf(year,400)); 
		
	}
	
	
	public static boolean isMultipleOf(long num, int base) {
		return ((num % base) == 0);
	}
	
	
	/*
	 * Comment below when running test class.
	 */
	
	/*public static void main(String[] args) {
		try{
			System.out.println(isLeapYear(1500));
		}
		catch (Exception e) {
			System.out.println("The execption occured: " + e);
		}
	}*/

}
