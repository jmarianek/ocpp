/*
 * An XML document type.
 * Localname: meterValuesResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.MeterValuesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one meterValuesResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class MeterValuesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.MeterValuesResponseDocument
{
    
    public MeterValuesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METERVALUESRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "meterValuesResponse");
    
    
    /**
     * Gets the "meterValuesResponse" element
     */
    public ocpp.MeterValuesResponse getMeterValuesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValuesResponse target = null;
            target = (ocpp.MeterValuesResponse)get_store().find_element_user(METERVALUESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "meterValuesResponse" element
     */
    public void setMeterValuesResponse(ocpp.MeterValuesResponse meterValuesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValuesResponse target = null;
            target = (ocpp.MeterValuesResponse)get_store().find_element_user(METERVALUESRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.MeterValuesResponse)get_store().add_element_user(METERVALUESRESPONSE$0);
            }
            target.set(meterValuesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "meterValuesResponse" element
     */
    public ocpp.MeterValuesResponse addNewMeterValuesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValuesResponse target = null;
            target = (ocpp.MeterValuesResponse)get_store().add_element_user(METERVALUESRESPONSE$0);
            return target;
        }
    }
}
