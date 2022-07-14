package by.epam.tr.main;

public class LinearTask10 {

	public static void main(String[] args) {
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		
		double x1;
		double y1;
		double x2;
		double y2;
		
		x1 = 60.0;
		y1 = 120.0;
		
		x2 = Math.toRadians(x1);
		y2 = Math.toRadians(y1);
			
		double z1;
		double z2;
					
		z1 = (Math.sin(x2) + Math.cos(y2)) / (Math.cos(x2) - Math.sin(y2)) * Math.tan(x2 * y2);
		
		z2 = Math.toDegrees(z1);
		
		System.out.println("x1 = " + x1 + " gradus " + "\t y1 = " + y1 + " gradus ");
		System.out.println(" ");
		System.out.println("x2 = " + x2 + " rad " + "\t y2 = " + y2 + " rad ");
		System.out.println(" ");
		System.out.println("z1 = " + z1 + " rad ");
		System.out.println(" ");
		System.out.println("z2 = " + z2 + " gradus ");

	}

}
