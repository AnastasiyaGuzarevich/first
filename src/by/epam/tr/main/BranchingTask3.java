package by.epam.tr.main;

public class BranchingTask3 {

	public static void main(String[] args) {
		// Составить программу: равны ли два числа а и b?
		// определения наименьшего из двух чисел а и b.
		// определения наибольшего из двух чисел а и b.
		
		int a = 54;
		int b = 100;
		int max;
		int min;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b + "\n");
				
		if(a == b) {
			System.out.println("a = b => YES\n");
		}else {
			System.out.println("a = b => NO\n");
		}
		
		if(a < b) {
			min = a;
			max = b;			
		}else {
			min = b;
			max = a;
		}
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}

}
