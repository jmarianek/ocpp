/*
 * An XML document type.
 * Localname: stopTransactionResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StopTransactionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one stopTransactionResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class StopTransactionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StopTransactionResponseDocument
{
    
    public StopTransactionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOPTRANSACTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "stopTransactionResponse");
    
    
    /**
     * Gets the "stopTransactionResponse" element
     */
    public ocpp.StopTransactionResponse getStopTransactionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StopTransactionResponse target = null;
            target = (ocpp.StopTransactionResponse)get_store().find_element_user(STOPTRANSACTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "stopTransactionResponse" element
     */
    public void setStopTransactionResponse(ocpp.StopTransactionResponse stopTransactionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StopTransactionResponse target = null;
            target = (ocpp.StopTransactionResponse)get_store().find_element_user(STOPTRANSACTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.StopTransactionResponse)get_store().add_element_user(STOPTRANSACTIONRESPONSE$0);
            }
            target.set(stopTransactionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "stopTransactionResponse" element
     */
    public ocpp.StopTransactionResponse addNewStopTransactionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StopTransactionResponse target = null;
            target = (ocpp.StopTransactionResponse)get_store().add_element_user(STOPTRANSACTIONRESPONSE$0);
            return target;
        }
    }
}
