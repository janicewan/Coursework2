/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import states.Pizza;

/**
 * @author jwan01
 *
 */
public class PizzaStateTest {

	@Test
	public void test() {
		String expectedOutput= "Like a fighter jet";
		String stringReturned= null;
		Pizza classUnderTest= new Pizza();
		stringReturned= classUnderTest.getCookedState();
		assertEquals("Wrong Answer !", stringReturned, expectedOutput);
	}

}
