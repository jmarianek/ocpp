/*
 * An XML document type.
 * Localname: chargeBoxIdentity
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.ChargeBoxIdentityDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one chargeBoxIdentity(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class ChargeBoxIdentityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.ChargeBoxIdentityDocument
{
    
    public ChargeBoxIdentityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARGEBOXIDENTITY$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "chargeBoxIdentity");
    
    
    /**
     * Gets the "chargeBoxIdentity" element
     */
    public java.lang.String getChargeBoxIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEBOXIDENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chargeBoxIdentity" element
     */
    public org.apache.xmlbeans.XmlString xgetChargeBoxIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGEBOXIDENTITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "chargeBoxIdentity" element
     */
    public void setChargeBoxIdentity(java.lang.String chargeBoxIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEBOXIDENTITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGEBOXIDENTITY$0);
            }
            target.setStringValue(chargeBoxIdentity);
        }
    }
    
    /**
     * Sets (as xml) the "chargeBoxIdentity" element
     */
    public void xsetChargeBoxIdentity(org.apache.xmlbeans.XmlString chargeBoxIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGEBOXIDENTITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHARGEBOXIDENTITY$0);
            }
            target.set(chargeBoxIdentity);
        }
    }
}
