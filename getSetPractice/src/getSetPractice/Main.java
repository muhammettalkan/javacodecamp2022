package getSetPractice;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescriptipn("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(7);
		
		System.out.println(product.getCode());
	}

}
