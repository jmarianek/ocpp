/*
 * An XML document type.
 * Localname: meterValuesRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.MeterValuesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one meterValuesRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class MeterValuesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.MeterValuesRequestDocument
{
    
    public MeterValuesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METERVALUESREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "meterValuesRequest");
    
    
    /**
     * Gets the "meterValuesRequest" element
     */
    public ocpp.MeterValuesRequest getMeterValuesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValuesRequest target = null;
            target = (ocpp.MeterValuesRequest)get_store().find_element_user(METERVALUESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "meterValuesRequest" element
     */
    public void setMeterValuesRequest(ocpp.MeterValuesRequest meterValuesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValuesRequest target = null;
            target = (ocpp.MeterValuesRequest)get_store().find_element_user(METERVALUESREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.MeterValuesRequest)get_store().add_element_user(METERVALUESREQUEST$0);
            }
            target.set(meterValuesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "meterValuesRequest" element
     */
    public ocpp.MeterValuesRequest addNewMeterValuesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValuesRequest target = null;
            target = (ocpp.MeterValuesRequest)get_store().add_element_user(METERVALUESREQUEST$0);
            return target;
        }
    }
}
