package oopKodlamaIo.dataAccess;

import oopKodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course + " added to database with jdbc.");
	}

	@Override
	public void delete(Course course) {
		System.out.println(course + " deleted from database with jdbc.");
	}

	@Override
	public void update(Course course) {
		System.out.println(course + " is updated with jdbc");
	}

}
