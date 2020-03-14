/*
 * XML Type:  DiagnosticsStatusNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.DiagnosticsStatusNotificationRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML DiagnosticsStatusNotificationRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class DiagnosticsStatusNotificationRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.DiagnosticsStatusNotificationRequest
{
    
    public DiagnosticsStatusNotificationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "status");
    
    
    /**
     * Gets the "status" element
     */
    public ocpp.DiagnosticsStatus.Enum getStatus()
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
            return (ocpp.DiagnosticsStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public ocpp.DiagnosticsStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DiagnosticsStatus target = null;
            target = (ocpp.DiagnosticsStatus)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(ocpp.DiagnosticsStatus.Enum status)
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
    public void xsetStatus(ocpp.DiagnosticsStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DiagnosticsStatus target = null;
            target = (ocpp.DiagnosticsStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (ocpp.DiagnosticsStatus)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
}
