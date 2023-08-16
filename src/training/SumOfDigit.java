package training;

import java.util.Scanner;

public class SumOfDigit {
        public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num = scan.nextInt();
		
		int rem;
		int sum=0;
	
		
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);
		}
}
