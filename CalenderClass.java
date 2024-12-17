package newExcerciseDay1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalenderClass {

	public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Enter the date in the format(dd/MM/yyy)");
	         String userDate = sc.next();
	         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	         try {
	        	 Date date = dateFormat.parse(userDate);
	        	 Calendar calender = Calendar.getInstance();
	        	 calender.setTime(date);
	        	 calender.add(Calendar.YEAR,4);
	        	 Date updatedDate = calender.getTime();
	        	 System.out.println("after 4 year the date will be "+ dateFormat.format(updatedDate));
	          }catch(ParseException e) {
	        	  System.out.println("Invalid input");
	          }
	         sc.close();

	}

}
