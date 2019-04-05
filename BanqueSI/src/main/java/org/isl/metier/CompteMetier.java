package org.isl.metier;

import org.isl.entities.Compte;

public interface CompteMetier {
	public Compte saveCompte(Compte cp);
	public Compte getcompte (String code);

}
