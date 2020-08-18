package com.Legends.WebServices.LegendsWebServices.repository;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import com.Legends.WebServices.LegendsWebServices.model.Event;
import com.Legends.WebServices.LegendsWebServices.model.EventType;

public interface EventRepository extends Repository<Event, Integer> {

	void save(Event event) throws DataAccessException;
	
	List<Event> findByPerformer(Integer performerId);
	
	List<EventType> findEventTypes();
	
	
}
