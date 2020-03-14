/*
 * An XML document type.
 * Localname: bootNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.BootNotificationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one bootNotificationRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class BootNotificationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.BootNotificationRequestDocument
{
    
    public BootNotificationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOTNOTIFICATIONREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "bootNotificationRequest");
    
    
    /**
     * Gets the "bootNotificationRequest" element
     */
    public ocpp.BootNotificationRequest getBootNotificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.BootNotificationRequest target = null;
            target = (ocpp.BootNotificationRequest)get_store().find_element_user(BOOTNOTIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bootNotificationRequest" element
     */
    public void setBootNotificationRequest(ocpp.BootNotificationRequest bootNotificationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.BootNotificationRequest target = null;
            target = (ocpp.BootNotificationRequest)get_store().find_element_user(BOOTNOTIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.BootNotificationRequest)get_store().add_element_user(BOOTNOTIFICATIONREQUEST$0);
            }
            target.set(bootNotificationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "bootNotificationRequest" element
     */
    public ocpp.BootNotificationRequest addNewBootNotificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.BootNotificationRequest target = null;
            target = (ocpp.BootNotificationRequest)get_store().add_element_user(BOOTNOTIFICATIONREQUEST$0);
            return target;
        }
    }
}
