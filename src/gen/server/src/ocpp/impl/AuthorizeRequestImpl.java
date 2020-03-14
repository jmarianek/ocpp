/*
 * XML Type:  AuthorizeRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.AuthorizeRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML AuthorizeRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class AuthorizeRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.AuthorizeRequest
{
    
    public AuthorizeRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDTAG$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "idTag");
    
    
    /**
     * Gets the "idTag" element
     */
    public java.lang.String getIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTAG$0, 0);
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
            target = (ocpp.IdToken)get_store().find_element_user(IDTAG$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTAG$0);
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
            target = (ocpp.IdToken)get_store().find_element_user(IDTAG$0, 0);
            if (target == null)
            {
                target = (ocpp.IdToken)get_store().add_element_user(IDTAG$0);
            }
            target.set(idTag);
        }
    }
}
