package org.isl.services;

import java.util.List;

import org.isl.entities.Client;
import org.isl.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Définir un controller qui va fonctionner en mode REST
@RestController
public class ClientRestService {
	
	// Pour faire l'injéction des dépendances.
	@Autowired
	private ClientMetier clientMetier;

	// @RequestMapping : pour accéder à saveClient
	// en RESTfull : utilisé la méthode POST pour rajouter
	@RequestMapping(value="/clients", method=RequestMethod.POST)
	
	// Le résultat va etre générer en format JSON dans le corp de la réponse.
	// @ResponseBody : pas besoin de la mettre car en utilise @RestController
	
	// @RequestBody : indiquer à Spring qu'il devrais récupérer les données du client dans le corps de la requete, et ces données là sont en format JSON
	public Client saveClient(@RequestBody Client c) {
		return clientMetier.saveClient(c);
	}
	
	// en RESTfull : utilisé la méthode GET pour consulter
	@RequestMapping(value="/clients", method=RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	} 

}
