package javaCCWeek3;

public class CarCreditManager implements ICreditManager{

	@Override
	public void Calculate() {
		System.out.println("Car credit is calculated");
		
	}

	@Override
	public void Save() {
		System.out.println("Saved.");
	}
	
}
