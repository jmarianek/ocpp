/*
 * An XML document type.
 * Localname: heartbeatRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.HeartbeatRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one heartbeatRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class HeartbeatRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.HeartbeatRequestDocument
{
    
    public HeartbeatRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEARTBEATREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "heartbeatRequest");
    
    
    /**
     * Gets the "heartbeatRequest" element
     */
    public ocpp.HeartbeatRequest getHeartbeatRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.HeartbeatRequest target = null;
            target = (ocpp.HeartbeatRequest)get_store().find_element_user(HEARTBEATREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "heartbeatRequest" element
     */
    public void setHeartbeatRequest(ocpp.HeartbeatRequest heartbeatRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.HeartbeatRequest target = null;
            target = (ocpp.HeartbeatRequest)get_store().find_element_user(HEARTBEATREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.HeartbeatRequest)get_store().add_element_user(HEARTBEATREQUEST$0);
            }
            target.set(heartbeatRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "heartbeatRequest" element
     */
    public ocpp.HeartbeatRequest addNewHeartbeatRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.HeartbeatRequest target = null;
            target = (ocpp.HeartbeatRequest)get_store().add_element_user(HEARTBEATREQUEST$0);
            return target;
        }
    }
}
