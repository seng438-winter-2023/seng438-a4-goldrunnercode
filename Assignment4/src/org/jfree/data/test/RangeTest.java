package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.Range; import org.junit.*;

public class RangeTest {
	private static final int DEFAULT_TIMEOUT = 2000;
    private Range exampleRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { exampleRange = new Range(-1, 1);
    }
 
    
    @Test
    public void containsReturnsTrue() {
    	exampleRange = new Range(2,4);
    	assertTrue("Value returned false even though number is within range", exampleRange.contains(3));
    }
    
    @Test
    public void containsReturnsFalse() {
    	exampleRange = new Range(2,4);
    	assertFalse("Value returned true even though number is within range", exampleRange.contains(6));
    }
    
    @Test
    public void intersectsReturnsTrueLower() {
    	exampleRange = new Range(2,4);
    	assertTrue("Value returned false even though the numbers intersect with the range", exampleRange.intersects(1,3));
    }
    
    @Test
    public void intersectsReturnsTrueUpper() {
    	exampleRange = new Range(2,4);
    	assertTrue("Value returned false even though the numbers intersect with the range", exampleRange.intersects(3,5));
    }
    
    @Test
    public void intersectsReturnFalseLower() {
    	exampleRange = new Range(2,4);
    	assertFalse("Value returned true even though the numbers don't intersect with the range", exampleRange.intersects(0,1));
    }
    
    @Test
    public void intersectsReturnFalseUpper() {
    	exampleRange = new Range(2,4);
    	assertFalse("Value returned true even though the numbers don't intersect with the range", exampleRange.intersects(5,6));
    }
    
//
//    @Test (timeout = DEFAULT_TIMEOUT, expected = Error.class)
//    public void RangeNULLTest(){
//    	exampleRange = new Range(null, 4);
//    }
    @Test(expected = IllegalArgumentException.class)
    public void constructorThrowsIllegalArgumentException() {
    	exampleRange = new Range(20, 4);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT, expected = Exception.class)
    public void RangeFlippedBoundsTest(){
    	exampleRange = new Range(20, 4);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getLowerBoundUnequalTest(){
    	assertEquals("Lower Bound wasn't correct when values were not equal",-1 , exampleRange.getLowerBound(), .0000001D);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getLowerBoundEqualTest(){
    	exampleRange = new Range(2,2);
    	assertEquals("Lower Bound wasn't correct when values were equal",2 ,exampleRange.getLowerBound(), .0000001D);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getLowerBoundNegativeTest(){
    	exampleRange = new Range(-100,0);
    	assertEquals("Lower Bound wasn't correct when lower bound was negative",-100 ,exampleRange.getLowerBound(), .0000001D);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getUpperBoundUnequalTest(){
    	assertEquals("Upper Bound wasn't correct when values were not equal",1 ,exampleRange.getUpperBound(), .0000001D);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getUpperBoundEqualTest(){
    	exampleRange = new Range(2,2);
    	assertEquals("Upper Bound wasn't correct when values were equal",2 ,exampleRange.getUpperBound(), .0000001D);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getUpperBoundNegativeTest(){
    	exampleRange = new Range(-100,0);
    	assertEquals("Upper Bound wasn't correct when values were equal",0 ,exampleRange.getUpperBound(), .0000001D);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getLengthUnequalTest(){
    	assertEquals("length between -1 and 1 was incorrect",2 ,exampleRange.getLength(), .0000001D);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getLengthEqualTest(){
    	exampleRange = new Range(2,2);
    	assertEquals("length between equal numbers should be 0",0 ,exampleRange.getLength(), .0000001D);
    }
    
    @Test (timeout = DEFAULT_TIMEOUT)
    public void getLengthNegativeTest(){
    	exampleRange = new Range(-100,0);
    	assertEquals("length in negative range was incorrect",100 ,exampleRange.getLength(), .0000001D);
    }


    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}