package patterns.factory.absolute.lab1;

public abstract class Toppings {

	void addToppings(String[] toppings) {
		for (String topping : toppings) {
			System.out.println(topping);
		}
	}
}
