package patterns.decorator.lab1;

public class CheeseTopping extends ToppingsDecorator {

	PizzaBase pizza = null;

	public CheeseTopping(PizzaBase pizza) {
		this.pizza = pizza;
	}

	@Override
	protected String getDescription() {
		return this.pizza.getDescription() + ", with Cheese";
	}

	@Override
	protected double cost() {
		return this.pizza.cost() + 0.99;
	}

}
