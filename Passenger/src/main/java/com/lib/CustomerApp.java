package com.lib;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.lib.dao.Credit_card_details_dao;
import com.lib.dao.ICredit_card_details_dao;
import com.lib.dao.IPassenger_profile_dao;
import com.lib.dao.Passenger_profile_dao;
import com.lib.pojo.Credit_card_details;
import com.lib.pojo.passenger_profile;

public class CustomerApp {
	
	
	final static Logger log = Logger.getLogger(CustomerApp.class);

	public static void main(String[] args)  {

		IPassenger_profile_dao ppd=new Passenger_profile_dao();
		ICredit_card_details_dao iccd=new Credit_card_details_dao();
		
		Credit_card_details ccd=new Credit_card_details();
		ccd.setCard_number(1);
		ccd.setExpiration_month(new Date());
		ccd.setExpiration_year(new Date());
		ccd.setProfile_id(1);
		
		iccd.addCreditcarddetials(ccd);
		
		passenger_profile ppf=new passenger_profile();
		ppf.setAddress("dallas");
		ppf.setCard_details(ccd);
		ppf.setEmail_id("abc@test");
		ppf.setFirst_name("sai");
		ppf.setLast_name("prakash");
		ppf.setPassword("check");
		ppf.setProfile_id(1);
		ppf.setTel_no("1234");
		
		ppd.addPassenger(ppf);
		
	}
}
