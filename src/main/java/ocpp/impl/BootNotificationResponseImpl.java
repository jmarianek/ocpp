/*
 * XML Type:  BootNotificationResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.BootNotificationResponse
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML BootNotificationResponse(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class BootNotificationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.BootNotificationResponse
{
    
    public BootNotificationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "status");
    private static final javax.xml.namespace.QName CURRENTTIME$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "currentTime");
    private static final javax.xml.namespace.QName INTERVAL$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "interval");
    
    
    /**
     * Gets the "status" element
     */
    public ocpp.RegistrationStatus.Enum getStatus()
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
            return (ocpp.RegistrationStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public ocpp.RegistrationStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.RegistrationStatus target = null;
            target = (ocpp.RegistrationStatus)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(ocpp.RegistrationStatus.Enum status)
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
    public void xsetStatus(ocpp.RegistrationStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.RegistrationStatus target = null;
            target = (ocpp.RegistrationStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (ocpp.RegistrationStatus)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "currentTime" element
     */
    public java.util.Calendar getCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "currentTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "currentTime" element
     */
    public void setCurrentTime(java.util.Calendar currentTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTTIME$2);
            }
            target.setCalendarValue(currentTime);
        }
    }
    
    /**
     * Sets (as xml) the "currentTime" element
     */
    public void xsetCurrentTime(org.apache.xmlbeans.XmlDateTime currentTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CURRENTTIME$2);
            }
            target.set(currentTime);
        }
    }
    
    /**
     * Gets the "interval" element
     */
    public int getInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVAL$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "interval" element
     */
    public org.apache.xmlbeans.XmlInt xgetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTERVAL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "interval" element
     */
    public void setInterval(int interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVAL$4);
            }
            target.setIntValue(interval);
        }
    }
    
    /**
     * Sets (as xml) the "interval" element
     */
    public void xsetInterval(org.apache.xmlbeans.XmlInt interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTERVAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INTERVAL$4);
            }
            target.set(interval);
        }
    }
}
