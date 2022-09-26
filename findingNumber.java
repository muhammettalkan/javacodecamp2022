package javademos;

public class findingNumbers {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int wanted = 5;
		boolean contains = false;
		
		for(int number : numbers) {
			if(number == wanted) {
				contains = true;
				break;
			}
		}
		if(contains) {
			System.out.println("It contains the wanted number.");
		}
		else {
			System.out.println("It doesn't contain the wanted number");
		}
	}

}
