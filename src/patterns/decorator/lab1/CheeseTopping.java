package patterns.decorator.lab1;

public class CheeseTopping extends ToppingsDecorator {

    PizzaBase pizza;

    public CheeseTopping(PizzaBase pizza) {
        this.pizza = pizza;
    }

    @Override
    protected String getDescription() {
        return this.pizza.getDescription() + ", with Cheese";
    }

    @Override
    protected double cost() {
        return this.pizza.cost() + cheeseToppingCost();
    }

    private double cheeseToppingCost() {
        return 2.99;
    }

}
