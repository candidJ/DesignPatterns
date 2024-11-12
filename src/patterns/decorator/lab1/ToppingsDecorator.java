package patterns.decorator.lab1;

public abstract class ToppingsDecorator extends PizzaBase {

    protected PizzaBase pizza; // uses composition to add new functionality using concrete classes

    @Override
    protected abstract String getDescription();
}