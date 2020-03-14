/*
 * An XML document type.
 * Localname: firmwareStatusNotificationResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.FirmwareStatusNotificationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one firmwareStatusNotificationResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class FirmwareStatusNotificationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.FirmwareStatusNotificationResponseDocument
{
    
    public FirmwareStatusNotificationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRMWARESTATUSNOTIFICATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "firmwareStatusNotificationResponse");
    
    
    /**
     * Gets the "firmwareStatusNotificationResponse" element
     */
    public ocpp.FirmwareStatusNotificationResponse getFirmwareStatusNotificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.FirmwareStatusNotificationResponse target = null;
            target = (ocpp.FirmwareStatusNotificationResponse)get_store().find_element_user(FIRMWARESTATUSNOTIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "firmwareStatusNotificationResponse" element
     */
    public void setFirmwareStatusNotificationResponse(ocpp.FirmwareStatusNotificationResponse firmwareStatusNotificationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.FirmwareStatusNotificationResponse target = null;
            target = (ocpp.FirmwareStatusNotificationResponse)get_store().find_element_user(FIRMWARESTATUSNOTIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.FirmwareStatusNotificationResponse)get_store().add_element_user(FIRMWARESTATUSNOTIFICATIONRESPONSE$0);
            }
            target.set(firmwareStatusNotificationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "firmwareStatusNotificationResponse" element
     */
    public ocpp.FirmwareStatusNotificationResponse addNewFirmwareStatusNotificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.FirmwareStatusNotificationResponse target = null;
            target = (ocpp.FirmwareStatusNotificationResponse)get_store().add_element_user(FIRMWARESTATUSNOTIFICATIONRESPONSE$0);
            return target;
        }
    }
}
