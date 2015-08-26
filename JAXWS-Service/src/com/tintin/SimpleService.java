package com.tintin;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.exception.CalculationException;
import com.model.BillDetails;
import com.model.Customer;

@WebService
@HandlerChain(file="handler-chain.xml")
public interface SimpleService {
	@WebMethod
	public BillDetails calculateBill(@WebParam Customer customer) throws CalculationException;
}
