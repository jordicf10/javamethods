package methodareas;

import java.util.Scanner;

public class methodareas {
	
	public static double circlearea(double radius) {
		return Math.pow(radius, 2)*Math.PI;
	}
	
	public static double trianglearea(double base, double height) {
		return (base*height)/2;
	}
	
	public static double squarearea(double side) {
		return side*side;
	}

	public static void main(String[] args) {
		Scanner area= new Scanner(System.in);
		
		System.out.println("Choose what area do you want to find out:\n1. Circle\n2.Triangle\n3.Square");
		
		int option= area.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Introduce radius to know area:");
			double radius=area.nextDouble();
			double finalarea=circlearea(radius);
			System.out.println(Math.round(finalarea*100.00)/100.00); //Print only two decimals
			break;
			
		case 2:
			System.out.println("Introduce base to know area:");
			double base= area.nextDouble();
			System.out.println("And now height:");
			double height=area.nextDouble();
			double finaltriangle=trianglearea(base,height);
			System.out.println(Math.round(finaltriangle*100.00)/100.00);
			break;
			
		case 3:
			System.out.println("Introduce side to know area:");
			double side= area.nextDouble();
			double finalsquare=squarearea(side);
			System.out.println(Math.round(finalsquare*100.00)/100.00);
			break;
		}

	}

}
