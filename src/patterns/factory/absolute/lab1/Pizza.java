package patterns.factory.absolute.lab1;

public abstract class Pizza {

	String name;
	Dough dough;
	Cheese cheese;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake the pizza for 15 minutes at 180 Degree Celsius");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Boxing the pizza");
	}
}
