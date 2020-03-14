/*
 * An XML document type.
 * Localname: statusNotificationResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StatusNotificationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one statusNotificationResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class StatusNotificationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StatusNotificationResponseDocument
{
    
    public StatusNotificationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSNOTIFICATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "statusNotificationResponse");
    
    
    /**
     * Gets the "statusNotificationResponse" element
     */
    public ocpp.StatusNotificationResponse getStatusNotificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StatusNotificationResponse target = null;
            target = (ocpp.StatusNotificationResponse)get_store().find_element_user(STATUSNOTIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "statusNotificationResponse" element
     */
    public void setStatusNotificationResponse(ocpp.StatusNotificationResponse statusNotificationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StatusNotificationResponse target = null;
            target = (ocpp.StatusNotificationResponse)get_store().find_element_user(STATUSNOTIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.StatusNotificationResponse)get_store().add_element_user(STATUSNOTIFICATIONRESPONSE$0);
            }
            target.set(statusNotificationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "statusNotificationResponse" element
     */
    public ocpp.StatusNotificationResponse addNewStatusNotificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StatusNotificationResponse target = null;
            target = (ocpp.StatusNotificationResponse)get_store().add_element_user(STATUSNOTIFICATIONRESPONSE$0);
            return target;
        }
    }
}
