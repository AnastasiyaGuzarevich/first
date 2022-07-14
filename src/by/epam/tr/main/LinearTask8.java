package by.epam.tr.main;

public class LinearTask8 {

	public static void main(String[] args) {
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		
		int a;
		int b;
		int c;
		
		int d1;
		int d2;
		int d3;
		int d4;
		
		double z;
		
		a = 1;
		b = 2;
		c = 3;
		
		d1 = 2;
		d2 = 4;
		d3 = 3;
		d4 = - d1;
		
		
		z = (b + Math.sqrt(Math.pow(b, d1) + d2 * a * c)) / (d1 * a) - Math.pow(a, d3) * c + Math.pow(b, d4);
		
		System.out.println("a = " + a + "\t b = " + b + "\t c = " + c);
		System.out.println(" ");
		System.out.println("d1 = " + d1 + "\t d2 = " + d2 + "\t d3 = " + d3 + "\t d4 = " + d4);
		System.out.println(" ");
		System.out.println("z = " + z);

	}

}
