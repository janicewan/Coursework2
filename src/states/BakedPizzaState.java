/**
 * 
 */
package states;

/**
 * @author jwan01
 *
 */
public class BakedPizzaState implements PizzaState {

	private Pizza pizza;
	
	
	public BakedPizzaState(Pizza pizza) {  
		this.pizza = pizza; }
	
	
	/* (non-Javadoc)
	 * @see states.PizzaState#bake()
	 */
	@Override
	public String bake() {
		pizza.setState(pizza.getBakedState());
		return ("Baking the Pizza");  

	}

	/* (non-Javadoc)
	 * @see states.PizzaState#deliver()
	 */
	@Override
	public String deliver() {
		return ("Can't deliver a pizza not yet cooked");

	}


	@Override
	public String cancel() {
		pizza.setState(pizza.getCancelState());
		return ("Order Cancelled");  
	}


}
