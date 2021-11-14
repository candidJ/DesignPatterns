package patterns.factory.method.lab2;

public class WakrahFarmhousePizza extends Pizza {

	public WakrahFarmhousePizza() {
		this.name = "Wakrah Styled farm house pizza";
		this.toppings.add("Olives Olives");
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing Wakrah farmhouse pizza");
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
