/*
 * An XML document type.
 * Localname: startTransactionResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StartTransactionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one startTransactionResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class StartTransactionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StartTransactionResponseDocument
{
    
    public StartTransactionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTTRANSACTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "startTransactionResponse");
    
    
    /**
     * Gets the "startTransactionResponse" element
     */
    public ocpp.StartTransactionResponse getStartTransactionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StartTransactionResponse target = null;
            target = (ocpp.StartTransactionResponse)get_store().find_element_user(STARTTRANSACTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "startTransactionResponse" element
     */
    public void setStartTransactionResponse(ocpp.StartTransactionResponse startTransactionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StartTransactionResponse target = null;
            target = (ocpp.StartTransactionResponse)get_store().find_element_user(STARTTRANSACTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.StartTransactionResponse)get_store().add_element_user(STARTTRANSACTIONRESPONSE$0);
            }
            target.set(startTransactionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "startTransactionResponse" element
     */
    public ocpp.StartTransactionResponse addNewStartTransactionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StartTransactionResponse target = null;
            target = (ocpp.StartTransactionResponse)get_store().add_element_user(STARTTRANSACTIONRESPONSE$0);
            return target;
        }
    }
}
