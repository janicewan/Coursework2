package states;

public class cancelPizzaState implements PizzaState {
	
	public cancelPizzaState(Pizza pizza) { }

	/* (non-Javadoc)
	 * @see states.PizzaState#bake()
	 */
	@Override
	public void bake() throws Exception {  
		throw new Exception("Order already cancelled");
				
	}
	/* (non-Javadoc)
	 * @see states.PizzaState#deliver()
	 */
	@Override
	public void deliver() throws Exception {
		throw new Exception("Order already cancelled");

	}

	@Override
	public void cancel() throws Exception {
		throw new Exception("Order already cancelled");
		
	}


}
