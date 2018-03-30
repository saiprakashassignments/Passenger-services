package com.sai.SprRest.service;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lib.dao.Credit_card_details_dao;
import com.lib.dao.ICredit_card_details_dao;
import com.lib.dao.IPassenger_profile_dao;
import com.lib.dao.Passenger_profile_dao;
import com.lib.pojo.Credit_card_details;
import com.lib.pojo.passenger_profile;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {

	/*@Autowired
	private Passenger_profile_dao Passenger_profile_dao;
*/
	@Override
	public void savePassenger(passenger_profile passenger) {
		
		IPassenger_profile_dao ppd=new Passenger_profile_dao();
		ICredit_card_details_dao iccd=new Credit_card_details_dao();
		
		/*Credit_card_details ccd=new Credit_card_details();
		ccd.setCard_number(1);
		ccd.setExpiration_month(new Date());
		ccd.setExpiration_year(new Date());
		ccd.setProfile_id(1);*/
		
		ppd.addPassenger(passenger);
	}

	@Override
	public void updatePassenger(passenger_profile passenger) {
		IPassenger_profile_dao ppd=new Passenger_profile_dao();
		ppd.updatePassenger(passenger);
	}

	@Override
	public void deletePassengerById(int id) {
		IPassenger_profile_dao ppd=new Passenger_profile_dao();
		ppd.deletePassenger(id);
	}

	@Override
	public passenger_profile findById(int id) {
		IPassenger_profile_dao ppd=new Passenger_profile_dao();
		passenger_profile pp = ppd.loadPassenger(id);
		return pp;
	}

}