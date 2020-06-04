package patterns.factory.abs.lab3;

enum PizzaType {
	CHEESE, FARMHOUSE
}

public class DohaPizzaStore extends PizzaStore {

	Pizza pizza = null;
	PizzaIngredientsFactory ingredientsFactory = new DohaPizzaStyleIngredients();

	@Override
	Pizza createPizza(String name) {
		System.out.println(PizzaType.CHEESE);
		if (name.equals("CHEESE")) {
			pizza = new DohaCheesePizza(this.ingredientsFactory);
		}

		return pizza;
	}

}
