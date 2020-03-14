/*
 * XML Type:  HeartbeatResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.HeartbeatResponse
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML HeartbeatResponse(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class HeartbeatResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.HeartbeatResponse
{
    
    public HeartbeatResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENTTIME$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "currentTime");
    
    
    /**
     * Gets the "currentTime" element
     */
    public java.util.Calendar getCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$0, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTTIME$0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CURRENTTIME$0);
            }
            target.set(currentTime);
        }
    }
}
