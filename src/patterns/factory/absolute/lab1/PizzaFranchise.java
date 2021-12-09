package patterns.factory.absolute.lab1;

public class PizzaFranchise {

	public static void main(String args) {

		System.out.println("pizza business");
		PizzaStore dohaPizzaStore = new DohaPizzaStore();
		dohaPizzaStore.orderPizza("cheese");

	}

}
