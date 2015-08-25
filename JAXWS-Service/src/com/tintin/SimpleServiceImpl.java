package com.tintin;

import java.util.Calendar;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.model.BillDetails;
import com.model.Customer;
@WebService(endpointInterface="com.tintin.SimpleService")
public class SimpleServiceImpl implements SimpleService{

	@Override
	@WebMethod
	public BillDetails calculateBill(Customer customer) {
		
		BillDetails bd= new BillDetails();
		bd.setAmount(3456);
		bd.setBillAddress(customer.getName() + " : "+customer.getAddress());
		bd.setEndDate(new Date());
		bd.setStartDate(new Date(Calendar.getInstance().getTimeInMillis()-30*24*3600));
		return bd;
	}

}
