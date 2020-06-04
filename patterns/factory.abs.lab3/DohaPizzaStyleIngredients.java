package patterns.factory.abs.lab3;

public class DohaPizzaStyleIngredients implements PizzaIngredientsFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

}
