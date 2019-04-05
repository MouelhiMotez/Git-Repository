package org.isl.dao;

import org.isl.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

//Créer une interface pour gérer les clients
public interface ClientRepository extends JpaRepository<Client, Long> {

}
