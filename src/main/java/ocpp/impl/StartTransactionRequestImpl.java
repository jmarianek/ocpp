/*
 * XML Type:  StartTransactionRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StartTransactionRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML StartTransactionRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class StartTransactionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StartTransactionRequest
{
    
    public StartTransactionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTORID$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "connectorId");
    private static final javax.xml.namespace.QName IDTAG$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "idTag");
    private static final javax.xml.namespace.QName TIMESTAMP$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "timestamp");
    private static final javax.xml.namespace.QName METERSTART$6 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "meterStart");
    private static final javax.xml.namespace.QName RESERVATIONID$8 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "reservationId");
    
    
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
     * Gets the "idTag" element
     */
    public java.lang.String getIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTAG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idTag" element
     */
    public ocpp.IdToken xgetIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdToken target = null;
            target = (ocpp.IdToken)get_store().find_element_user(IDTAG$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "idTag" element
     */
    public void setIdTag(java.lang.String idTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTAG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTAG$2);
            }
            target.setStringValue(idTag);
        }
    }
    
    /**
     * Sets (as xml) the "idTag" element
     */
    public void xsetIdTag(ocpp.IdToken idTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdToken target = null;
            target = (ocpp.IdToken)get_store().find_element_user(IDTAG$2, 0);
            if (target == null)
            {
                target = (ocpp.IdToken)get_store().add_element_user(IDTAG$2);
            }
            target.set(idTag);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$4, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$4, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$4);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Gets the "meterStart" element
     */
    public int getMeterStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METERSTART$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "meterStart" element
     */
    public org.apache.xmlbeans.XmlInt xgetMeterStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(METERSTART$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "meterStart" element
     */
    public void setMeterStart(int meterStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METERSTART$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METERSTART$6);
            }
            target.setIntValue(meterStart);
        }
    }
    
    /**
     * Sets (as xml) the "meterStart" element
     */
    public void xsetMeterStart(org.apache.xmlbeans.XmlInt meterStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(METERSTART$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(METERSTART$6);
            }
            target.set(meterStart);
        }
    }
    
    /**
     * Gets the "reservationId" element
     */
    public int getReservationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONID$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "reservationId" element
     */
    public org.apache.xmlbeans.XmlInt xgetReservationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESERVATIONID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "reservationId" element
     */
    public boolean isSetReservationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESERVATIONID$8) != 0;
        }
    }
    
    /**
     * Sets the "reservationId" element
     */
    public void setReservationId(int reservationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVATIONID$8);
            }
            target.setIntValue(reservationId);
        }
    }
    
    /**
     * Sets (as xml) the "reservationId" element
     */
    public void xsetReservationId(org.apache.xmlbeans.XmlInt reservationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESERVATIONID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RESERVATIONID$8);
            }
            target.set(reservationId);
        }
    }
    
    /**
     * Unsets the "reservationId" element
     */
    public void unsetReservationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESERVATIONID$8, 0);
        }
    }
}
