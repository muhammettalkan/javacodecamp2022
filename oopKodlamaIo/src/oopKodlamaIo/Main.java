package oopKodlamaIo;

import oopKodlamaIo.business.CategoryManager;
import oopKodlamaIo.business.CourseManager;
import oopKodlamaIo.business.LecturerManager;
import oopKodlamaIo.coreLogger.DatabaseLogger;
import oopKodlamaIo.coreLogger.FileLogger;
import oopKodlamaIo.coreLogger.Logger;
import oopKodlamaIo.coreLogger.MailLogger;
import oopKodlamaIo.dataAccess.HibernateCourseDao;
import oopKodlamaIo.dataAccess.JdbcCategoryDao;
import oopKodlamaIo.dataAccess.JdbcLecturerDao;
import oopKodlamaIo.entities.Category;
import oopKodlamaIo.entities.Course;
import oopKodlamaIo.entities.Lecturer;


public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};

        Category category1 = new Category("Programming", 1);
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        Course course1 = new Course(1, "Java", 150, "");
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);

        Lecturer lecturer = new Lecturer(1, "Engin", "Demiroğ");
        LecturerManager lecturerManager = new LecturerManager(new JdbcLecturerDao(),loggers);
        lecturerManager.add(lecturer);
    }
}