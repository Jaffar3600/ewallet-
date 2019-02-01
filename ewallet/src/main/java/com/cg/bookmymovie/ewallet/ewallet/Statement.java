package com.cg.bookmymovie.ewallet.ewallet;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Statement {

	
	private Integer transactionId;
	private String transactionType;
	//private Double amount;
	private String remarks;
	private LocalDateTime dateandtime;
	public Statement() {
		// TODO Auto-generated constructor stub
	}
	
	public Statement(Integer transactionId, String transactionType, String remarks, LocalDateTime dateandtime) {
		super();
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.remarks = remarks;
		this.dateandtime = dateandtime;
	}

	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public LocalDateTime getDateandtime() {
		return dateandtime;
	}
	public void setDateandtime(LocalDateTime dateandtime) {
		this.dateandtime = dateandtime;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateandtime == null) ? 0 : dateandtime.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Statement other = (Statement) obj;
		if (dateandtime == null) {
			if (other.dateandtime != null)
				return false;
		} else if (!dateandtime.equals(other.dateandtime))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (transactionId == null) {
			if (other.transactionId != null)
				return false;
		} else if (!transactionId.equals(other.transactionId))
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Statement [transactionId=" + transactionId + ", transactionType=" + transactionType + ", remarks="
				+ remarks + ", dateandtime=" + dateandtime + "]";
	}


}
