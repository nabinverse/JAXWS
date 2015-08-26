package com.tintin;

import java.util.Calendar;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.exception.CalculationException;
import com.model.BillDetails;
import com.model.Customer;
@WebService(endpointInterface="com.tintin.SimpleService")
public class SimpleServiceImpl implements SimpleService{

	@Override
	@WebMethod
	public BillDetails calculateBill(Customer customer) throws CalculationException {
		
		if(customer.getName().trim().length()==0){
			CalculationFaultBean calbean = new CalculationFaultBean();
			calbean.setExceptionDetails("The name is blank");
			calbean.setExceptionTime(new Date());
			throw new CalculationException("The name is blank direct message",calbean);
		}
		
		BillDetails bd= new BillDetails();
		bd.setAmount(3456);
		bd.setBillAddress(customer.getName() + " : "+customer.getAddress());
		bd.setEndDate(new Date());
		bd.setStartDate(new Date(Calendar.getInstance().getTimeInMillis()-30*24*3600));
		return bd;
	}

}
