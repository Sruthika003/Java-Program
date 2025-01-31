package day14Exercise;

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class PersonExampleForEncapsulation {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("sruthika");
		System.out.println(p1.getName());
		p1.setAge(21);
		System.out.println(p1.getAge());

	}

}
