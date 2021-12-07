package patterns.factory.simple.lab2;

public class Pizza {

    // modules should be deep
    // create simple interface which hides implementation details: from A philosophy of Software Design

    void prepare() {
        this.bake();
        this.cut();
        this.pack();
    }

    private void bake() {
        System.out.println("Baking pizza");
    }

    private void cut() {
        System.out.println("Cutting the Pizza");
    }

    private void pack() {
        System.out.println("Packing the Pizza");
    }
}
