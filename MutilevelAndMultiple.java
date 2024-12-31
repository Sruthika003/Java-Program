package day7Exercixe;

class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }
}
class Mammal1 extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}
interface Flyable {
    void fly();
}

class Bat extends Mammal implements Flyable {
    public void fly() {
        System.out.println("Flying...");
    }
}
public class MutilevelAndMultiple {

	public static void main(String[] args) {
		 Bat bat = new Bat();
	        bat.eat(); 
	        bat.walk(); 
	        bat.fly(); 

}
}
