package training;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num = scan.nextInt();
		
		int rem,cube;
		int sum=0;
		int temp=num;
		
		while(num!=0) {
			rem=num%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			num=num/10;
			
		}
		num=temp;
		if(num==sum) {
		System.out.println("Number is Armstrong ");
	}else {
		System.out.println("Number is not Armstrong");
	}

}
}
