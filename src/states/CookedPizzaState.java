/**
 * 
 */
package states;

/**
 * @author jwan01
 *
 */
public class CookedPizzaState implements PizzaState {
	
	private Pizza pizza;
	
	public CookedPizzaState(Pizza pizza) 
	{  this.pizza = pizza; }
	
	/* (non-Javadoc)
	 * @see states.PizzaState#bake()
	 */
	@Override
	public String bake() {  
		pizza.setState(pizza.getBakedState());
		return ("Baking the pizza...");  
	}


	/* (non-Javadoc)
	 * @see states.PizzaState#deliver()
	 */
	@Override
	public String deliver() {
		return ("Can't deliver a pizza not baked yet");

	}

	@Override
	public String cancel()  {
		pizza.setState(pizza.getCancelState());		
		return("Order Cancelled");  
	}

}
