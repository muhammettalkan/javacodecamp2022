package javademos;

public class recapDemo1 {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 25;
		int number3 = 2;
		int biggestNum = number1;
		
		if (biggestNum<number2) {
			
			biggestNum = number2;
			
		} if (biggestNum<number3) {
			number3 = biggestNum;
		}
			System.out.println("Biggest number is :" + biggestNum);
		
	}

}
