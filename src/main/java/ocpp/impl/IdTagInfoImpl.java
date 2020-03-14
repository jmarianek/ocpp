/*
 * XML Type:  IdTagInfo
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.IdTagInfo
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML IdTagInfo(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class IdTagInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.IdTagInfo
{
    
    public IdTagInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "status");
    private static final javax.xml.namespace.QName EXPIRYDATE$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "expiryDate");
    private static final javax.xml.namespace.QName PARENTIDTAG$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "parentIdTag");
    
    
    /**
     * Gets the "status" element
     */
    public ocpp.AuthorizationStatus.Enum getStatus()
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
            return (ocpp.AuthorizationStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public ocpp.AuthorizationStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.AuthorizationStatus target = null;
            target = (ocpp.AuthorizationStatus)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(ocpp.AuthorizationStatus.Enum status)
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
    public void xsetStatus(ocpp.AuthorizationStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.AuthorizationStatus target = null;
            target = (ocpp.AuthorizationStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (ocpp.AuthorizationStatus)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "expiryDate" element
     */
    public java.util.Calendar getExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRYDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "expiryDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRYDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "expiryDate" element
     */
    public boolean isSetExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRYDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "expiryDate" element
     */
    public void setExpiryDate(java.util.Calendar expiryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRYDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRYDATE$2);
            }
            target.setCalendarValue(expiryDate);
        }
    }
    
    /**
     * Sets (as xml) the "expiryDate" element
     */
    public void xsetExpiryDate(org.apache.xmlbeans.XmlDateTime expiryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRYDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPIRYDATE$2);
            }
            target.set(expiryDate);
        }
    }
    
    /**
     * Unsets the "expiryDate" element
     */
    public void unsetExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRYDATE$2, 0);
        }
    }
    
    /**
     * Gets the "parentIdTag" element
     */
    public java.lang.String getParentIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTIDTAG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parentIdTag" element
     */
    public ocpp.IdToken xgetParentIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdToken target = null;
            target = (ocpp.IdToken)get_store().find_element_user(PARENTIDTAG$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "parentIdTag" element
     */
    public boolean isSetParentIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTIDTAG$4) != 0;
        }
    }
    
    /**
     * Sets the "parentIdTag" element
     */
    public void setParentIdTag(java.lang.String parentIdTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTIDTAG$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTIDTAG$4);
            }
            target.setStringValue(parentIdTag);
        }
    }
    
    /**
     * Sets (as xml) the "parentIdTag" element
     */
    public void xsetParentIdTag(ocpp.IdToken parentIdTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdToken target = null;
            target = (ocpp.IdToken)get_store().find_element_user(PARENTIDTAG$4, 0);
            if (target == null)
            {
                target = (ocpp.IdToken)get_store().add_element_user(PARENTIDTAG$4);
            }
            target.set(parentIdTag);
        }
    }
    
    /**
     * Unsets the "parentIdTag" element
     */
    public void unsetParentIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTIDTAG$4, 0);
        }
    }
}
