package com.sai.SprRest.controller;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.lib.pojo.passenger_profile;
import com.sai.SprRest.service.PassengerServiceImpl;
 
 
@RestController
public class HelloWorldRestController {
 
    @Autowired
    PassengerServiceImpl passengerServiceImpl;  //Service which will do all data retrieval/manipulation work
    
 
 
    //-------------------Retrieve Single Passenger--------------------------------------------------------
     
    @RequestMapping(value = "/passenger/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<passenger_profile> getPassenger(@PathVariable("id") int id) {
        System.out.println("Fetching passenger with id " + id);
        passenger_profile pp = passengerServiceImpl.findById(id);
        if (pp == null) {
            System.out.println("PAssenger with id " + id + " not found");
            return new ResponseEntity<passenger_profile>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<passenger_profile>(pp, HttpStatus.OK);
    }
 
     
     
    //-------------------Create a Passenger--------------------------------------------------------
     
    @RequestMapping(value = "/passenger/", method = RequestMethod.POST)
    public ResponseEntity<Void> createPassenger(@RequestBody passenger_profile pp,    UriComponentsBuilder ucBuilder) {
 
    	System.out.println("Creating Passenger " + pp.getProfile_id());
        passengerServiceImpl.savePassenger(pp);;
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/passenger/{id}").buildAndExpand(pp.getProfile_id()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
     
    //------------------- Update a Passenger --------------------------------------------------------
     
    @RequestMapping(value = "/passenger/{id}", method = RequestMethod.PUT)
    public ResponseEntity<passenger_profile> updatePassenger(@PathVariable("id") int id, @RequestBody passenger_profile ppf) {
        System.out.println("Updating User " + id);
         
        passenger_profile currentPassenger = passengerServiceImpl.findById(id);
         
        if (currentPassenger==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<passenger_profile>(HttpStatus.NOT_FOUND);
        }
 
      
        currentPassenger.setAddress(ppf.getAddress());
        currentPassenger.setCard_details(ppf.getCard_details());
        currentPassenger.setEmail_id(ppf.getEmail_id());
        currentPassenger.setFirst_name(ppf.getFirst_name());
        currentPassenger.setLast_name(ppf.getLast_name());
        currentPassenger.setPassword(ppf.getPassword());
        currentPassenger.setProfile_id(ppf.getProfile_id());
        currentPassenger.setTel_no(ppf.getTel_no());
        
        passengerServiceImpl.updatePassenger(currentPassenger);
        return new ResponseEntity<passenger_profile>(currentPassenger, HttpStatus.OK);
    }
 
    //------------------- Delete a User --------------------------------------------------------
     
    @RequestMapping(value = "/passenger/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<passenger_profile> deleteUser(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting User with id " + id);
 
        passenger_profile ppf = passengerServiceImpl.findById(id);
        if (ppf == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<passenger_profile>(HttpStatus.NOT_FOUND);
        }
 
        passengerServiceImpl.deletePassengerById(id);
        return new ResponseEntity<passenger_profile>(HttpStatus.NO_CONTENT);
    }
 
     
 
 
}