package patterns.factory.simple.lab1;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type == "cheese") {
			pizza = new CheesePizza();
		} else if (type == "farmhouse") {
			pizza = new Farmhouse();
		}

		return pizza;
	}

}
