/*Ying Huang
 * 11-1-2017
 * 5.4 Return Values
 */
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		if(isLeapYear(year)) System.out.println(year+" is a leap year.");
		else System.out.println(year+" is not a leap year.");
		
	}
	public static boolean isLeapYear(int year){
		boolean isLeapYear;
		if(year%400==0)isLeapYear=true;
		else if(year%4==0&year%100!=0)isLeapYear=true;
		else isLeapYear = false;
		return isLeapYear;
	}
}
