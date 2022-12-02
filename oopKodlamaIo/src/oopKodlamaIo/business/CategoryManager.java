package oopKodlamaIo.business;

import oopKodlamaIo.coreLogger.Logger;
import oopKodlamaIo.dataAccess.CategoryDao;
import oopKodlamaIo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		Category[] categories = {new Category("Web Programming",1), new Category("AppPrograming",2), new Category("Cyber Security",3)};
		for(Category category1 : categories) {
			if(category.getName() == category1.getName()) {
				throw new Exception("Category name shouldn't repeat.");
			}
		}
		categoryDao.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
