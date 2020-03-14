/*
 * An XML document type.
 * Localname: heartbeatResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.HeartbeatResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one heartbeatResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class HeartbeatResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.HeartbeatResponseDocument
{
    
    public HeartbeatResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEARTBEATRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "heartbeatResponse");
    
    
    /**
     * Gets the "heartbeatResponse" element
     */
    public ocpp.HeartbeatResponse getHeartbeatResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.HeartbeatResponse target = null;
            target = (ocpp.HeartbeatResponse)get_store().find_element_user(HEARTBEATRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "heartbeatResponse" element
     */
    public void setHeartbeatResponse(ocpp.HeartbeatResponse heartbeatResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.HeartbeatResponse target = null;
            target = (ocpp.HeartbeatResponse)get_store().find_element_user(HEARTBEATRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.HeartbeatResponse)get_store().add_element_user(HEARTBEATRESPONSE$0);
            }
            target.set(heartbeatResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "heartbeatResponse" element
     */
    public ocpp.HeartbeatResponse addNewHeartbeatResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.HeartbeatResponse target = null;
            target = (ocpp.HeartbeatResponse)get_store().add_element_user(HEARTBEATRESPONSE$0);
            return target;
        }
    }
}
