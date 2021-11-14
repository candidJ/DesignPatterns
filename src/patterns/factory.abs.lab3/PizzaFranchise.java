package patterns.factory.abs.lab3;

public class PizzaFranchise {

	public static void main(String args) {

		System.out.println("pizza business");
		PizzaStore dohaPizzaStore = new DohaPizzaStore();
		dohaPizzaStore.orderPizza("cheese");

	}

}
