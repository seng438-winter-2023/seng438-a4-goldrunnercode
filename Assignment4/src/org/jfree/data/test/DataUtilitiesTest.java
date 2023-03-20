package org.jfree.data.test;

import static org.junit.Assert.*;



import java.security.InvalidParameterException;
import java.security.InvalidParameterException;

import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValue;
import org.jfree.data.KeyedValues;
import org.junit.Test;

public class DataUtilitiesTest extends DataUtilities {

	
	@Test
	public void equalDoubleArrayCorrect() {
		double[][] a = {{1,2,3}};
		double[][] b = {{1 , 2, 3}};
		assertTrue("The arrays are equal but the function determined them unequal", equal(a,b));
	}
	
	@Test
	public void unequalDoubleArrayCorrect() {
		double[][] a = {{1,2,3}};
		double[][] b = {{1 , 4, 3}};
		assertFalse("The arrays are equal but the function determined them unequal", equal(a,b));
	}
	
	//Test the createNumberArray by first testing a correct input which is a double array that is populated
	@Test
	public void createNumberArrayCorrectNumberValues(){
		double[] testPrimitiveArray = {1.2,1.4,1.6};
		Number[] testNumberArray = createNumberArray(testPrimitiveArray);
		Number[] expectedNumberArray = {(Number)1.2, (Number)1.4, (Number)1.6};
		assertArrayEquals("The number array values should be the same as the input primitive array", expectedNumberArray, testNumberArray);
	}
	
	//Test the create Number array makes array with same length
	@Test
	public void createNumberArrayCorrectNumberLength() {
		double[] testPrimitiveArray = {1.2,1.4,1.6};
		Number[] testNumberArray = createNumberArray(testPrimitiveArray);
		assertEquals("The number array length should be the same as the input primitive array", 3, testNumberArray.length);
	}
	//Incorrect object as input which should throw a InvalidParameterException.
	@Test(expected = InvalidParameterException.class)
	public void createNumberArrayNullArray() {
			createNumberArray(null);
	}
	@Test(expected = InvalidParameterException.class)
	public void createNumberArrayNullValuesinArray() {
		createNumberArray(null);
	}
	
	//Test the createNumber2DArray by first testing a correct input which is a double array2D that is populated
	@Test
	public void createNumberArray2DCorrectNumberValues(){
		double[][] testPrimitiveArray = {{1.2,1.4,1.6},
											{1.8,2,2.2}};
		Number[][] testNumberArray = createNumberArray2D(testPrimitiveArray);
		Number[][] expectedNumberArray = new Number[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				expectedNumberArray[i][j] = testPrimitiveArray[i][j];
			}
		}
		assertArrayEquals("The number array values should be the same as the primitive array values", expectedNumberArray, testNumberArray);
	}
	//Test the create Number array makes array with same length
	@Test
	public void createNumberArray2DCorrectNumberLength() {
		double[][] testPrimitiveArray = {{1.2,1.4,1.6},{1.8,2,2.2}};
		Number[][] testNumberArray = createNumberArray2D(testPrimitiveArray);
		Number[][] expectedNumberArray = {{(Number)1.2,(Number)1.4,(Number)1.6},{(Number)1.8,(Number)2.0,(Number)2.2}};
		assertEquals("The number array length should be the same as the primitive array length", expectedNumberArray.length, testNumberArray.length);
	}
	
	//Incorrect object as input which should throw a InvalidParameterException.
	@Test(expected = InvalidParameterException.class)
	public void createNumberArray2DNullArray() {
		createNumberArray2D(null);
	}
	
	@Test(expected = InvalidParameterException.class)
	public void createNumberArrayNullValuesinArray2D() {
		createNumberArray2D(null);
	}
	
	
	
	//Correct Inputs for getCumulativePercentage
	@Test
	public void getCumulativePercentageCorrect() {
		DefaultKeyedValues input = new DefaultKeyedValues();
		input.addValue(0,(Number)5);
		input.addValue(1, (Number)9);
		input.addValue(2, (Number)2);
		KeyedValues actual = getCumulativePercentages((KeyedValues)input);
		
		DefaultKeyedValues expected = new DefaultKeyedValues();
		expected.addValue(0, (Number)0.3125);
		expected.addValue(1, (Number)0.875);
		expected.addValue(2, (Number)1.0);
		
		assertEquals("Expected Keyed Values percentages should be accurate", expected, actual);
		
	}
	
	//Input null for getCumulativePercentage, expect invalid parameter exception
	@Test(expected = InvalidParameterException.class)
	public void getCumulativePercentagesNullValue() {
		getCumulativePercentages(null);

	}
	
	
	
	
		
	

}
