package com.tintin.client;

import java.util.concurrent.ExecutionException;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.tintin.BillDetails;
import com.tintin.CalculateBillResponse;

public class MyAsyncHandler implements AsyncHandler<CalculateBillResponse> {

	@Override
	public void handleResponse(Response<CalculateBillResponse> res) {
		
		System.out.println("Got the response");
		
		try {
			CalculateBillResponse response =res.get();
			
			BillDetails bd=response.getReturn();
			System.out.println(bd);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
