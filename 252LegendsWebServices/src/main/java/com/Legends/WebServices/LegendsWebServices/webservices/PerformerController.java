package com.Legends.WebServices.LegendsWebServices.webservices;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Legends.WebServices.LegendsWebServices.model.Performers;
import com.Legends.WebServices.LegendsWebServices.service.LegendService;

@Controller
public class PerformerController {

		private final LegendService legendService;
		
		@Autowired
		public PerformerController(LegendService legendService) {
			this.legendService = legendService;
		}
		
		@RequestMapping(value = {"/performers.html"})
		public String showPerformerList(Map<String, Object> model) {
			Performers performers = new Performers();
			performers.getPerformerList().addAll(this.legendService.findPerformers());
			model.put("performers", performers);
			return "performers/peformerList";
		}
		@RequestMapping(value = {"/vets.json", "vets.xml"})
		public @ResponseBody Performers showResourcePerformerList() {
			Performers performers = new Performers();
			performers.getPerformerList().addAll(this.legendService.findPerformers());
			return performers;
		}
}
