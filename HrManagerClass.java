package day6Exercise;
class Empolyee{
	public void work() {
		System.out.println("work hard");
	}
	
	public void getSalary() {
		System.out.println("get salary for your work");
	}
}
public class HrManagerClass extends Empolyee{
	
  public void work() {
	  System.out.println("from hr : work hard");
  }
  public void addEmpolyee() {
	  System.out.println("HR will add more empolyee");
  }
  
	public static void main(String[] args) {
		 HrManagerClass hr = new HrManagerClass();
		 hr.addEmpolyee();
		 hr.work();
		 hr.getSalary();
		 

	}

}
