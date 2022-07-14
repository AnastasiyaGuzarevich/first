package by.epam.tr.main;

public class LinerTask9 {

	public static void main(String[] args) {
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		
		double a;
		double b;
		double c;
		double d;
					
		double z;
		
		a = 1.0;
		b = 2.2;
		c = 4.1;
		d = 4.3;
						
		z = (a * b) / (c * d) - (a * b - c) / (c * d);
		
		System.out.println("a = " + a + "\t b = " + b + "\t c = " + c + "\t d = " + d);
		System.out.println(" ");
		System.out.println("z = " + z);

	}

}
