package Kodlama.io.kodlamaIoDers.business.abstracts;

import java.util.List;

import Kodlama.io.kodlamaIoDers.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage callById(int id);
	List<ProgrammingLanguage> addPL(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> deletePL(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> updatePL(ProgrammingLanguage programmingLanguage);
	Boolean control(ProgrammingLanguage programmingLanguage);
	
}
