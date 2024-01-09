package com.eugbem.eugbem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eugbem.eugbem.model.ClientModel;
import com.eugbem.eugbem.repository.ClientModelRepository;

@Service
@Transactional
public class ClientModelService {
	
	@Autowired
	private ClientModelRepository repository;
	
	public void addPost(ClientModel client) {
		repository.save(client);
	}
	
	public List<ClientModel> findAll(){
		return repository.findAll();
		
	}

}
