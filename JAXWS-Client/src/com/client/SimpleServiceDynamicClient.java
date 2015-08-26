
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.client;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.soap.SOAPBinding;

import com.handler.SimpleServiceClientHandler;
import com.model.BillDetails;
import com.model.Customer;
import com.tintin.CalculationException;
import com.tintin.SimpleService;;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2015-08-25T15:18:13.844+05:30
 * Generated source version: 3.0.0
 * 
 */
public class SimpleServiceDynamicClient {

    public static void main(String[] args) throws Exception {
    	
    	QName serviceName = new QName("http://tintin.com/", "SimpleServiceImplService");
        QName portName = new QName("http://tintin.com/", "SimpleServiceImplPort");
        //below code wants wsdl to be present on class path
        //Service service = Service.create(serviceName);
        //service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING,"http://localhost:8080/JAXWS-Service/services/SimpleServiceImplPort");
        Service service = Service.create(new URL("http://localhost:8080/JAXWS-Service/services/SimpleServiceImplPort?wsdl"),serviceName);
        //pluging in client handler 
        service.setHandlerResolver(new HandlerResolver() {
			
        	
			@Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new SimpleServiceClientHandler());
                return handlerList;
            }
        });
        SimpleService client = service.getPort(portName, SimpleService.class);
        
        //adding security context
        
        Map<String, Object> req_ctx = ((BindingProvider)client).getRequestContext();

        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("Automation-User1@bbc.co.uk"));
        headers.put("Password", Collections.singletonList("brusPA7e"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        
        //Prepare argument
        Customer cus = new Customer();
        cus.setAddress("B-205, Silver Estate, Doltala -700132");
        cus.setAge(29);
        cus.setName(" ");
        cus.setPhone("8697042514");
        //call the service
        try{
        	BillDetails bd= client.calculateBill(cus);
        	System.out.println("Amount : "+bd.getAmount());
        	System.out.println(bd.getBillAddress());
        }catch(CalculationException e){
        	System.out.println("exception");
        }
        /*  SIMPLE REQUEST /RESPONSE      
       <?xml version="1.0" ?><S:Envelope xmlns:S="http://www.w3.org/2003/05/soap-envelope"><S:Body><ns2:calculateBill xmlns:ns2="http://tintin.com/"><arg0><address>B-205, Silver Estate, Doltala -700132</address><age>29</age><name>Nabin Mandal</name><phone>8697042514</phone></arg0></ns2:calculateBill></S:Body></S:Envelope>
        <soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope"><soap:Body><ns2:calculateBillResponse xmlns:ns2="http://tintin.com/"><return><amount>3456</amount><billAddress>Nabin Mandal : B-205, Silver Estate, Doltala -700132</billAddress><endDate>2015-08-25T15:58:58.433+05:30</endDate><startDate>2015-08-25T15:15:46.433+05:30</startDate></return></ns2:calculateBillResponse></soap:Body></soap:Envelope>
        */
    }

}