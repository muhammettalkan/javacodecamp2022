package getSetPractice;

public class Product {
	
	public Product(){
		System.out.println("Constructor has started.");
	}
	
	private int id;
	private String name;
	private String descriptipn;
	private double price;
	private int stockAmount;
	private String color;
	private String code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescriptipn() {
		return descriptipn;
	}
	public void setDescriptipn(String descriptipn) {
		this.descriptipn = descriptipn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCode() {
		return this.name.substring(0,1) + id;
	}

}
