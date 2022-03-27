package testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class divideTest {

	
	@Test
	/**
	 * Method tests correct answer for allowable inputs.
	 */
	public void testDivide() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(6,3);
		assertEquals(2,output,2);
		
	
		
	}
	/**
	 * Method ensures invalid division throws an exception
	 */
	@Test(expected = ArithmeticException.class)
	public void testIllegalDivide() {
		
		JunitTesting test = new JunitTesting();
		test.divide(6,0);
		
		
	}

}

