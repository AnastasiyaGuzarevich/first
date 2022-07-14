package by.epam.tr.main;

public class Task1 {

	public static void main(String[] args) {
		
		int number = 5468;
		System.out.println("Number = " + number);
		System.out.println(" ");

		int a = number / 1000;
		int b = number / 100 - a * 10;
		int c = number / 10 - (a * 100 + b * 10);
		int d = number % 10;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println(" ");

		if (a + b == c + d) {
			System.out.println("a+b = c+d - TRUE");
		} else {
			System.out.println("a+b = c+d - FALSE");
		}
	}

}
