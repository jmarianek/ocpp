/*
 * An XML document type.
 * Localname: dataTransferRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.DataTransferRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one dataTransferRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class DataTransferRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.DataTransferRequestDocument
{
    
    public DataTransferRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATATRANSFERREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "dataTransferRequest");
    
    
    /**
     * Gets the "dataTransferRequest" element
     */
    public ocpp.DataTransferRequest getDataTransferRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DataTransferRequest target = null;
            target = (ocpp.DataTransferRequest)get_store().find_element_user(DATATRANSFERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataTransferRequest" element
     */
    public void setDataTransferRequest(ocpp.DataTransferRequest dataTransferRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DataTransferRequest target = null;
            target = (ocpp.DataTransferRequest)get_store().find_element_user(DATATRANSFERREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.DataTransferRequest)get_store().add_element_user(DATATRANSFERREQUEST$0);
            }
            target.set(dataTransferRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "dataTransferRequest" element
     */
    public ocpp.DataTransferRequest addNewDataTransferRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DataTransferRequest target = null;
            target = (ocpp.DataTransferRequest)get_store().add_element_user(DATATRANSFERREQUEST$0);
            return target;
        }
    }
}
