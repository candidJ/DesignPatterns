package patterns.factory.method.lab1;

public class PizzaApplicationFactoryMethod {

	public static void main(String[] args) {

		PizzaStore dohaPizzaStore = new DohaPizzaStore();
		PizzaStore wakrahPizzaStore = new WakrahPizzaStore();
		
		dohaPizzaStore.orderPizza("cheese");
		dohaPizzaStore.orderPizza("farmhouse");

		wakrahPizzaStore.orderPizza("farmhouse");
		wakrahPizzaStore.orderPizza("cheese");
	}

}
