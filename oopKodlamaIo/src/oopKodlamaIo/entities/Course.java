package oopKodlamaIo.entities;

public class Course {
	private int id;
	private String name;
	private double price;
	private String lecturer;
	
	public Course(){
		super();
	}
	
	public Course(int id,String name,double price,String lecturer) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.lecturer = lecturer;
	}
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	
}
