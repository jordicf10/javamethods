package primusnumbersmethod;

import java.util.Scanner;

public class primusnumbersmethod {
	
	public static boolean isornotprimus (int number) {
		
		if(number<=1) {
			return false;
		}
			
		int sqroot= (int)Math.sqrt(number);
		
		int divisibles= 0;
		
		for(int i=sqroot;i>1;i--) {
			if(number%i==0) {
				divisibles+=1;
			}
		}
		
		if(divisibles<1) {
			return true;
		}
		else {
		
			return false;
		}
	}
		

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		System.out.println("Introduce your number to find out if it's a primus number:");
		
		int number= num.nextInt();
		
		if(isornotprimus(number)) {
			System.out.println("Your number " + number + " is a primus number.");
		}
		else {
			System.out.println("Your number " + number + " is not a primus number.");
		}

	}

}
	

