package day14Exercise;

class Vehicle{
	
	public int speedUp(int speed) {
		return speed;
	}
}

class Car extends Vehicle{
	public int speedUp(int speed, int increment) {
		return speed + increment;
		
	}
}

class Bike extends Vehicle{
	
	public int speedUp(int speed, int increment) {
		return speed + increment;
		
	}
}
public class VehicleExampleForPolymorphism {

	public static void main(String[] args) {
		
    Car c = new Car();
   System.out.println(c.speedUp(100, 50));
   Bike b = new Bike();
   System.out.println(b.speedUp(100, 70));
    
	}

}
