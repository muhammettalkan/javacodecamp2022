package Kodlama.io.kodlamaIoDers.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.kodlamaIoDers.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.kodlamaIoDers.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	@GetMapping("/callbyid")
	public ProgrammingLanguage callById(int id){
		return programmingLanguageService.callById(id);
	}
	@PostMapping
	public List<ProgrammingLanguage> addPL(ProgrammingLanguage programmingLanguage){
		return programmingLanguageService.addPL(programmingLanguage);
		
	}
	@DeleteMapping
	public List<ProgrammingLanguage> deletePL(ProgrammingLanguage programmingLanguage){
		return programmingLanguageService.deletePL(programmingLanguage);
		
	}
	@PutMapping
	public List<ProgrammingLanguage> updatePL(ProgrammingLanguage programmingLanguage){
		return programmingLanguageService.updatePL(programmingLanguage);
		
	}
	
	
	
	
	
	
	
	
}
