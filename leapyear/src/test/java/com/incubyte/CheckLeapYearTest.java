package com.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckLeapYearTest {
	
	/*
	 * Test the Year which are less than 1582
	 * Because These leap year rules were introduced in 1582 by the Gregorian Calendar, Named after Pope Gregory XIII.
	 */
	@Test(expected = InvalidLeapYearExeption.class)
	public void testInvalidYear() throws InvalidLeapYearExeption {
		assertEquals(true, CheckLeapYear.isLeapYear(1580), 
				"isLeapYear method should Throw Exception, if given year less than 1582");
	}
	

	//Test the Year Divisible By 400. Example years 2000, 2400, 4000
	@Test
	public void testYearDivByFourHun() throws InvalidLeapYearExeption {
		assertEquals(true, CheckLeapYear.isLeapYear(2000), 
				"isLeapYear method should return the boolean true, if leap year");
	}
	
	
	//Test the Year Divisible By 100, But Not By 400. Example years 1700, 1800, 1900, 2100, etc.
	@Test
	public void divByHunNotByFourHun() throws InvalidLeapYearExeption {
		assertEquals(false, CheckLeapYear.isLeapYear(1700), 
				"isLeapYear method should return the boolean false, if not leap year");
	}
	
	
	//Test the Year Divisible By 4, But Not By 100. Example years 2008, 2012, 2016, etc.
	@Test
	public void divByFourNotByHun() throws InvalidLeapYearExeption {
		assertEquals(true, CheckLeapYear.isLeapYear(2008), 
				"isLeapYear method should return the boolean true, if leap year");
	}
	

	//Test the Year Not Divisible By 4. Example years 2017, 2018, 2019, etc.
	@Test
	public void notDivByFour() throws InvalidLeapYearExeption {
		assertEquals(false, CheckLeapYear.isLeapYear(2017), 
				"isLeapYear method should return the boolean false, if not leap year");
	}
	
	
}
