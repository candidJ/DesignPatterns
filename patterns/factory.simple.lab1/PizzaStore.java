package patterns.factory.simple.lab1;

public class PizzaStore {
	SimplePizzaFactory pizzaFactory;

	public PizzaStore(SimplePizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = this.pizzaFactory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
