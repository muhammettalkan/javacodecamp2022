package oopKodlamaIo.business;

import oopKodlamaIo.coreLogger.Logger;
import oopKodlamaIo.dataAccess.LecturerDao;
import oopKodlamaIo.entities.Lecturer;

public class LecturerManager {
	private LecturerDao lecturerDao;
	private Logger[] loggers;
	
	public LecturerManager(LecturerDao lecturerDao, Logger[] loggers) {
		this.lecturerDao = lecturerDao;
		this.loggers = loggers;
		}
	public void add(Lecturer lecturer) {
		lecturerDao.add(lecturer);
		for(Logger logger : loggers) {
			logger.log(lecturer.getFirstName() + lecturer.getLastName());
		}
	}
}
