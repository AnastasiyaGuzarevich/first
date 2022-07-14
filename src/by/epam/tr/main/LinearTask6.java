package by.epam.tr.main;

public class LinearTask6 {

	public static void main(String[] args) {
		//Написать код для решения задачи. В n малых бидонах 80 л молока. 
		//Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
		
		int n;       // кол-во малых бидонов
		int litN;    // всего л молока в маллых бидонах
		int m;       // кол-во больших бидонов
		int litRaz;  // на столько л молока больше в одном большом бидоне
		
		double litM; // всего л молока в больших бидонах
		
		n = 5;
		litN = 80;
		litRaz = 12;
		m = 4;
		
		litM = (litN / n + litRaz) * m;
		
		System.out.println("number of small cans = " + n);
		System.out.println(" ");
		System.out.println("total liters of milk in small cans = " + litN + " L ");
		System.out.println(" ");
		System.out.println("number of large cans = " + m);
		System.out.println(" ");
		System.out.println("total liters of milk in large cans = " + litM + " L ");

	}

}
