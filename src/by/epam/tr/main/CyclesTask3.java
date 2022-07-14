package by.epam.tr.main;

public class CyclesTask3 {

	public static void main(String[] args) {
		// Необходимо вывести на экран таблицу умножения на 3:
		
		int x = 3;
		int y = 1;
		int x1;
		
		while(y <= 10) {
			x1 = x * y;
			System.out.println(x + " * " + y + " = " + x1);
			y = y + 1;
		}
	}

}
