/*
 * XML Type:  StartTransactionResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StartTransactionResponse
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML StartTransactionResponse(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class StartTransactionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StartTransactionResponse
{
    
    public StartTransactionResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONID$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "transactionId");
    private static final javax.xml.namespace.QName IDTAGINFO$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "idTagInfo");
    
    
    /**
     * Gets the "transactionId" element
     */
    public int getTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "transactionId" element
     */
    public org.apache.xmlbeans.XmlInt xgetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "transactionId" element
     */
    public void setTransactionId(int transactionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$0);
            }
            target.setIntValue(transactionId);
        }
    }
    
    /**
     * Sets (as xml) the "transactionId" element
     */
    public void xsetTransactionId(org.apache.xmlbeans.XmlInt transactionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TRANSACTIONID$0);
            }
            target.set(transactionId);
        }
    }
    
    /**
     * Gets the "idTagInfo" element
     */
    public ocpp.IdTagInfo getIdTagInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdTagInfo target = null;
            target = (ocpp.IdTagInfo)get_store().find_element_user(IDTAGINFO$2, 0);
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
            target = (ocpp.IdTagInfo)get_store().find_element_user(IDTAGINFO$2, 0);
            if (target == null)
            {
                target = (ocpp.IdTagInfo)get_store().add_element_user(IDTAGINFO$2);
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
            target = (ocpp.IdTagInfo)get_store().add_element_user(IDTAGINFO$2);
            return target;
        }
    }
}
