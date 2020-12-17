package Jacoco.Tired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	@Test
	public void addTest() {
		assertNotSame(34, calculator.addition(1, 3));
	}
	
	@Test
	public void subtractTest() {
		assertNotSame(34, calculator.addition(1, 3));
	}
	
	
	@Test
	public void greaterThanTest() {
		assertEquals(true, RelQuantifiers.greaterThanOrEqualTo(5, 1));

	}
	
	
	@Test
	public void lesserThanTest() {
		assertEquals(true, RelQuantifiers.lesserThan(1, 3));
	}
	
	
	
	
	
}
