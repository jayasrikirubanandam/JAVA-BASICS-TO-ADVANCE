package DateANDTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//if you want to deal with date and time ->
//-> 3 packages involves 1.java.util.Date 2.java.sql.Date
//JOda API is new and recommended one -> from time package

public class Launh01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the date in the format \"dd-MM-yyyy\"");
		String d1 = scan.next();
		
		//SimpleDateFormat s = new SimpleDateFormat(d1);
		DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter format1 =  DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
		DateTimeFormatter format2 =  DateTimeFormatter.ofPattern("E , MMMM-dd-yyyy");
		LocalDate date = LocalDate.parse(d1,format);
		
		LocalDate date1  =  LocalDate.now() ;
		 
		 
		Period age =  Period.between(date, date1); 
		System.out.println("AGe " +age.getYears()+age.getDays());
		
		System.out.println("TYPED BY USER " +d1);
		System.out.println("DATE " +date);
		
		System.out.println(date.format(format2));
		
		System.out.println(date.format(format1));
		
	}

}
