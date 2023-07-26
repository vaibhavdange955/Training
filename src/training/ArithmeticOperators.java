package training;
import java.util.Scanner;

public class ArithmeticOperators {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter First value:");
	int i = scan.nextInt();
	

	System.out.println("Enter Second value:");
	int j = scan.nextInt();
	
	System.out.println("Sum is:"+(i+j));
	System.out.println("Difference is:"+(i-j));
	System.out.println("Product is:"+(i*j));
	System.out.println("average is:"+(i/j));
	int max = i>j?i:j;
	int min = i<j?i:j;
	System.out.println("Max number is:"+max);
	System.out.println("Min number is:"+min);
	
	
	}
}
