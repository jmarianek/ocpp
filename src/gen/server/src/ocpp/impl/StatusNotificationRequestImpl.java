/*
 * XML Type:  StatusNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StatusNotificationRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML StatusNotificationRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class StatusNotificationRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StatusNotificationRequest
{
    
    public StatusNotificationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTORID$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "connectorId");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "status");
    private static final javax.xml.namespace.QName ERRORCODE$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "errorCode");
    private static final javax.xml.namespace.QName INFO$6 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "info");
    private static final javax.xml.namespace.QName TIMESTAMP$8 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "timestamp");
    private static final javax.xml.namespace.QName VENDORID$10 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "vendorId");
    private static final javax.xml.namespace.QName VENDORERRORCODE$12 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "vendorErrorCode");
    
    
    /**
     * Gets the "connectorId" element
     */
    public int getConnectorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTORID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectorId" element
     */
    public org.apache.xmlbeans.XmlInt xgetConnectorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONNECTORID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "connectorId" element
     */
    public void setConnectorId(int connectorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONNECTORID$0);
            }
            target.setIntValue(connectorId);
        }
    }
    
    /**
     * Sets (as xml) the "connectorId" element
     */
    public void xsetConnectorId(org.apache.xmlbeans.XmlInt connectorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONNECTORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CONNECTORID$0);
            }
            target.set(connectorId);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public ocpp.ChargePointStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.ChargePointStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public ocpp.ChargePointStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.ChargePointStatus target = null;
            target = (ocpp.ChargePointStatus)get_store().find_element_user(STATUS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(ocpp.ChargePointStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(ocpp.ChargePointStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.ChargePointStatus target = null;
            target = (ocpp.ChargePointStatus)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (ocpp.ChargePointStatus)get_store().add_element_user(STATUS$2);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "errorCode" element
     */
    public ocpp.ChargePointErrorCode.Enum getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.ChargePointErrorCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorCode" element
     */
    public ocpp.ChargePointErrorCode xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.ChargePointErrorCode target = null;
            target = (ocpp.ChargePointErrorCode)get_store().find_element_user(ERRORCODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "errorCode" element
     */
    public void setErrorCode(ocpp.ChargePointErrorCode.Enum errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$4);
            }
            target.setEnumValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "errorCode" element
     */
    public void xsetErrorCode(ocpp.ChargePointErrorCode errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.ChargePointErrorCode target = null;
            target = (ocpp.ChargePointErrorCode)get_store().find_element_user(ERRORCODE$4, 0);
            if (target == null)
            {
                target = (ocpp.ChargePointErrorCode)get_store().add_element_user(ERRORCODE$4);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Gets the "info" element
     */
    public java.lang.String getInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "info" element
     */
    public ocpp.CiString50Type xgetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString50Type target = null;
            target = (ocpp.CiString50Type)get_store().find_element_user(INFO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "info" element
     */
    public boolean isSetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFO$6) != 0;
        }
    }
    
    /**
     * Sets the "info" element
     */
    public void setInfo(java.lang.String info)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFO$6);
            }
            target.setStringValue(info);
        }
    }
    
    /**
     * Sets (as xml) the "info" element
     */
    public void xsetInfo(ocpp.CiString50Type info)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString50Type target = null;
            target = (ocpp.CiString50Type)get_store().find_element_user(INFO$6, 0);
            if (target == null)
            {
                target = (ocpp.CiString50Type)get_store().add_element_user(INFO$6);
            }
            target.set(info);
        }
    }
    
    /**
     * Unsets the "info" element
     */
    public void unsetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFO$6, 0);
        }
    }
    
    /**
     * Gets the "timestamp" element
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "timestamp" element
     */
    public boolean isSetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESTAMP$8) != 0;
        }
    }
    
    /**
     * Sets the "timestamp" element
     */
    public void setTimestamp(java.util.Calendar timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$8);
            }
            target.setCalendarValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "timestamp" element
     */
    public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$8);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Unsets the "timestamp" element
     */
    public void unsetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESTAMP$8, 0);
        }
    }
    
    /**
     * Gets the "vendorId" element
     */
    public java.lang.String getVendorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDORID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vendorId" element
     */
    public ocpp.CiString255Type xgetVendorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString255Type target = null;
            target = (ocpp.CiString255Type)get_store().find_element_user(VENDORID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "vendorId" element
     */
    public boolean isSetVendorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VENDORID$10) != 0;
        }
    }
    
    /**
     * Sets the "vendorId" element
     */
    public void setVendorId(java.lang.String vendorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDORID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VENDORID$10);
            }
            target.setStringValue(vendorId);
        }
    }
    
    /**
     * Sets (as xml) the "vendorId" element
     */
    public void xsetVendorId(ocpp.CiString255Type vendorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString255Type target = null;
            target = (ocpp.CiString255Type)get_store().find_element_user(VENDORID$10, 0);
            if (target == null)
            {
                target = (ocpp.CiString255Type)get_store().add_element_user(VENDORID$10);
            }
            target.set(vendorId);
        }
    }
    
    /**
     * Unsets the "vendorId" element
     */
    public void unsetVendorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VENDORID$10, 0);
        }
    }
    
    /**
     * Gets the "vendorErrorCode" element
     */
    public java.lang.String getVendorErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDORERRORCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vendorErrorCode" element
     */
    public ocpp.CiString50Type xgetVendorErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString50Type target = null;
            target = (ocpp.CiString50Type)get_store().find_element_user(VENDORERRORCODE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "vendorErrorCode" element
     */
    public boolean isSetVendorErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VENDORERRORCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "vendorErrorCode" element
     */
    public void setVendorErrorCode(java.lang.String vendorErrorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDORERRORCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VENDORERRORCODE$12);
            }
            target.setStringValue(vendorErrorCode);
        }
    }
    
    /**
     * Sets (as xml) the "vendorErrorCode" element
     */
    public void xsetVendorErrorCode(ocpp.CiString50Type vendorErrorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString50Type target = null;
            target = (ocpp.CiString50Type)get_store().find_element_user(VENDORERRORCODE$12, 0);
            if (target == null)
            {
                target = (ocpp.CiString50Type)get_store().add_element_user(VENDORERRORCODE$12);
            }
            target.set(vendorErrorCode);
        }
    }
    
    /**
     * Unsets the "vendorErrorCode" element
     */
    public void unsetVendorErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VENDORERRORCODE$12, 0);
        }
    }
}
