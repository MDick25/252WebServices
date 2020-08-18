package com.Legends.WebServices.LegendsWebServices.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.Legends.WebServices.LegendsWebServices.model.Host;

public interface HostRepository extends Repository<Host, Integer> {
	
	@Query("SELECT DISTINCT host FROM Host host left join fetch host.name WHERE host.name LIKE : name%")
	Collection<Host> findByName(@Param("name") String name );
	
	@Query("SELECT host FROM Host host left join fetch host.name WHERE host.id =:id ")
	Host findById(@Param("id") int id);
	
	void save(Host host);
	
	

}
