package classwork_day_3;

import java.util.Scanner;

public class positiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no: ");
		int n = sc.nextInt();

		if(n==0) {
			System.out.println("given number is 0");
		}else if(n<0) {
			System.out.println(n+" is negative number");
		}
		else {
			System.out.println(n+" is positive number");
		}
	}

}
