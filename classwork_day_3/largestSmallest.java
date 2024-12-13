package classwork_day_3;

import java.util.Scanner;

public class largestSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first no: ");
		int one = sc.nextInt();
		
		System.out.println("enter the two no: ");
		int two = sc.nextInt();
		
		if(one > two) {
			System.out.println(one+" is greater than "+two);
		}else if(one == two) {
			System.out.println(one+" and "+two+" is equal");
		}
		else {
			System.out.println(two+" is greater than "+one);
		}
	}

}
