package day14Exercise;

class Employee{
	public int calculatSalary(int salary) {
		return salary; 
	}
}

class Manager extends Employee{
	public int calculatSalary(int salary) {
		return salary; 
	}
}

class Programmer extends  Employee{
	public int calculatSalary(int salary) {
		return salary; 
	}
}
public class EmpolyeeSalaryExampleForPolymorphism {

	public static void main(String[] args) {
		Manager m = new Manager();
		System.out.println(m.calculatSalary(60000));
		
		Programmer p = new Programmer();
		System.out.println(p.calculatSalary(50000));
	}

}
