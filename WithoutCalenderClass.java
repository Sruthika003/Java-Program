package newExcerciseDay1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class WithoutCalenderClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date in the format(dd/MM/yyyy)");
		String userDate = sc.next();
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate date = LocalDate.parse(userDate, formatter);
			LocalDate updatedDate = date.plusYears(4);
			System.out.println("after 4 year the date will be "+ updatedDate);
		}catch(DateTimeParseException e) {
			System.out.println("Invalid input");
		}
	}

}
