package com.sai.SprRest.service;

import com.lib.pojo.passenger_profile;
 
public interface PassengerService {
     
	passenger_profile findById(int id);
     
    void savePassenger(passenger_profile passenger);
     
    void updatePassenger(passenger_profile passenger);
     
    void deletePassengerById(int id);
 
}