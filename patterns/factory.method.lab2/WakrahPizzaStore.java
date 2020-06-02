package patterns.factory.method.lab2;

public class WakrahPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		if (type == "cheese") {
			return new WakrahCheesePizza();
		} else if (type == "farmhouse") {
			return new WakrahFarmhousePizza();
		}else {
			return null;
		}
	}

	
}
