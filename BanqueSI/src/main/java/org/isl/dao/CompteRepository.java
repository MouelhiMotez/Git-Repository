package org.isl.dao;

import org.isl.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

//Créer une interface pour gérer les comptes
public interface CompteRepository extends JpaRepository<Compte, String> {

}
