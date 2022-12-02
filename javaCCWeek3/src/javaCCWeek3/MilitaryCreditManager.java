package javaCCWeek3;

public class MilitaryCreditManager implements ICreditManager, BaseCreditManager {

	@Override
	public void Calculate() {
		System.out.println("Soldier credit is calculated");
	}

	@Override
	public void Save() {
		System.out.println("Saved.");
	}

}
