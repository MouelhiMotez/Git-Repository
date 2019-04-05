package org.isl.services;

import org.isl.entities.Compte;
import org.isl.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteRestService {
	
	@Autowired
	private CompteMetier compteMetier;

	@RequestMapping(value="/comptes", method=RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte cp) {
		return compteMetier.saveCompte(cp);
	}

	@RequestMapping(value="/compte/{code}", method=RequestMethod.GET)
	public Compte getcompte(@PathVariable String code) {
		return compteMetier.getcompte(code);
	}
}
	