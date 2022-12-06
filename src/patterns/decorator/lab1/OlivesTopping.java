package patterns.decorator.lab1;

public class OlivesTopping extends ToppingsDecorator {

	PizzaBase pizza = null;

	public OlivesTopping(PizzaBase pizza) {
		this.pizza = pizza;
	}

	@Override
	protected String getDescription() {
		return this.pizza.getDescription() + ", with Olives";
	}

	protected double cost() {
		return this.pizza.cost() + olivesToppingCost();
	}

	private double olivesToppingCost() {
		return 1.99;
	}

}
