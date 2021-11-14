package patterns.factory.abs.lab3;

public class DohaCheesePizza extends Pizza {

	PizzaIngredientsFactory ingredientsFactory;

	public DohaCheesePizza(PizzaIngredientsFactory ingredientsFactory) {
		this.ingredientsFactory = ingredientsFactory;
		this.prepare();
	}

	@Override
	void prepare() {
		dough = this.ingredientsFactory.createDough();
		cheese = this.ingredientsFactory.createCheese();
	}

}
