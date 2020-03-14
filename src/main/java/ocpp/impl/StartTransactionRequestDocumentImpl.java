/*
 * An XML document type.
 * Localname: startTransactionRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StartTransactionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one startTransactionRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class StartTransactionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StartTransactionRequestDocument
{
    
    public StartTransactionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTTRANSACTIONREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "startTransactionRequest");
    
    
    /**
     * Gets the "startTransactionRequest" element
     */
    public ocpp.StartTransactionRequest getStartTransactionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StartTransactionRequest target = null;
            target = (ocpp.StartTransactionRequest)get_store().find_element_user(STARTTRANSACTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "startTransactionRequest" element
     */
    public void setStartTransactionRequest(ocpp.StartTransactionRequest startTransactionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StartTransactionRequest target = null;
            target = (ocpp.StartTransactionRequest)get_store().find_element_user(STARTTRANSACTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.StartTransactionRequest)get_store().add_element_user(STARTTRANSACTIONREQUEST$0);
            }
            target.set(startTransactionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "startTransactionRequest" element
     */
    public ocpp.StartTransactionRequest addNewStartTransactionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StartTransactionRequest target = null;
            target = (ocpp.StartTransactionRequest)get_store().add_element_user(STARTTRANSACTIONREQUEST$0);
            return target;
        }
    }
}
