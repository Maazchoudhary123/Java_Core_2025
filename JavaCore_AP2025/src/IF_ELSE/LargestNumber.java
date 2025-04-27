package IF_ELSE;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=s.nextInt();
		System.out.println("Enter second number");
		int second=s.nextInt();
		System.out.println("Enter third number");
		int third=s.nextInt();
		if(first>=second && first>=third) {
			System.out.println(first +"Largest is first");
		}
		else if(second>=third) {
			System.out.println(second +"second is largets");
		}
		else {
			System.out.println(third+"third is largest");
		}
		

	}

}
