package day7Exercixe;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}
class Reptile extends Animal {
    void crawl() {
        System.out.println("Crawling...");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}
class Snake extends Reptile {
    void hiss() {
        System.out.println("Hissing...");
    }
}

public class MultilevelAndHeirarchical {

	public static void main(String[] args) {
		Dog dog = new Dog();
        dog.eat(); 
        dog.walk(); 
        dog.bark(); 

        Snake snake = new Snake();
        snake.eat(); 
        snake.crawl(); 
        snake.hiss(); 

	}

}
