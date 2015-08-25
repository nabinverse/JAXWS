package com.handler;


import java.util.Set;
import java.util.TreeSet;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SimpleServiceClientHandler implements SOAPHandler<SOAPMessageContext> {

    public Set<QName> getHeaders() {
        return new TreeSet<>();
    }

    public boolean handleMessage(SOAPMessageContext context) {
    	
        Boolean outboundProperty = 
            (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            SOAPMessage message = context.getMessage();
            try {
                SOAPEnvelope envelope = context.getMessage()
                        .getSOAPPart().getEnvelope();
                SOAPFactory factory = SOAPFactory.newInstance();
                String prefix = "X";
                String uri = "http://...wsssecurity...";
                SOAPElement securityElem = 
                        factory.createElement("Security",prefix,uri);
                SOAPElement tokenElem = 
                        factory.createElement("BinarySecurityToken",prefix,uri);
                tokenElem.addTextNode("kjh...897=");
                securityElem.addChildElement(tokenElem);
                SOAPHeader header = envelope.addHeader();
                header.addChildElement(securityElem);

            } catch (Exception e) {
                System.out.println("Exception in handler: " + e);
            }
        } else {
            // inbound
        }
        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
	@Override
	public void close(MessageContext arg0) {
		// TODO Auto-generated method stub
		
	}
}