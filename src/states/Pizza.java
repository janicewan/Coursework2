package states;

public class Pizza {
	PizzaState cookedState;
	PizzaState bakedState; 
	PizzaState deliveredState; 
	PizzaState cancelState;
	private String name;  
	private PizzaState state = cookedState;  
	

	public Pizza() {  
		 cookedState = new CookedPizzaState(this);  
		 bakedState = new BakedPizzaState(this);  
		 deliveredState = new DeliveredPizzaState(this); 
		 cancelState = new cancelPizzaState(this);
		}	
	public String getName() 
	{  return name; }
	
	public void setName(String name) 
	{  this.name = name; }  
	
	public PizzaState getState() 
	{  return state; }  
	
	public void setState(PizzaState state) 
	{  this.state = state; }  
	
	public void bake() 
	{    this.state.bake();	}   
	
	public void deliver() 
	{   this.state.deliver();}
	
	public PizzaState getCookedState() 
	{  return cookedState; }
	
	public PizzaState getBakedState() 
	{  return bakedState; }
	
	public PizzaState getDeliveredState() 
	{  return deliveredState; }
	
	public PizzaState getCancelState() 
	{  return cancelState; }
	
}