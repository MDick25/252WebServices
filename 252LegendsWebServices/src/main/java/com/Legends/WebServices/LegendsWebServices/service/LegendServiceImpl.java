package com.Legends.WebServices.LegendsWebServices.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Legends.WebServices.LegendsWebServices.model.Event;
import com.Legends.WebServices.LegendsWebServices.model.EventType;
import com.Legends.WebServices.LegendsWebServices.model.Host;
import com.Legends.WebServices.LegendsWebServices.model.Performer;
import com.Legends.WebServices.LegendsWebServices.repository.EventRepository;
import com.Legends.WebServices.LegendsWebServices.repository.HostRepository;
import com.Legends.WebServices.LegendsWebServices.repository.PerformerRepository;

@Service
public class LegendServiceImpl implements LegendService {

	
		private PerformerRepository performerRepository;
		private EventRepository eventRepository;
		private HostRepository hostRepository;
		
		@Autowired
		public LegendServiceImpl(PerformerRepository performerRepository, EventRepository eventRepository, HostRepository hostRepository) {
			this.performerRepository = performerRepository;
			this.eventRepository = eventRepository;
			this.hostRepository = hostRepository;
		}
		
		@Override
		@Transactional(readOnly = true)
		public Collection<EventType> findEventTypes() throws DataAccessException{
			return eventRepository.findEventTypes();
			
		}
		@Override
		@Transactional(readOnly = true)
		public Performer findPerformerById(int id) throws DataAccessException{
			return performerRepository.findById(id);
		}
		@Override
		@Transactional(readOnly = true)
		public void savePerformer(Performer performer) throws DataAccessException{
			performerRepository.save(performer);
		}
		@Override
		@Transactional(readOnly = true)
		public void saveHost(Host host) {
			hostRepository.save(host);
		}
		@Override
		public Collection<Host> findByName(String name) throws DataAccessException{
			return hostRepository.findByName(name);
		}
		@Override
		public void saveEvent(Event event) throws DataAccessException{
			eventRepository.save(event);
		}
		@Override
		public Collection<Performer> findByEventId(int id) throws DataAccessException{
			return performerRepository.findByEventId(id);
		}
		
		@Override
		public Collection<Performer> findPerformers() throws DataAccessException{
			return performerRepository.findAll();
		}
		@Override
		public List<Event> findByPerformer(Integer id) throws DataAccessException{
			return eventRepository.findByPerformer(id);
		}
		
		
}
