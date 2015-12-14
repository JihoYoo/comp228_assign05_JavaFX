package com.game.jdbc.beans;

public class Player {

	// PRIVATE INSTANCE VARIABLES
	private int player_id;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _postalCode;
	private String _province;
	private String _phoneNumber;
	
	// PUBLIC PROPERTIES GETTERS
	public int getId() {
		return this.player_id;
	}
	public String getFirstName() {
		return this._firstName;
	}
	public String getLastName() {
		return this._lastName;
	}
	public String getAddress() {
		return this._address;
	}
	public String getPostalCode() {
		return this._postalCode;
	}
	public String getProvince() {
		return this._province;
	}
	public String getPhoneNumber() {
		return this._phoneNumber;
	}
			
	// PUBLIC PROPERTIES SETTERS
	public void setId(int player_id) {
		this.player_id = player_id;
	}
	public void setFirstName(String first_Name) {
		this._firstName = first_Name;
	}
	public void setLastName(String last_Name) {
		this._lastName = last_Name;
	}
	public void setAddress(String address) {
		this._address = address;
	}
	public void setPostalCode(String postal_Code) {
		this._postalCode = postal_Code;
	}
	public void setProvince(String province) {
		this._province = province;
	}
	public void setPhoneNumber(String phone_Number) {
		this._phoneNumber = phone_Number;
	}	
}
