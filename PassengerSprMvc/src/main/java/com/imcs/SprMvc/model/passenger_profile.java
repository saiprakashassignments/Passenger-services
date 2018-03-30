package com.imcs.SprMvc.model;

public class passenger_profile {

	private int profile_id;
	private String password;
	private String first_name;
	private String last_name;
	private String address;
	private String tel_no;
	private String email_id;
	
	private Credit_card_details card_details;
	
	public passenger_profile() {
		super();
	}
	public Credit_card_details getCard_details() {
		return card_details;
	}
	public void setCard_details(Credit_card_details card_details) {
		this.card_details = card_details;
	}
	public int getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel_no() {
		return tel_no;
	}
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
}
