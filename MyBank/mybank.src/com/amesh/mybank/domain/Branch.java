package com.amesh.mybank.domain;

public class Branch {
	private String brnchId;
	private String brnchName;
	private String tel;
	private String brnchAdress1;
	private String brnchAdress2;
	private String brnchAdress3;
	private Bank bank;
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public String getBrnchId() {
		return brnchId;
	}
	public void setBrnchId(String brnchId) {
		this.brnchId = brnchId;
	}
	public String getBrnchName() {
		return brnchName;
	}
	public void setBrnchName(String brnchName) {
		this.brnchName = brnchName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBrnchAdress1() {
		return brnchAdress1;
	}
	public void setBrnchAdress1(String brnchAdress1) {
		this.brnchAdress1 = brnchAdress1;
	}
	public String getBrnchAdress2() {
		return brnchAdress2;
	}
	public void setBrnchAdress2(String brnchAdress2) {
		this.brnchAdress2 = brnchAdress2;
	}
	public String getBrnchAdress3() {
		return brnchAdress3;
	}
	public void setBrnchAdress3(String brnchAdress3) {
		this.brnchAdress3 = brnchAdress3;
	}

}
