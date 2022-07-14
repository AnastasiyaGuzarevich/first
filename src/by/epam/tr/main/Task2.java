package by.epam.tr.main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Right triangle cathets:");

		Scanner sc;

		double kat1;
		double kat2;

		sc = new Scanner(System.in);
		System.out.print("kat1 => ");
		kat1 = sc.nextDouble();

		System.out.print("kat2 => ");
		kat2 = sc.nextDouble();

		System.out.println(" ");
		System.out.println("kat1 = " + kat1 + " cm " + "\t kat2 = " + kat2 + " cm ");
		System.out.println(" ");

		double p;
		double s;

		p = Math.sqrt(Math.pow(kat1, 2) + Math.pow(kat2, 2)) + kat1 + kat2;
		System.out.println("The perimeter of the triangle:");
		System.out.println("p = " + p + " cm ");
		System.out.println(" ");

		s = 0.5 * kat1 * kat2;
		System.out.println("The area of the triangle:");
		System.out.println("s = " + s + " cm2");

	}

}
