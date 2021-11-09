package patterns.decorator.lab1;

public class Application {

	public static void main(String[] args) {
		PizzaBase pizza = new ThinCrustPizza();
		pizza = new CheeseTopping(pizza);
		pizza = new PepperTopping(pizza);
		pizza = new OlivesTopping(pizza);
		System.out.println(pizza.getDescription() + ", for $" + pizza.cost());
	}

}
