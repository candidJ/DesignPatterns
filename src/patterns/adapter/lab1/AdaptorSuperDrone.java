package patterns.adapter.lab1;

// the adaptor must implement the TARGET interface
public class AdaptorSuperDrone implements Duck {

    // ASSOCIATION (composition)
    SuperDrone drone;

    public AdaptorSuperDrone(SuperDrone drone) {
        this.drone = drone;
    }

    public void quack() {
        this.drone.buzz();
    }

    public void fly() {
        this.drone.spin_rotors();
        this.drone.take_off();
    }
}
