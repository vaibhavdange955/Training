package training;
import java.util.Scanner;

public class DaysInMonth {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Month number:");
	
		int number=scan.nextInt();
	
		
		int numofdays = 0;
		
		switch(number){
		case 1:
		    numofdays=31;
		    break;
		case 2:
			numofdays=28;
			break;
		case 3:
			numofdays=31;
			break;
		case 4:
			numofdays=30;
			break;
		case 5:
			numofdays=31;
			break;
		case 6:
			numofdays=30;
			break;
		case 7:
			numofdays=31;
			break;
		case 8:
			numofdays=31;
			break;
		case 9:
			numofdays=30;
			break;
		case 10:
			numofdays=31;
			break;
		case 11:
			numofdays=30;
			break;
		case 12:
			numofdays=31;
			break;
		default:
			System.out.println("Invalid Input");
	}
		System.out.println("Number of days in Month "+numofdays);

}
}
