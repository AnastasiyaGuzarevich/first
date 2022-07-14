package by.epam.tr.main;

import java.util.Scanner;

public class BranchingTask2 {

	public static void main(String[] args) {
		// Составить программу сравнения введенного числа а и цифры 3. 
		//Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("Enter an integer > ");		
		while (!sc.hasNextInt()) {
		     sc.nextLine();
		     System.out.println();
		     System.out.print("Please enter a INTEGER > ");		     	    
		}
		a = sc.nextInt();
		System.out.println();
		
		int b = 3;
		
		if(a < b) {
			System.out.println("a < 3 => YES");
		}else {
			System.out.println("a > 3 = > NO");
		}
		

	}

}
