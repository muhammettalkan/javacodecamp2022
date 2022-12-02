package oopKodlamaIo.dataAccess;

import oopKodlamaIo.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category +"added to database with hibernate.");
	}
	

}
