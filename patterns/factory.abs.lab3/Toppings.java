package patterns.factory.abs.lab3;

public abstract class Toppings {

	void addToppings(String[] toppings) {
		for (String topping : toppings) {
			System.out.println(topping);
		}
	}
}
