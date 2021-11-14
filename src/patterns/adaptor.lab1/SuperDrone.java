package patterns.adapter.lab1;

public class SuperDrone implements Drone {

	@Override
	public void beep() {
		System.out.println("Beep beep beep");
	}

	@Override
	public void spin_rotors() {
		System.out.println("Rotors are spinning");
	}

	@Override
	public void take_off() {
		System.out.println("Taking off");
	}

}
