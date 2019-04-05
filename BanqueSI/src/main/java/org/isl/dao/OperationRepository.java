package org.isl.dao;

import org.isl.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

//Créer une interface pour gérer les operations
public interface OperationRepository extends JpaRepository<Operation, Long> {

}
