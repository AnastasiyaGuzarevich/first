package by.epam.tr.main;

public class BranchingTask1 {

	public static void main(String[] args) {
		// Составить программу сравнения двух чисел 1 и 2. 
		//Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.
		//Если 1 меньше 2 – вывести на экран слово «yes», в противном
		//случае – слово «no»
		
		int a = 54;
		int b = 100;
		
		System.out.println("a = " + a + " b = " + b + "\n");
				
		if(a < b) {
			System.out.println("a < b => 7");
			System.out.println("YES");
		}else {
			System.out.println("a > b => 8");
			System.out.println("NO");
		}
			

	}

}
