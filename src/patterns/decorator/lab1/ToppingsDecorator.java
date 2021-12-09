package patterns.decorator.lab1;

public abstract class ToppingsDecorator extends PizzaBase {

	PizzaBase pizza;

	@Override
	protected abstract String getDescription();
}
