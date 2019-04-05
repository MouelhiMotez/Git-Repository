package org.isl.metier;

import java.util.List;

import org.isl.dao.EmployeRepository;
import org.isl.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeMetierImpl implements EmployeMetier {

	@Autowired
	// On fait appel à couche DAO 
	private EmployeRepository employeRepository;
	@Override
	public Employe saveEmploye(Employe e) {
		// TODO Auto-generated method stub
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> listEmployes() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

}
