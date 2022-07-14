package by.epam.tr.main;

public class CycleTask10 {

	public static void main(String[] args) {
		// Составить программу нахождения разности кубов первых двухсот чисел
		
		int a = 1;
		int b = 200;
		double top = 0;
		
		for(int i = a; i <= b; i++) {
			top = top - Math.pow(i, 3);
		}
		
		System.out.println("a = " + a);
		System.out.println("b = " + b + "\n");
		System.out.println("top = " + top);

	}

}
