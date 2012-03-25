package states;

public class cancelPizzaState implements PizzaState {
	
	public cancelPizzaState(Pizza pizza) { }

	/* (non-Javadoc)
	 * @see states.PizzaState#bake()
	 */
	@Override
	public String bake() {  
		return ("Order already cancelled");
				
	}
	/* (non-Javadoc)
	 * @see states.PizzaState#deliver()
	 */
	@Override
	public String deliver() {
		return ("Order already cancelled");

	}

	@Override
	public String cancel() {
		return ("Order already cancelled");
		
	}


}
