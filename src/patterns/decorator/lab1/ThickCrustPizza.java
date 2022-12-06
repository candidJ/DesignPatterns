package patterns.decorator.lab1;

public class ThickCrustPizza extends PizzaBase {

	@Override
	protected String getDescription() {
		return this.description + "- Thick crust";
	}

	@Override
	protected double cost() {
		return 6.99;
	}

}
