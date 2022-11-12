package Kodlama.io.kodlamaIoDers.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.kodlamaIoDers.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository {
	void addNewPL(ProgrammingLanguage programmingLanguage);
	void deletePL(ProgrammingLanguage programmingLanguage);
	void updatePL(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage callById(int id);
	List<ProgrammingLanguage> getAll();
}
