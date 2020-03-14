/*
 * XML Type:  FirmwareStatusNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.FirmwareStatusNotificationRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML FirmwareStatusNotificationRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class FirmwareStatusNotificationRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.FirmwareStatusNotificationRequest
{
    
    public FirmwareStatusNotificationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "status");
    
    
    /**
     * Gets the "status" element
     */
    public ocpp.FirmwareStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.FirmwareStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public ocpp.FirmwareStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.FirmwareStatus target = null;
            target = (ocpp.FirmwareStatus)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(ocpp.FirmwareStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(ocpp.FirmwareStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.FirmwareStatus target = null;
            target = (ocpp.FirmwareStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (ocpp.FirmwareStatus)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
}
