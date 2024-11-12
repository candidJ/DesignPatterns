package patterns.decorator.lab1;

public class ThinCrustPizza extends PizzaBase {

    @Override
    protected double cost() {
        return 5.99;
    }

    @Override
    protected String getDescription() {
        return this.description + "- Thin crust";
    }
}
