package patterns.decorator.lab1;

public class PepperTopping extends ToppingsDecorator {

	PizzaBase pizza = null;

	public PepperTopping(PizzaBase pizza) {
		this.pizza = pizza;
	}

	@Override
	protected String getDescription() {
		return this.pizza.getDescription() + ", with Peppers";
	}

	@Override
	protected double cost() {
		return this.pizza.cost() + pepperToppingCost();
	}

	private double pepperToppingCost() {
		return 0.99;
	}

}
