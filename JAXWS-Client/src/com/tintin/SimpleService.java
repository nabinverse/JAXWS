package com.tintin;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.model.BillDetails;
import com.model.Customer;

@WebService
public interface SimpleService {
	@WebMethod
	public BillDetails calculateBill(@WebParam Customer customer);
}
