package patterns.factory.absolute.lab1;

public class PizzaLab {

	public static void main(String[] args) {
		System.out.println("Pizza factory(absolute) business");
		PizzaStore dohaPizzaStore = new DohaPizzaStore();
		dohaPizzaStore.orderPizza("CHEESE");


	}

}
