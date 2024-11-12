package patterns.decorator.lab1;

public class Application {

    public static void main(String[] args) {
        PizzaBase pizza = new ThinCrustPizza();
        // the pizza object is decorated with additional functionality
        // all the topping are added without changing the existing structure of the concrete class
        pizza = new CheeseTopping(pizza);
        pizza = new PepperTopping(pizza);
        pizza = new OlivesTopping(pizza);
        System.out.println(pizza.getDescription() + ", for $" + pizza.cost());
    }

}
