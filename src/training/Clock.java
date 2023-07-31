package training;
import java.util.Scanner;

public class Clock {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter total second : ");
		int total_Second=scan.nextInt();
		
		int hours= total_Second/3600;
		
		int remaining_second_After_hours= total_Second%3600;
		
		int minute = remaining_second_After_hours/60;
		
		int remaining_seconds=remaining_second_After_hours%60;
		
		System.out.println(hours+ " Hours " +minute+ " Minute "+remaining_seconds +" Seconds ");
	}

}
