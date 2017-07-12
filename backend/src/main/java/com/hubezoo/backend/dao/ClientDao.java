package com.hubezoo.backend.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hubezoo.backend.model.Client;
@Repository
@Transactional
public interface ClientDao extends CrudRepository<Client,Integer> {
	
	boolean addClient(Client client);
	boolean updateClinet(Client client);
	List<Client> allClient();
	Client getClientByClientId(Long clientId);

}
