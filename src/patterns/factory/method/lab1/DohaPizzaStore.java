package patterns.factory.method.lab1;

public class DohaPizzaStore extends PizzaStore {

    @Override()
    Pizza createPizza(String type) {
        Pizza pizza;
        if (type == "cheese") {
            pizza = new DohaCheesePizza();
        } else if (type == "farmhouse") {
            pizza = new DohaFarmhousePizza();
        } else {
            pizza = new DohaCheesePizza();
        }

        return pizza;
    }

}
