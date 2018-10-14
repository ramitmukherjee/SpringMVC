package com.ramit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ramit.models.PetVO;
import com.ramit.services.PetServiceImpl;

@Controller
public class PetController {
	
	@Autowired
	private PetServiceImpl petService;
	
	@RequestMapping(value="createPet")
	public String createPet (@ModelAttribute PetVO pet, BindingResult result, Model model) {
		
		System.out.println("Error Count: " + result.getErrorCount());
		if (null != pet
				&& !StringUtils.isEmpty(pet.getPetName( ))
				&& !StringUtils.isEmpty(pet.getPetType())) {
			petService.createPet(pet);
		}
		model.addAttribute("pets", petService.getAllPets());
		return "create-pet";
	}
	
	@RequestMapping (value="deletePet", method=RequestMethod.POST)
	public String deletePet (@ModelAttribute PetVO pet, Model model) {
		if (!StringUtils.isEmpty(pet.getPetName())) {
			petService.deletePet(pet);
		}
		
		model.addAttribute("pets", petService.getAllPets());
		return "create-pet";
	}

	public PetServiceImpl getPetService() {
		return petService;
	}

	public void setPetService(PetServiceImpl petService) {
		this.petService = petService;
	}
	
}
