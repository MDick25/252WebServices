package com.Legends.WebServices.LegendsWebServices.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
@Table(name= "event_host")
public class Host {
		
		@Column(name = "ID")
		private int id;
		@Column(name = "host_name")
		private String name;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "city")
		private String city;
		
		
}
