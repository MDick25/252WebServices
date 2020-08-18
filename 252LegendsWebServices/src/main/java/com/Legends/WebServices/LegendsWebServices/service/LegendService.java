package com.Legends.WebServices.LegendsWebServices.service;

import java.util.Collection;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.Legends.WebServices.LegendsWebServices.model.Event;
import com.Legends.WebServices.LegendsWebServices.model.EventType;
import com.Legends.WebServices.LegendsWebServices.model.Host;
import com.Legends.WebServices.LegendsWebServices.model.Performer;

public interface LegendService {

		Collection<EventType> findEventTypes() throws DataAccessException;
		
		Performer findPerformerById(int id) throws DataAccessException;
		
		void savePerformer(Performer performer) throws DataAccessException;
		
		void saveHost(Host host) throws DataAccessException;
		
		Collection<Host> findByName(String name) throws DataAccessException;
		
		void saveEvent(Event event);
		
		Collection<Performer> findPerformers() throws DataAccessException;
		
		Collection<Performer> findByEventId(int eventId) throws DataAccessException;
		
		List<Event> findByPerformer(Integer performerId);
}
