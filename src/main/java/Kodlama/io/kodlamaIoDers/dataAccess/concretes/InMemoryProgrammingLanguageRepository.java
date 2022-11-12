package Kodlama.io.kodlamaIoDers.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.kodlamaIoDers.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.kodlamaIoDers.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		super();
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Python"));
		programmingLanguages.add(new ProgrammingLanguage(3,"C#"));
	}

	@Override
	public void addNewPL(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void deletePL(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.remove(programmingLanguage);
	}

	@Override
	public void updatePL(ProgrammingLanguage programmingLanguage) {
		var item = callById(programmingLanguage.getId());
		item.setName(programmingLanguage.getName());
	}
	@Override
	public ProgrammingLanguage callById(int id) {
		for(ProgrammingLanguage programmingLanguage: programmingLanguages) {
			if(programmingLanguage.getId()==id) {
				return programmingLanguage;
			}
		}
		return null;
	}

	
		
	

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	

}
