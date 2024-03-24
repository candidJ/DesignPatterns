package patterns.factory.method.lab1;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	ArrayList<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Preparing " + this.getName() + " pizza");
		System.out.println("Tossing dough");
		System.out.println("Adding sauce");
		System.out.println("Adding toppings");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(toppings.get(i));
		}
	}

	void bake() {
		System.out.println("Baking at 30 degrees for 25 minutes");
	}

	void cut() {
		System.out.println("Cutting slices");
	}

	void box() {
		System.out.println("Packing pizza");
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
