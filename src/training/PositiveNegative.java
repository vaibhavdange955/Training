package training;
import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int i =scan.nextInt();
		
		if(i>=0) {
			System.out.println("Number is positive");
		}else
		{
			System.out.println("Number is Negative");
		}
	}

}
