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
	public void bake() throws Exception {  
		throw new Exception("Can't bake a pizza already delivered");
				
	}

	/* (non-Javadoc)
	 * @see states.PizzaState#deliver()
	 */
	@Override
	public void deliver() throws Exception {
		System.out.print("Delivering the Pizza");  
		pizza.setState(pizza.getDeliveredState());

	}

	@Override
	public void cancel() throws Exception {
		System.out.print("Order Cancelled");  
		pizza.setState(pizza.getCancelState());
		
	}


}
