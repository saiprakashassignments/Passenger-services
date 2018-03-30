package com.lib.dao;

import com.lib.pojo.Credit_card_details;
import com.lib.pojo.passenger_profile;

public interface ICredit_card_details_dao {
	
	public void addCreditcarddetials(Credit_card_details profile);
	public Credit_card_details loadCreditcarddetails(int profile_id) ;
	public void updateCreditcarddetails(Credit_card_details std);
	public void deleteCreditcarddetails(int profile_id);
}
