package patterns.decorator.lab1;

public abstract class PizzaBase {

	String description = "Pizza";

	protected String getDescription() {
		return this.description;
	}

	protected abstract double cost();

}
