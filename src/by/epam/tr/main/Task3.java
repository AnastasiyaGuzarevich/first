package by.epam.tr.main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int x1 = 2;
		int x2;
		x2 = -x1;
		int x3 = 4;
		int x4;
		x4 = -x3;

		int y1 = 4;
		int y2 = 3;
		y2 = -y2;

		System.out.println("The shaded area:");
		System.out.println("x1 =  " + x1 + "\t y1 =  " + y1);
		System.out.println("x2 = " + x2 + "\t y1 =  " + y1);
		System.out.println("x3 =  " + x3 + "\t y2 = " + y2);
		System.out.println("x4 = " + x4 + "\t y2 = " + y2);
		System.out.println(" ");
		
		System.out.println("Set the coordinates (x,y):");

		Scanner sc;

		double x;
		double y;

		sc = new Scanner(System.in);
		System.out.print("x => ");
		x = sc.nextDouble();
		
		System.out.print("y => ");
		y = sc.nextDouble();

		System.out.println("Coordinates (x,y) = " + "(" + x + " , " + y + ")");
		System.out.println(" ");
		
		System.out.println("The coordinates belong to the shaded area:");

	    if ((y < y2) || (y > y1)) {
			System.out.println("FALSE");
	    } else if ((x < x4) || (x > x3)) {
	    	System.out.println("FALSE");
	    } else if ((x > x1) && (y > 0)) {
			System.out.println("FALSE");
		} else if ((x < x2) && (y > 0)) {
			System.out.println("FALSE");
		} else {
			System.out.println("TRUE");
		}

	}

}
