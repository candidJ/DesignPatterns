package patterns.factory.method.lab2;

public class DohaPizzaStore extends PizzaStore {
	
	@Override()
	Pizza createPizza(String type) {

		if (type == "cheese") {
			return new DohaCheesePizza();
		} else if (type == "farmhouse") {
			return new DohaFarmhousePizza();
		}else {
			return null;
		}
	}

}
