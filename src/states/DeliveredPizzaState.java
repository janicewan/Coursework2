/**
 * 
 */
package states;

/**
 * @author jwan01
 *
 */
public class DeliveredPizzaState implements PizzaState {
	
	private Pizza pizza;
	
	public DeliveredPizzaState(Pizza pizza) {  
		this.pizza = pizza; }

	/* (non-Javadoc)
	 * @see states.PizzaState#bake()
	 */
	@Override
	public String bake() {  
		return ("Can't bake a pizza already delivered");
				
	}

	/* (non-Javadoc)
	 * @see states.PizzaState#deliver()
	 */
	@Override
	public String deliver() {
		pizza.setState(pizza.getDeliveredState());
		return ("Delivering the Pizza");  
	}

	@Override
	public String cancel() {
		pizza.setState(pizza.getCancelState());
		return ("Order Cancelled");  
	}


}
