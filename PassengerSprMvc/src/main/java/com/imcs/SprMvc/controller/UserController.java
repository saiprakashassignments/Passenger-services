package com.imcs.SprMvc.controller;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.imcs.SprMvc.model.passenger_profile;

@Controller
public class UserController {

	
	@RequestMapping(value="findInformation",method=RequestMethod.POST)
	public String findInformation(@RequestParam int cust_id, Model model) {
		System.out.println("find information called");

		
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8085/PassengerRest/passenger/";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl+""+cust_id , String.class);
		
		model.addAttribute("customers", response.getBody());
		
		return "custid";
	}

	@RequestMapping("updateInformation")
	public String updateInformation(@ModelAttribute("passenger") passenger_profile passenger,Model model) {
		System.out.println("update information called");

		
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8085/PassengerRest/passenger/";
		
		  restTemplate.put(fooResourceUrl, passenger);
		return "landing";
	}
	
	
	
	@RequestMapping("deleteInformation")
	public String deleteInformation(@ModelAttribute("profile_id") int profile_id,Model model) {
		System.out.println("delete information called");

		
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8085/PassengerRest/passenger/";
		  restTemplate.put(fooResourceUrl+profile_id,profile_id);
		return "landing";
	}
	
	
	
	
	@RequestMapping(value="processInformation",method=RequestMethod.POST)
	public String processInformation(@ModelAttribute("passenger") passenger_profile cut,BindingResult result, Model model) {

		System.out.println("process information called");
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8085/PassengerRest/passenger/";
		
		
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
		
		
		HttpEntity<passenger_profile> request = new HttpEntity<passenger_profile>(cut);
		System.out.println("request boddy /t"+request.getBody().getAddress());
		ResponseEntity<passenger_profile> response = restTemplate
		  .exchange(fooResourceUrl, HttpMethod.POST, request, passenger_profile.class);
		  System.out.println(response.getBody()+"/t"+response.getStatusCode());
		return "landing";

	}
	
	@RequestMapping("redirection")
	public String redirection() {
		System.out.println("redirection called");
		//model.addAttribute("customer", new Customers());
		return "landing";
	}
	
	@RequestMapping("redirecttoinfo")
	public String redirectToInfo(Model model) {
		System.out.println("redirection called");
		model.addAttribute("passenger",new passenger_profile());
	
		return "info";
	}
	
	

}