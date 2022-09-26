package javademos;

public class MiniProjectPrimeNumber {

	public static void main(String[] args) {
		int number = -7;
		int remainder = number %2;
		//System.out.println(remainder);
		boolean isPrime = true;
		if(number==1) {
			System.out.println(number +" is not a prime number");
			return;
			
		}
		
		
		if(number<1) {
			System.out.println("Invalid number.");
			return;
		}
		
		for (int i=2; i< number; i++) {
			if(number %2 == 0) {
				isPrime = true;
			}
		}
			 if(isPrime) {
				 System.out.println(number +" is a prime number");
			 }
			 else {
				System.out.println(number +" is not a prime number");
			}
		}


	}
