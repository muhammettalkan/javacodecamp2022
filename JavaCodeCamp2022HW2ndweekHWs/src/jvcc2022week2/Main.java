package jvcc2022week2;

public class Main {
	
	public static void main(String[] args) {
		String message = "Today weather is great";
		String newMessage = message.substring(0,2);
		System.out.println(newMessage);
		int number = sum(9,6);
		System.out.println(number);
		int sum = sum2(2,3,4,5,6,9,18);
		System.out.println(sum);
		
		//reference type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value type 
		int num1 =10;
		int num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num2);
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {3,4,5};
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		
	}
	
	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
		
	}
	
	public static void update() {
		System.out.println("Updated");
		
	}
	
	public static int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int sum2(int... numbers) {
		int sum =0;
		for(int number:numbers) {
			sum+=number;
			
		}
		return sum;
	}
	
	public static String giveCity(){
		return "Manisa";
	}
}
