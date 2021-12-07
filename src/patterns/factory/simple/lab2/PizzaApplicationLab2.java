package patterns.factory.simple.lab2;

public class PizzaApplicationLab2 {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore muktsarPizzaStore = new PizzaStore(simplePizzaFactory);
        muktsarPizzaStore.orderPizza("farmhouse");
    }
}
