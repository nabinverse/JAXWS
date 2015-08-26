package com.exception;

import javax.xml.ws.WebFault;

import com.model.Customer;
import com.tintin.CalculationFaultBean;

@WebFault(name="CalculationFault",faultBean="com.tintin.CalculationFaultBean")
public class CalculationException extends Exception {
	
	CalculationFaultBean calbean;
	
	public CalculationException(String message, CalculationFaultBean calbean){
		super(message);
		this.calbean=calbean;
		
	}
	
	public CalculationException(String message, CalculationFaultBean calbean,Throwable cause){
		super(message,cause);
		this.calbean=calbean;
	}

	public CalculationFaultBean getFaultInfo(){
		return calbean;
	}

	public void setCalbean(CalculationFaultBean calbean) {
		this.calbean = calbean;
	}
	
}
