package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static constructor is worked.");
	}
	public ProductValidator() {
		System.out.println("Constructor is worked.");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void sth() {
		
	}
	
}
