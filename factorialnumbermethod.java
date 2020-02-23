package factorialnumber;

import java.util.Scanner;

public class factorialnumbermethod {
	
	
	public static int factorial(int number) {
		int ifactorial= 1;
		for(int i=1;i<=number;i++) {
			ifactorial= ifactorial*i;
		}
		return ifactorial;
	}

	public static void main(String[] args) {

		Scanner factor= new Scanner(System.in);
		
		System.out.println("Introduce a number to get its factorial:");
		
		int number= factor.nextInt();
		
		System.out.println(factorial(number));

	}

}
