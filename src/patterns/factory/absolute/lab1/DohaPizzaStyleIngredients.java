package patterns.factory.absolute.lab1;

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
