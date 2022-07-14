package by.epam.tr.main;

public class Task5 {

	public static void main(String[] args) {

		double num1;
		double num2;
		double num3;
		
		double max;
		double min;
		
		double summ;
		
		num1 = 6;
		num2 = 7;
		num3 = - 1.2;		
		
		System.out.println("num1 = " + num1 + "\t num2 = " + num2 + "\t num3 = " + num3);
		System.out.println(" ");
							
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		if(max < num3) {
			max = num3;
		} else if (min > num3) {
			min = num3;
		}
		System.out.println("max = " + max);
		System.out.println(" ");
		
		System.out.println("min = " + min);
		System.out.println(" ");
		
		summ = max + min;
		System.out.println("min + max = " + summ);
			
	}
}
