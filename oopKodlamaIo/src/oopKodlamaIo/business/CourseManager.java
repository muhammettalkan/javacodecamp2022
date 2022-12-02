package oopKodlamaIo.business;

import oopKodlamaIo.coreLogger.Logger;
import oopKodlamaIo.dataAccess.CourseDao;
import oopKodlamaIo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;

	}
	
	public void add(Course course) throws Exception{
		Course[] courses = {new Course(1, "C", 90, "Engin Demiroğ"), new Course(2, "JavaScript", 180, "Engin Demiroğ"), new Course(3, "C#", 150, "Engin Demiroğ")};
		for(Course course1 : courses) {
			if(course.getName() == course1.getName()) {
				throw new Exception("Course name shouldn't repeat.");
			}else if(course.getPrice()<0) {
				throw new Exception("Course price can not be lower than 0");
			}
		}
		courseDao.add(course);
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
