package by.epam.tr.main;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
System.out.println("Enter tree real numbers:");
        
		Scanner sc;
		
		double num1;
		double num2;
		double num3;
				
		sc = new Scanner(System.in);
		System.out.print("num1 => ");
		num1 = sc.nextDouble();
						
		System.out.print("num2 => ");
		num2 = sc.nextDouble();
				
		System.out.print("num3 => ");
		num3 = sc.nextDouble();
		
		System.out.println(" ");
		System.out.println("num1 = " + num1 + "\t num2 = " + num2 + "\t num3 = " + num3);
		System.out.println(" ");
		
		System.out.println("Converted numbers:");
		
		if (num1 >= 0) {
			num1 = Math.pow(num1, 2);
			System.out.println("num1^2 = " + num1);
		} else {
			num1 = Math.pow(num1, 4);
			System.out.println("num1^4 = " + num1);
		}
		
		if (num2 >= 0) {
			num2 = Math.pow(num2, 2);
			System.out.println("num2^2 = " + num2);
		} else {
			num2 = Math.pow(num2, 4);
			System.out.println("num2^4 = " + num2);
		}
		
		if (num3 >= 0) {
			num3 = Math.pow(num3, 2);
			System.out.println("num3^2 = " + num3);
		} else {
			num1 = Math.pow(num3, 4);
			System.out.println("num3^4 = " + num3);
		}

	}

}
