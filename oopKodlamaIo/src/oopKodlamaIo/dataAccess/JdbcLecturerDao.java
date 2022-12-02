package oopKodlamaIo.dataAccess;

import oopKodlamaIo.entities.Lecturer;

public class JdbcLecturerDao implements LecturerDao{

	@Override
	public void add(Lecturer lecturer) {
		System.out.println(lecturer + " added to database with jdbc.");
	}

}
