package patterns.factory.method.lab1;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract Pizza createPizza(String type);

}
