package com.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Nested;

public class CheckLeapYearNestedTestCases {
	
	@Nested
	class NestedTest {
		
		@Test(expected = InvalidLeapYearExeption.class)
		public void testInvalidYear() throws InvalidLeapYearExeption {
			assertEquals(true, CheckLeapYear.isLeapYear(1580), 
					"isLeapYear method should Throw Exception, if given year less than 1582");
		}

		@Test
		public void testYearDivByFourHun() throws InvalidLeapYearExeption {
			assertEquals(true, CheckLeapYear.isLeapYear(2000), 
					"isLeapYear method should return the boolean true, if leap year");
		}
		
		@Test
		public void divByHunNotByFourHun() throws InvalidLeapYearExeption {
			assertEquals(false, CheckLeapYear.isLeapYear(1700), 
					"isLeapYear method should return the boolean false, if not leap year");
		}
		
		@Test
		public void divByFourNotByHun() throws InvalidLeapYearExeption {
			assertEquals(true, CheckLeapYear.isLeapYear(2008), 
					"isLeapYear method should return the boolean true, if leap year");
		}
		
		@Test
		public void notDivByFour() throws InvalidLeapYearExeption {
			assertEquals(false, CheckLeapYear.isLeapYear(2017), 
					"isLeapYear method should return the boolean false, if not leap year");
		}
		
	}
	
}
