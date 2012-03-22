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
	public void bake() throws Exception {
		System.out.print("Baking the Pizza");  
		pizza.setState(pizza.getBakedState());

	}

	/* (non-Javadoc)
	 * @see states.PizzaState#deliver()
	 */
	@Override
	public void deliver() throws Exception {
		throw new Exception("Can't deliver a pizza not yet cooked");

	}


	@Override
	public void cancel() throws Exception {
		System.out.print("Order Cancelled");  
		pizza.setState(pizza.getCancelState());		
	}


}
