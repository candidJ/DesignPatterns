package patterns.decorator.lab1;

public class ThickCrustPizza extends PizzaBase {

	public ThickCrustPizza() {
		description = "Thick Crust Pizza";
	}

	@Override
	protected double cost() {
		return 6.99;
	}

}
