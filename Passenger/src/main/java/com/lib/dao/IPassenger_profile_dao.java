package com.lib.dao;

import java.util.List;

import com.lib.pojo.passenger_profile;

public interface IPassenger_profile_dao {
	
	public void addPassenger(passenger_profile profile);
	public passenger_profile loadPassenger(int profile_id) ;
	public void updatePassenger(passenger_profile std);
	public void deletePassenger(int profile_id);

}
