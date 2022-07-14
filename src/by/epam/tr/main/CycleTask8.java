package by.epam.tr.main;

public class CycleTask8 {

	public static void main(String[] args) {
		// Найти сумму квадратов первых ста чисел.
		
		int a = 1;
		int b = 100;
		double sum = 0;
		
		for(int i = a; i <= b; i++) {
			sum = sum + Math.pow(i, 2);
		}
		
		System.out.println("a = " + a);
		System.out.println("b = " + b + "\n");
		System.out.println("sum = " + sum);
	}

}
