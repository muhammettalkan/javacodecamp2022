package javademos;

public class perfectNumbers {

	public static void main(String[] args) {
		int number = 13;
		int i,sum=0;
		for(i=1;i<number;i++) {
		
		
		if(number%i==0) {
			
			sum = sum +i;
			
		}
	}
		if(sum==number) {
			System.out.println(number +" is a perfect number.");
		}
		else {
			System.out.println(number + " is not a perfect number.");
		}

	}

}
