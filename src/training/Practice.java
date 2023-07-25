package training;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int i = scan.nextInt();
		
		System.out.println("Square is : "+(i*i));
		System.out.println("Cube is   : "+(i*i*i));
		System.out.println("Fourth power:" +(i*i*i*i));
	}

}
