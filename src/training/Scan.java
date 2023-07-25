package training;
import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your 1st name");
		String s = scan.next();
		
		System.out.println("Enter your middle name");
		String s1 = scan.next();
		
		System.out.println("Enter your last name");
		String s2 = scan.next();
		
		System.out.println("Your full name is: "+ (s+" "+s1+" "+s2));
		
		
	}

}
