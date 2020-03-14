/*
 * XML Type:  StopTransactionResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StopTransactionResponse
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML StopTransactionResponse(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class StopTransactionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StopTransactionResponse
{
    
    public StopTransactionResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
     * True if has "idTagInfo" element
     */
    public boolean isSetIdTagInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDTAGINFO$0) != 0;
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
    
    /**
     * Unsets the "idTagInfo" element
     */
    public void unsetIdTagInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDTAGINFO$0, 0);
        }
    }
}
