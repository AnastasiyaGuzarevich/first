package by.epam.tr.main;

public class CycleTask9 {

	public static void main(String[] args) {
		// Составить программу нахождения произведения квадратов первых двухсот чисел.
		
		int a = 1;
		int b = 200;
		double ter = 1;
		
		for(int i = a; i <= b; i++) {
			ter = ter * Math.pow(i, 2);
		}
		
		System.out.println("a = " + a);
		System.out.println("b = " + b + "\n");
		System.out.println("ter = " + ter);

	}

}
