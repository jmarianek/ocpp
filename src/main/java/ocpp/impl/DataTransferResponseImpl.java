/*
 * XML Type:  DataTransferResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.DataTransferResponse
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML DataTransferResponse(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class DataTransferResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.DataTransferResponse
{
    
    public DataTransferResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "status");
    private static final javax.xml.namespace.QName DATA$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "data");
    
    
    /**
     * Gets the "status" element
     */
    public ocpp.DataTransferStatus.Enum getStatus()
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
            return (ocpp.DataTransferStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public ocpp.DataTransferStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DataTransferStatus target = null;
            target = (ocpp.DataTransferStatus)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(ocpp.DataTransferStatus.Enum status)
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
    public void xsetStatus(ocpp.DataTransferStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DataTransferStatus target = null;
            target = (ocpp.DataTransferStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (ocpp.DataTransferStatus)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$2, 0);
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
            return get_store().count_elements(DATA$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$2);
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
            get_store().remove_element(DATA$2, 0);
        }
    }
}
