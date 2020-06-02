package patterns.factory.simple.lab1;

public class CheesePizza extends Pizza{

	
	@Override
	void prepare() {
		System.out.println("Preparing Chesse Pizza...");
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
