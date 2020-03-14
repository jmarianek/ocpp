/*
 * An XML document type.
 * Localname: firmwareStatusNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.FirmwareStatusNotificationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one firmwareStatusNotificationRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class FirmwareStatusNotificationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.FirmwareStatusNotificationRequestDocument
{
    
    public FirmwareStatusNotificationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRMWARESTATUSNOTIFICATIONREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "firmwareStatusNotificationRequest");
    
    
    /**
     * Gets the "firmwareStatusNotificationRequest" element
     */
    public ocpp.FirmwareStatusNotificationRequest getFirmwareStatusNotificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.FirmwareStatusNotificationRequest target = null;
            target = (ocpp.FirmwareStatusNotificationRequest)get_store().find_element_user(FIRMWARESTATUSNOTIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "firmwareStatusNotificationRequest" element
     */
    public void setFirmwareStatusNotificationRequest(ocpp.FirmwareStatusNotificationRequest firmwareStatusNotificationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.FirmwareStatusNotificationRequest target = null;
            target = (ocpp.FirmwareStatusNotificationRequest)get_store().find_element_user(FIRMWARESTATUSNOTIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.FirmwareStatusNotificationRequest)get_store().add_element_user(FIRMWARESTATUSNOTIFICATIONREQUEST$0);
            }
            target.set(firmwareStatusNotificationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "firmwareStatusNotificationRequest" element
     */
    public ocpp.FirmwareStatusNotificationRequest addNewFirmwareStatusNotificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.FirmwareStatusNotificationRequest target = null;
            target = (ocpp.FirmwareStatusNotificationRequest)get_store().add_element_user(FIRMWARESTATUSNOTIFICATIONREQUEST$0);
            return target;
        }
    }
}
