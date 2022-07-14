package by.epam.tr.main;

import java.util.Scanner;

public class BranchingTask5 {

	public static void main(String[] args) {
		// определитm по трем введенным сторонам, является ли данный треугольник
		// равносторонним.
		
		System.out.println("Enter the lengths of the 3 sides of the triangle:\n");

		Scanner sc;

		double sid1;
		double sid2;
		double sid3;

		sc = new Scanner(System.in);
		System.out.print("sid1 => ");
		sid1 = sc.nextDouble();

		System.out.print("sid2 => ");
		sid2 = sc.nextDouble();
		
		System.out.print("sid3 => ");
		sid3 = sc.nextDouble();

		System.out.println();
		System.out.println("sid1 = " + sid1 + " cm " + "\t sid2 = " + sid2 + " cm " + "\t sid3 = " + sid3 + " cm ");
		System.out.println();
		
		if((sid1 == sid2) && (sid2 == sid3)) {
			System.out.println("equilateral triangle = YES");							
		}else {
			System.out.println("equilateral triangle = NO");			
		}
				
	}

}
