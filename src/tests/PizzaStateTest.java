/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import states.Pizza;
import states.PizzaState;

/**
 * @author jwan01
 *
 */
public class PizzaStateTest  {

	@Test
	public void test() {
		String expectedOutput= "Baking the pizza...";
		PizzaState stringReturned = null;
		Pizza classUnderTest= new Pizza();
		stringReturned = classUnderTest.getCookedState();
		assertEquals("Wrong Answer !", stringReturned, expectedOutput);
	}
}