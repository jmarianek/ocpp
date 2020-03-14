/*
 * An XML document type.
 * Localname: authorizeResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.AuthorizeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one authorizeResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class AuthorizeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.AuthorizeResponseDocument
{
    
    public AuthorizeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORIZERESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "authorizeResponse");
    
    
    /**
     * Gets the "authorizeResponse" element
     */
    public ocpp.AuthorizeResponse getAuthorizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.AuthorizeResponse target = null;
            target = (ocpp.AuthorizeResponse)get_store().find_element_user(AUTHORIZERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "authorizeResponse" element
     */
    public void setAuthorizeResponse(ocpp.AuthorizeResponse authorizeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.AuthorizeResponse target = null;
            target = (ocpp.AuthorizeResponse)get_store().find_element_user(AUTHORIZERESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.AuthorizeResponse)get_store().add_element_user(AUTHORIZERESPONSE$0);
            }
            target.set(authorizeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "authorizeResponse" element
     */
    public ocpp.AuthorizeResponse addNewAuthorizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.AuthorizeResponse target = null;
            target = (ocpp.AuthorizeResponse)get_store().add_element_user(AUTHORIZERESPONSE$0);
            return target;
        }
    }
}
