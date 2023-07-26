package training;
import java.util.Scanner;

public class Temprature {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Temprature in Celsius: ");
		float c1 = scan.nextFloat();
		
		double farenheit = (1.8*c1)+32;
		
		double kelvin = c1+273;
		
		System.out.println(c1 + " Celsius= " +farenheit+ " Farenheit ");
		System.out.println(c1 + " Celsius= " +kelvin+ " Kelvin ");
	}

}
