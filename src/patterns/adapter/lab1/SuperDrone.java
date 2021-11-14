package patterns.adapter.lab1;

public class SuperDrone implements Drone {

    public void buzz() {
        System.out.println("Drone: Buzzing");
    }

    public void spin_rotors() {
        System.out.println("Drone: Spinning rotors. Initiating take off.");
    }

    public void take_off() {
        System.out.println("Drone: Taking off.");
    }

}
