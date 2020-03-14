/*
 * XML Type:  AuthorizeResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.AuthorizeResponse
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML AuthorizeResponse(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class AuthorizeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.AuthorizeResponse
{
    
    public AuthorizeResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDTAGINFO$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "idTagInfo");
    
    
    /**
     * Gets the "idTagInfo" element
     */
    public ocpp.IdTagInfo getIdTagInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdTagInfo target = null;
            target = (ocpp.IdTagInfo)get_store().find_element_user(IDTAGINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "idTagInfo" element
     */
    public void setIdTagInfo(ocpp.IdTagInfo idTagInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdTagInfo target = null;
            target = (ocpp.IdTagInfo)get_store().find_element_user(IDTAGINFO$0, 0);
            if (target == null)
            {
                target = (ocpp.IdTagInfo)get_store().add_element_user(IDTAGINFO$0);
            }
            target.set(idTagInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "idTagInfo" element
     */
    public ocpp.IdTagInfo addNewIdTagInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdTagInfo target = null;
            target = (ocpp.IdTagInfo)get_store().add_element_user(IDTAGINFO$0);
            return target;
        }
    }
}
