package by.epam.tr.main;

public class BranchingTask4 {

	public static void main(String[] args) {
		// Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		
		double a = 54;
		double b = 100;
		double min;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b + "\n");
				
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		
		System.out.println("a^2 = " + a);
		System.out.println("b^2 = " + b + "\n");		
		
		if(a < b) {
			min = a;					
		}else {
			min = b;			
		}
		
		System.out.println("min = " + min);
		
	}

}
