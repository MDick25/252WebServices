package com.Legends.WebServices.LegendsWebServices.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import com.Legends.WebServices.LegendsWebServices.model.Performer;

public interface PerformerRepository extends Repository<Performer, Integer> {
	
	Performer findById(int id);
	
	void save(Performer performer);
	
	Collection<Performer> findByEventId(int id);
	
	Collection<Performer> findAll() throws DataAccessException;
	
	

}
