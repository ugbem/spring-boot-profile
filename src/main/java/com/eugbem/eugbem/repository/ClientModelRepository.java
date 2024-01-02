package com.eugbem.eugbem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eugbem.eugbem.model.ClientModel;

@Repository
public interface ClientModelRepository extends JpaRepository<ClientModel, Integer>{
	
	//List<ClientModel> findAll(ClientModel model);

}
