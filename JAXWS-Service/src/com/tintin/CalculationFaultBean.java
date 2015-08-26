package com.tintin;

import java.util.Date;

public class CalculationFaultBean {
	String exceptionDetails;
	Date exceptionTime;
	public String getExceptionDetails() {
		return exceptionDetails;
	}
	public void setExceptionDetails(String exceptionDetails) {
		this.exceptionDetails = exceptionDetails;
	}
	public Date getExceptionTime() {
		return exceptionTime;
	}
	public void setExceptionTime(Date exceptionTime) {
		this.exceptionTime = exceptionTime;
	}
}
