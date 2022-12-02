package oopKodlamaIo.dataAccess;

import oopKodlamaIo.entities.Lecturer;

public class HibernateLecturerDao implements LecturerDao {

	@Override
	public void add(Lecturer lecturer) {
		System.out.println(lecturer + "is added to database with Hibernate.");
	}

}
