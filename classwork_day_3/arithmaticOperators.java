package classwork_day_3;
import java.util.Scanner;

public class arithmaticOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first no: ");
		int one = sc.nextInt();
		
		System.out.println("enter the two no: ");
		int two = sc.nextInt();
		
		System.out.println(one + two);
		System.out.println(one - two);
		System.out.println(one * two);
		System.out.println(one / two);
		System.out.println(one % two);
		System.out.println(one < two);
		System.out.println(one > two);
		System.out.println(one <= two);
		System.out.println(one >= two);
		System.out.println(one == two);
		System.out.println(one != two);
	}
}
