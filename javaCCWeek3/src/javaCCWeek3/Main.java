package javaCCWeek3;

public class Main {

	public static void main(String[] args) {
		/*int number1 =10;
		int number2 = 20;
		number1 = number2;
		number2=100;
		
		//System.out.println(number1);
		
		int[] numbers1 = {1,2,3};
		int[] numbers2 = {10,20,30};
		
		numbers1 = numbers2;
		numbers2[0] = 1000;
		
		//System.out.println(numbers1[0]);
		
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.say();
		
		Customer customer = new Customer();
		customer.id =1;
		customer.city = "Manisa";
		
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.taxNumber = "1000";
		company.companyName = "Arcelik";
		company.id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();*/
		
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
		customerManager.GiveCredit();
		
		
	}
		

}
