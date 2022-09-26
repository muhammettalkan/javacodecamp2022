package javademos;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] cities = new String [3][3];
		
		cities [0][0] = "Istanbul";
		cities [0][1] = "Kocaeli";
		cities [0][2] = "Bursa";
		cities [1][0] = "Gaziantep";
		cities [1][1] = "Diyarbakir";
		cities [1][2] = "Mardin";
		cities [2][0] = "Zonguldak";
		cities [2][1] = "Samsun";
		cities [2][2] = "Trabzon";
		
		for(int i = 0; i<=2; i++) {
			System.out.println("----------");
			for(int j=0; j<=2; j++) {
				System.out.println(cities[i][j]);
			}
		}

	}

}
