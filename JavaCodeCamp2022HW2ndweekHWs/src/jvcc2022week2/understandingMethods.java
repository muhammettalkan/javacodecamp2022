package jvcc2022week2;

public class understandingMethods {

	public static void main(String[] args) {
		findingNumbers();
		

	}
	
	public static void findingNumbers() {
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
			giveMessage("It contains the wanted number." +wanted);
		}
		else {
			giveMessage("It doesn't contain the wanted number"+wanted);
		}
	}
	public static void giveMessage(String message) {
		System.out.println(message);
	}
	
	
	
	
	
	
	
	
	

}
