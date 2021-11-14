package patterns.factory.abs.lab3;

public abstract class Pizza {

	String name;
	Dough dough;
	Cheese cheese;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake the pizza for 25 minutes at 250");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Boxing the pizza");
	}
}
