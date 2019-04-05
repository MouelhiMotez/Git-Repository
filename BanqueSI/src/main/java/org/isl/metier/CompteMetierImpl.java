package org.isl.metier;

import org.isl.dao.CompteRepository;
import org.isl.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteMetierImpl implements CompteMetier {

	@Autowired
	private CompteRepository compteRepository; 
	
	@Override
	public Compte saveCompte(Compte cp) {
		// TODO Auto-generated method stub
		return compteRepository.save(cp);
	}

	@Override
	public Compte getcompte(String code) {
		// TODO Auto-generated method stub
		return compteRepository.getOne(code);
	}
	

}
