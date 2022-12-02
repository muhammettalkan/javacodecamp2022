package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Coffee Machine");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setImageUrl("photo1.jpg");
		product1.setUnitsInStock(3);
		
		

		Product product2 = new Product();
		product2.setName("Smeg Coffee Machine");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setImageUrl("photo2.jpg");
		product2.setUnitsInStock(3);
		
		

		Product product3 = new Product();
		product3.setName("Kitchen Coffee Machine");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setImageUrl("photo3.jpg");
		product3.setUnitsInStock(3);
		
		
		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("05324905239");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Mesut");
		individualCustomer.setLastName("Yoyo");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhoneNumber("059235275");
		corporateCustomer.setTaxNumber("21312");
		corporateCustomer.setCustomerNumber("54321");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
	
	
	}
	
	

	

}
