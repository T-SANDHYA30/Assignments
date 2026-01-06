package com.unittesting.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testshouldAnswerWithTrue() {
		assertTrue(true);
	}
	@Test
	public void sayHelloTest() {
		String expected="Hello";
		String actual = new App().sayHell();
		assertEquals(expected,actual);
	}
	
	@Test
	public void checkTestTest() {
		assertNull(new App().checkTest());
	}
	
	@BeforeAll
	public static void beforeEveryTest() {
		System.out.println("Testing of api started");
	}
	
	@AfterAll
	public static void afterEach() {
		System.out.println("testing of api completed");
	}
	
	
	
	
	
	
	
	
	
	
	
    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}
