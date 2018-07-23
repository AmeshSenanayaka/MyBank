package com.amesh.mybank.domain;

import java.util.Collection;

public class Bank {
	private String bnkId;
	private String bnkName;
	private Collection<Branch> branches;
	
	public String getBnkId() {
		return bnkId;
	}
	public Collection<Branch> getBranches() {
		return branches;
	}
	public void setBranches(Collection<Branch> branches) {
		this.branches = branches;
	}
	public void setBnkId(String bnkId) {
		this.bnkId = bnkId;
	}
	public String getBnkName() {
		return bnkName;
	}
	public void setBnkName(String bnkName) {
		this.bnkName = bnkName;
	}
	

}
