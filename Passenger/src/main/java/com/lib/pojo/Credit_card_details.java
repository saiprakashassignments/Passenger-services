package com.lib.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Credit_card_details {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int profile_id;
	private int card_number;
	private Date expiration_month;
	private Date expiration_year;

	public int getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}

	public int getCard_number() {
		return card_number;
	}

	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}

	public Date getExpiration_month() {
		return expiration_month;
	}

	public void setExpiration_month(Date expiration_month) {
		this.expiration_month = expiration_month;
	}

	public Date getExpiration_year() {
		return expiration_year;
	}

	public void setExpiration_year(Date expiration_year) {
		this.expiration_year = expiration_year;
	}
}
