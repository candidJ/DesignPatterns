package patterns.factory.simple.lab1;

public class PizzaApplication {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		store.orderPizza("cheese");

	}

}
