package patterns.factory.abs.lab3;

public abstract class PizzaStore {

	public Pizza orderPizza(String name) {
		Pizza pizza = createPizza(name);
		System.out.println(pizza);
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String name);

}
