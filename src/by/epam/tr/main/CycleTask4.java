package by.epam.tr.main;

public class CycleTask4 {

	public static void main(String[] args) {
		// С помощью оператора while напишите программу вывода всех четных чисел 
		//в диапазоне от 2 до 100 включительно.
		
		int x = 2;
		
		while(x <= 100) {
			System.out.print(x + " ");
			x = x + 2;
		}

	}

}
