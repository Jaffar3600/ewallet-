package com.cg.bookmymovie.ewallet.ewallet;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ewallet {
	@Id
	private Integer profileId;
	private Double currentBalance;
	@Embedded
	private Statement statement;

	public Ewallet(Integer profileId, Double currentBalance, Statement statement) {
		super();
		this.profileId = profileId;
		this.currentBalance = currentBalance;
		this.statement = statement;
	}
	
	public Ewallet() {
		// TODO Auto-generated constructor stub
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	@Override
	public String toString() {
		return "Ewallet [profileId=" + profileId + ", currentBalance=" + currentBalance + ", statement=" + statement
				+ "]";
	}

	

}
