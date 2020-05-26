package patterns.adapter.lab1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new MallardDuck();
		testDuck(duck);
		Duck drone = new AdaptorSuperDrone(new SuperDrone());
		testDuck(drone);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
