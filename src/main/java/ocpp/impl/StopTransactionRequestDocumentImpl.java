/*
 * An XML document type.
 * Localname: stopTransactionRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StopTransactionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one stopTransactionRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class StopTransactionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StopTransactionRequestDocument
{
    
    public StopTransactionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOPTRANSACTIONREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "stopTransactionRequest");
    
    
    /**
     * Gets the "stopTransactionRequest" element
     */
    public ocpp.StopTransactionRequest getStopTransactionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StopTransactionRequest target = null;
            target = (ocpp.StopTransactionRequest)get_store().find_element_user(STOPTRANSACTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "stopTransactionRequest" element
     */
    public void setStopTransactionRequest(ocpp.StopTransactionRequest stopTransactionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StopTransactionRequest target = null;
            target = (ocpp.StopTransactionRequest)get_store().find_element_user(STOPTRANSACTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.StopTransactionRequest)get_store().add_element_user(STOPTRANSACTIONREQUEST$0);
            }
            target.set(stopTransactionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "stopTransactionRequest" element
     */
    public ocpp.StopTransactionRequest addNewStopTransactionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StopTransactionRequest target = null;
            target = (ocpp.StopTransactionRequest)get_store().add_element_user(STOPTRANSACTIONREQUEST$0);
            return target;
        }
    }
}
