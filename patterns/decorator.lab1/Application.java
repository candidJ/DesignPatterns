package patterns.decorator.lab1;

public class Application {

	public static void main(String[] args) {
		PizzaBase pizza = new ThinCrustPizza();
		PizzaBase cheesePizza = new CheeseTopping(pizza);
		PizzaBase pepperPizza = new PepperTopping(cheesePizza);
		PizzaBase olivePizza = new OlivesTopping(pepperPizza);
		System.out.println(olivePizza.getDescription() + ", for $" + olivePizza.cost());
	}

}
