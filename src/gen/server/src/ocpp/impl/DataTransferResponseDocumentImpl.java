/*
 * An XML document type.
 * Localname: dataTransferResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.DataTransferResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one dataTransferResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class DataTransferResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.DataTransferResponseDocument
{
    
    public DataTransferResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATATRANSFERRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "dataTransferResponse");
    
    
    /**
     * Gets the "dataTransferResponse" element
     */
    public ocpp.DataTransferResponse getDataTransferResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DataTransferResponse target = null;
            target = (ocpp.DataTransferResponse)get_store().find_element_user(DATATRANSFERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataTransferResponse" element
     */
    public void setDataTransferResponse(ocpp.DataTransferResponse dataTransferResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DataTransferResponse target = null;
            target = (ocpp.DataTransferResponse)get_store().find_element_user(DATATRANSFERRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.DataTransferResponse)get_store().add_element_user(DATATRANSFERRESPONSE$0);
            }
            target.set(dataTransferResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "dataTransferResponse" element
     */
    public ocpp.DataTransferResponse addNewDataTransferResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DataTransferResponse target = null;
            target = (ocpp.DataTransferResponse)get_store().add_element_user(DATATRANSFERRESPONSE$0);
            return target;
        }
    }
}
