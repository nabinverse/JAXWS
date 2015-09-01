
package com.tintin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tintin package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculateBill_QNAME = new QName("http://tintin.com/", "calculateBill");
    private final static QName _CalculationFault_QNAME = new QName("http://tintin.com/", "CalculationFault");
    private final static QName _CalculateBillResponse_QNAME = new QName("http://tintin.com/", "calculateBillResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tintin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateBill }
     * 
     */
    public CalculateBill createCalculateBill() {
        return new CalculateBill();
    }

    /**
     * Create an instance of {@link CalculationFaultBean }
     * 
     */
    public CalculationFaultBean createCalculationFaultBean() {
        return new CalculationFaultBean();
    }

    /**
     * Create an instance of {@link CalculateBillResponse }
     * 
     */
    public CalculateBillResponse createCalculateBillResponse() {
        return new CalculateBillResponse();
    }

    /**
     * Create an instance of {@link BillDetails }
     * 
     */
    public BillDetails createBillDetails() {
        return new BillDetails();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tintin.com/", name = "calculateBill")
    public JAXBElement<CalculateBill> createCalculateBill(CalculateBill value) {
        return new JAXBElement<CalculateBill>(_CalculateBill_QNAME, CalculateBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationFaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tintin.com/", name = "CalculationFault")
    public JAXBElement<CalculationFaultBean> createCalculationFault(CalculationFaultBean value) {
        return new JAXBElement<CalculationFaultBean>(_CalculationFault_QNAME, CalculationFaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tintin.com/", name = "calculateBillResponse")
    public JAXBElement<CalculateBillResponse> createCalculateBillResponse(CalculateBillResponse value) {
        return new JAXBElement<CalculateBillResponse>(_CalculateBillResponse_QNAME, CalculateBillResponse.class, null, value);
    }

}
