package patterns.factory.simple.lab2;

// Client(PizzaStore) has reference to Factory(SimplePizzaFactory)
public class PizzaStore {

    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        return pizza;
    }
}
