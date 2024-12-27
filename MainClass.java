package day6Exercise;

class Animal{
	 public void makeSound() {
		 System.out.println("different animals makes different sound");
	 }

}
class CatClass  extends Animal{
	@Override
  public void makeSound() {
	 System.out.println("bark");
 }
	
	class MainClass {
	 public static void main(String a[]) {
		 CatClass obj = new CatClass();
		 Animal obj1 = new Animal();
		 obj1.makeSound();
		 obj.makeSound();
		 
	 
 }}
}
