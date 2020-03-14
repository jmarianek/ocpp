/*
 * An XML document type.
 * Localname: authorizeRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.AuthorizeRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one authorizeRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class AuthorizeRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.AuthorizeRequestDocument
{
    
    public AuthorizeRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORIZEREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "authorizeRequest");
    
    
    /**
     * Gets the "authorizeRequest" element
     */
    public ocpp.AuthorizeRequest getAuthorizeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.AuthorizeRequest target = null;
            target = (ocpp.AuthorizeRequest)get_store().find_element_user(AUTHORIZEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "authorizeRequest" element
     */
    public void setAuthorizeRequest(ocpp.AuthorizeRequest authorizeRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.AuthorizeRequest target = null;
            target = (ocpp.AuthorizeRequest)get_store().find_element_user(AUTHORIZEREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.AuthorizeRequest)get_store().add_element_user(AUTHORIZEREQUEST$0);
            }
            target.set(authorizeRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "authorizeRequest" element
     */
    public ocpp.AuthorizeRequest addNewAuthorizeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.AuthorizeRequest target = null;
            target = (ocpp.AuthorizeRequest)get_store().add_element_user(AUTHORIZEREQUEST$0);
            return target;
        }
    }
}
