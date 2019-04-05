package org.isl.metier;

import java.util.List;

import org.isl.entities.Employe;

public interface EmployeMetier {
	public Employe saveEmploye(Employe e);
	public List<Employe> listEmployes();
}
