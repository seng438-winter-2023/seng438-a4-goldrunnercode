package org.jfree.data.test;
import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.*;

public class RangeTest2 {
    private Range exampleRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception {
        exampleRange = new Range(1, 9);
    }


    @Test
    public void centralValueShouldBeFive() {
        assertEquals("The central value of 1 and 9 should be 5",
                5, exampleRange.getCentralValue(), .000000001d);
    }

    @Test
    public void TestToString() {
        Range test = new Range(1, 9);
        assertEquals("Not converted to a string properly.", "Range[1.0,9.0]", test.toString());
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}