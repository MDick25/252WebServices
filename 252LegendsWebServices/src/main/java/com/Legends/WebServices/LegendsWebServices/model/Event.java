package com.Legends.WebServices.LegendsWebServices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="event")
public class Event {
	
	@Id
	private int id;
	
	@Column(name = "event_name")
	private String eventName;
	
	@Column(name = "event_date")
	private Date eventDate;
	
	@OneToMany
	private List<Performer> performers;
	
	
	public String getEventName() {
		return eventName;
	}
	
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public List<Performer> getPerformers(){
		return performers;
	}
	public void setPerformers(List<Performer> performers) {
		this.performers = performers;
	}
	
	
}
