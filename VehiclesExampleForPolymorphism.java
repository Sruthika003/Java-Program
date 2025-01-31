package day14Exercise;

class Vehicles{
	public void startEngine() {
		System.out.println("the vehicle's engine is started");
	}
	
	public void stopEngine() {
		System.out.println("the vehicle's engine is stoped");
	}
}
class Car1 extends Vehicles{
	public void startEngine() {
		System.out.println("the car's engine is started");
	}
	
	public void stopEngine() {
		System.out.println("the car's engine is stoped");
	}
}
	
class MotorCycle extends Vehicles{
	public void startEngine() {
		System.out.println("the motorcycle's engine is started");
	}
	
	public void stopEngine() {
		System.out.println("the motorcycle's engine is stoped");
	}
}

public class VehiclesExampleForPolymorphism {

	public static void main(String[] args) {
		
		MotorCycle motor = new MotorCycle();
		motor.startEngine();
		motor.stopEngine();
		Car1 car = new Car1();
		car.startEngine();
		car.stopEngine();
	}

}
