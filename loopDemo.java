package javademos;

public class loopDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("For loop is over.");
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
			
		}
		System.out.println("While loop is over.");
		
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		
		System.out.println("Do-While loop is over.");
		
		
		
		
		
	}
	
	

}
