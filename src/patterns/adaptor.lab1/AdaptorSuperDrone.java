package patterns.adapter.lab1;

// the adaptor must implement the interface to client it wants to adapt to
public class AdaptorSuperDrone implements Duck {

	SuperDrone drone;

	public AdaptorSuperDrone(SuperDrone drone) {
		this.drone = drone;
	}

	public void quack() {
		this.drone.beep();
	}

	public void fly() {
		this.drone.spin_rotors();
		this.drone.take_off();
	}
}
