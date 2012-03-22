package states;

public interface PizzaState {

	void bake() throws Exception;
	void deliver() throws Exception;
	void cancel() throws Exception;
}