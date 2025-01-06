package day8Exercise;
class Student{
	String studentName;
	int StudentAge;
	String StudentDepartment;

    public Student(String name,int age,String dept) {
    	this.studentName = name;
    	this.StudentAge = age;
    	this.StudentDepartment = dept;
    }
}
public class LocalVariable {

	public static void main(String[] args) {
		Student obj = new Student("Sruthika",21,"Food");
		System.out.println("student name is "+ obj.studentName);
		System.out.println("student age is "+obj.StudentAge);
		System.out.println("student department is "+ obj.StudentAge);

	}

}
