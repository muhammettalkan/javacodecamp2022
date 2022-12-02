package oopKodlamaIo.entities;

public class Category {
	
	private String name;
	private int id;
	
	public Category() {
		super();
	}
	public Category(String name, int id) {
		this.id = id;
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
