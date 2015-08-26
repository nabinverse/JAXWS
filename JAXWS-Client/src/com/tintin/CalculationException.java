
package com.tintin;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0
 * 2015-08-26T21:07:18.296+05:30
 * Generated source version: 3.0.0
 */

@WebFault(name = "CalculationFault", targetNamespace = "http://tintin.com/")
public class CalculationException extends Exception {
    
    private com.tintin.CalculationFaultBean calculationFault;

    public CalculationException() {
        super();
    }
    
    public CalculationException(String message) {
        super(message);
    }
    
    public CalculationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculationException(String message, com.tintin.CalculationFaultBean calculationFault) {
        super(message);
        this.calculationFault = calculationFault;
    }

    public CalculationException(String message, com.tintin.CalculationFaultBean calculationFault, Throwable cause) {
        super(message, cause);
        this.calculationFault = calculationFault;
    }

    public com.tintin.CalculationFaultBean getFaultInfo() {
        return this.calculationFault;
    }
}