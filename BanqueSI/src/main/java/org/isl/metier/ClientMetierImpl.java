package org.isl.metier;

import java.util.List;

import org.isl.dao.ClientRepository;
import org.isl.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service : permettre à spring de concidéré que la class "ClientMetierImpl" est un bean Spring (Objet Spring)
// utilisé généralement pour les objets de la couche métier
// Si on utilise pas @Service, l'injection @Autowired ne marchera pas !
@Service
public class ClientMetierImpl implements ClientMetier {
	
	// Demander à spring d'injécter une implémentation de l'interface "ClientRepository"
	@Autowired
	// On fait appel à couche DAO
	private ClientRepository clientRepository; 

	@Override
	public Client saveClient(Client c) {
		
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		
		return clientRepository.findAll();
	}
	

}
