package Kodlama.io.kodlamaIoDers.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.kodlamaIoDers.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.kodlamaIoDers.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.kodlamaIoDers.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}


	@Override
	public ProgrammingLanguage callById(int id) {
		return programmingLanguageRepository.callById(id);
	}


	@Override
	public List<ProgrammingLanguage> addPL(ProgrammingLanguage programmingLanguage) {
		if(control(programmingLanguage)) {
			programmingLanguageRepository.addNewPL(programmingLanguage);
		}
		return null;
	}


	@Override
	public List<ProgrammingLanguage> deletePL(ProgrammingLanguage programmingLanguage) {
		return null;
	}


	@Override
	public List<ProgrammingLanguage> updatePL(ProgrammingLanguage programmingLanguage) {
		return null;
	}


	@Override
	public Boolean control(ProgrammingLanguage programmingLanguage) {
		var listItem = getAll();
		if(programmingLanguage.getName() == null || programmingLanguage.getName().trim() =="") {
			return false;
		}
		for(ProgrammingLanguage item : listItem) {
			if(item.getName().toLowerCase().equals(programmingLanguage.getName().toLowerCase())) {
				return false;
			}
		}
		return null;
	}
	
}
