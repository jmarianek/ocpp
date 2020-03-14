/*
 * An XML document type.
 * Localname: bootNotificationResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.BootNotificationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one bootNotificationResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class BootNotificationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.BootNotificationResponseDocument
{
    
    public BootNotificationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOTNOTIFICATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "bootNotificationResponse");
    
    
    /**
     * Gets the "bootNotificationResponse" element
     */
    public ocpp.BootNotificationResponse getBootNotificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.BootNotificationResponse target = null;
            target = (ocpp.BootNotificationResponse)get_store().find_element_user(BOOTNOTIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bootNotificationResponse" element
     */
    public void setBootNotificationResponse(ocpp.BootNotificationResponse bootNotificationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.BootNotificationResponse target = null;
            target = (ocpp.BootNotificationResponse)get_store().find_element_user(BOOTNOTIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.BootNotificationResponse)get_store().add_element_user(BOOTNOTIFICATIONRESPONSE$0);
            }
            target.set(bootNotificationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "bootNotificationResponse" element
     */
    public ocpp.BootNotificationResponse addNewBootNotificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.BootNotificationResponse target = null;
            target = (ocpp.BootNotificationResponse)get_store().add_element_user(BOOTNOTIFICATIONRESPONSE$0);
            return target;
        }
    }
}
