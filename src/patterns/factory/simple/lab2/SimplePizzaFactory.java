package patterns.factory.simple.lab2;

// ONLY factory class have reference to concrete Product(Pizza) typess
public class SimplePizzaFactory {
    Pizza myPizza;

    Pizza createPizza(String type) {
        if (type == "farmhouse") {
            myPizza = new FarmhousePizza();
        }
        return myPizza;
    }

}

