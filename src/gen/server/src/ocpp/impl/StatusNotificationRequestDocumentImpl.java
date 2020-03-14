/*
 * An XML document type.
 * Localname: statusNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StatusNotificationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one statusNotificationRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class StatusNotificationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StatusNotificationRequestDocument
{
    
    public StatusNotificationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSNOTIFICATIONREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "statusNotificationRequest");
    
    
    /**
     * Gets the "statusNotificationRequest" element
     */
    public ocpp.StatusNotificationRequest getStatusNotificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StatusNotificationRequest target = null;
            target = (ocpp.StatusNotificationRequest)get_store().find_element_user(STATUSNOTIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "statusNotificationRequest" element
     */
    public void setStatusNotificationRequest(ocpp.StatusNotificationRequest statusNotificationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StatusNotificationRequest target = null;
            target = (ocpp.StatusNotificationRequest)get_store().find_element_user(STATUSNOTIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.StatusNotificationRequest)get_store().add_element_user(STATUSNOTIFICATIONREQUEST$0);
            }
            target.set(statusNotificationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "statusNotificationRequest" element
     */
    public ocpp.StatusNotificationRequest addNewStatusNotificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.StatusNotificationRequest target = null;
            target = (ocpp.StatusNotificationRequest)get_store().add_element_user(STATUSNOTIFICATIONREQUEST$0);
            return target;
        }
    }
}
