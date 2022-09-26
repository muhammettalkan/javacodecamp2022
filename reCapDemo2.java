package javademos;

public class reCapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1.9,7.2,4.3,3.6};
		double total=0;
		double max = myList[0];
		
		for (double number : myList) {
			if(max<number) {
			max = number;
			}
			total = total + number;
			System.out.println(number);
			
			
		}
		System.out.println("Sum =" + total);
		System.out.println("Biggest number is: " + max);

	}

}
