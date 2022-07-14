package by.epam.tr.main;

public class CycleTask7 {

	public static void main(String[] args) {
		// Вычислить значения функции на отрезке [а,b] c шагом h:
		
		double a = 1.0;
		double b = 3.5;
		double h = 0.2;
		double y;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x" , "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <= b; x = x + h) {
			if(x > 2) {
				y = x;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}else {
				y = -x;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}
		}
		
		System.out.print("---------------------------------");

	}

}
