package patterns.factory.method.lab1;

public class DohaFarmhousePizza extends Pizza {

    public DohaFarmhousePizza() {
        this.name = "Doha Styled farm house pizza";
        this.toppings.add("Pineapple Olives Pepper");
    }

    @Override
    void prepare() {
        System.out.println("Preparing farmhouse piza");
    }

    @Override
    void bake() {
        System.out.println("Baking...");

    }

    @Override
    void cut() {
        System.out.println("Cutting...");
    }

    @Override
    void box() {
        System.out.println("Packing for delivery");

    }

}
