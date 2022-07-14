package by.epam.tr.main;

import java.util.Scanner;

public class CycleTask6 {

	public static void main(String[] args) {
		// Напишите программу, где пользователь вводит любое целое положительное число. 
		//А программа суммирует все числа от 1 до введенного пользователем числа.
		
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter a positive integer > ");		
		while (!sc.hasNextInt()) {
		     sc.nextLine();
		     System.out.println();
		     System.out.print("Please enter a INTEGER > ");		     	    
		}
		n = sc.nextInt();
		System.out.println();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
			System.out.println("sum"+ i + " = " + sum);
		}
		
		System.out.println();
		System.out.println("sum = " + sum);
		   
		}
	}

