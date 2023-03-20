package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.api.ExpectationError;
import org.junit.Test;
import java.security.InvalidParameterException;

public class testCalculateColumnTotal extends DataUtilities {

	@Test(expected = ExpectationError.class) //Expecting an error where it is trying to grab a column out of bounds
	public void testInvalidColumn() {
		Mockery mockingContext = new Mockery(); //Mock a 2Dvalues class with one column and two rows
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() {
	         {
	             one(values).getRowCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(7.5));
	             one(values).getValue(1, 0);
	             will(returnValue(2.5));
	         }
	     });
	     double result = DataUtilities.calculateColumnTotal(values, 47); //try to execute on an invalid row
	}
	@Test(expected = Exception.class) //Expecting an invalid parameter exception
	public void testInvalidParameter() {
		Values2D data = null;
		double result = DataUtilities.calculateColumnTotal(data, 0); //inserting a null data type
	}
	@Test(expected = ExpectationError.class) //expecting that there isnt a negative row so an expectation error
	public void testNegativeColumn() {
		Mockery mockingContext = new Mockery(); //mock a 2D value object with 1 column 2 rows
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() {
	         {
	             one(values).getRowCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(7.5));
	             one(values).getValue(1, 0);
	             will(returnValue(2.5));
	         }
	     });
	     double result = DataUtilities.calculateColumnTotal(values, -1); //try and calculate for negative column
	}
	
	
	@Test
	public void testShouldWork() {//this is a working test with valid values and column called
		// setup
	     Mockery mockingContext = new Mockery(); //mock a 2D value object with 1 column 2 rows
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() {
	         {
	             one(values).getRowCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(7.5));
	             one(values).getValue(1, 0);
	             will(returnValue(2.5));
	         }
	     });
	     double result = DataUtilities.calculateColumnTotal(values, 0); // get the result
	     // verify
	     assertEquals(10.0, result, .000000001d);// because values are addition of 7.5 and 2.5 expected is 10.0
	     // tear-down: NONE in this test method
	}
	@Test
	public void emptyDataSet() { //Test if we return a null value as one of the values
		// setup
	     Mockery mockingContext = new Mockery();//mock a 2D value object with 1 column 2 rows but 1 value is null
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() {
	         {
	             one(values).getRowCount();
	             will(returnValue(0));
	             one(values).getColumnCount();
	             will(returnValue(0));
	         }
	     });
	     double result = DataUtilities.calculateColumnTotal(values, 0); //get the result of the addition
	     assertEquals(0, result, .000000001d);//should be 0 as per documentation of invalid value
	}


}
