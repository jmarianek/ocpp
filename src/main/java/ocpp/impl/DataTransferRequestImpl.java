/*
 * XML Type:  DataTransferRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.DataTransferRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML DataTransferRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class DataTransferRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.DataTransferRequest
{
    
    public DataTransferRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VENDORID$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "vendorId");
    private static final javax.xml.namespace.QName MESSAGEID$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "messageId");
    private static final javax.xml.namespace.QName DATA$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "data");
    
    
    /**
     * Gets the "vendorId" element
     */
    public java.lang.String getVendorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDORID$0, 0);
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
            target = (ocpp.CiString255Type)get_store().find_element_user(VENDORID$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VENDORID$0);
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
            target = (ocpp.CiString255Type)get_store().find_element_user(VENDORID$0, 0);
            if (target == null)
            {
                target = (ocpp.CiString255Type)get_store().add_element_user(VENDORID$0);
            }
            target.set(vendorId);
        }
    }
    
    /**
     * Gets the "messageId" element
     */
    public java.lang.String getMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageId" element
     */
    public ocpp.CiString50Type xgetMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString50Type target = null;
            target = (ocpp.CiString50Type)get_store().find_element_user(MESSAGEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "messageId" element
     */
    public boolean isSetMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEID$2) != 0;
        }
    }
    
    /**
     * Sets the "messageId" element
     */
    public void setMessageId(java.lang.String messageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEID$2);
            }
            target.setStringValue(messageId);
        }
    }
    
    /**
     * Sets (as xml) the "messageId" element
     */
    public void xsetMessageId(ocpp.CiString50Type messageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString50Type target = null;
            target = (ocpp.CiString50Type)get_store().find_element_user(MESSAGEID$2, 0);
            if (target == null)
            {
                target = (ocpp.CiString50Type)get_store().add_element_user(MESSAGEID$2);
            }
            target.set(messageId);
        }
    }
    
    /**
     * Unsets the "messageId" element
     */
    public void unsetMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEID$2, 0);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public java.lang.String getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "data" element
     */
    public org.apache.xmlbeans.XmlString xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$4) != 0;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(java.lang.String data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$4);
            }
            target.setStringValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlString data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$4);
            }
            target.set(data);
        }
    }
    
    /**
     * Unsets the "data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$4, 0);
        }
    }
}
