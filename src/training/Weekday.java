package training;
import java.util.Scanner;
public class Weekday {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Weekday number: ");
		int number=scan.nextInt();
		
		String weekdayname ="Sunday";
		
		switch(number){
		case 1:
			weekdayname="Sunday";
		    break;
		case 2:
			weekdayname="Monday";
			break;
		case 3:
			weekdayname="Tuesday";
			break;
		case 4:
			weekdayname="Wednesday";
			break;
		case 5:
			weekdayname="Thursday";
			break;
		case 6:
			weekdayname="Friday";
			break;
		case 7:
			weekdayname="Saturday";
			break;
		default:
			System.out.println("Invalid Input");
	}
		System.out.println(number+"-"+weekdayname );

}
}
