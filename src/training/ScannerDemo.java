package training;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		
		int i = scan.nextInt();
		
		System.out.println("Enter second number:");
		
		int j =scan.nextInt();
		
		System.out.println("Addition is:" +(i+j));
		
	}
}
