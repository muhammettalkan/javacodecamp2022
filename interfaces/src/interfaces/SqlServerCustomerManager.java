package interfaces;

public class SqlServerCustomerManager implements ICustomerDal,IRepository{

	@Override
	public void add() {
		System.out.println("Added to SQL Server");
		
	}

}
