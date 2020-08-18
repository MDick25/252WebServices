package com.Legends.WebServices.LegendsWebServices.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Performers {

		private List<Performer> performers;
		
		@XmlElement
		public List<Performer> getPerformerList(){
			if(performers == null) {
				performers = new ArrayList<>();
			}
			return performers;
		}
}
