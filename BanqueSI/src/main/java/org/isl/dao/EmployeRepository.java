package org.isl.dao;

import org.isl.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

// Créer une interface pour gérer les employer
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
