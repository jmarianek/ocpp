/*
 * An XML document type.
 * Localname: diagnosticsStatusNotificationResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.DiagnosticsStatusNotificationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one diagnosticsStatusNotificationResponse(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class DiagnosticsStatusNotificationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.DiagnosticsStatusNotificationResponseDocument
{
    
    public DiagnosticsStatusNotificationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSTICSSTATUSNOTIFICATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "diagnosticsStatusNotificationResponse");
    
    
    /**
     * Gets the "diagnosticsStatusNotificationResponse" element
     */
    public ocpp.DiagnosticsStatusNotificationResponse getDiagnosticsStatusNotificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DiagnosticsStatusNotificationResponse target = null;
            target = (ocpp.DiagnosticsStatusNotificationResponse)get_store().find_element_user(DIAGNOSTICSSTATUSNOTIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "diagnosticsStatusNotificationResponse" element
     */
    public void setDiagnosticsStatusNotificationResponse(ocpp.DiagnosticsStatusNotificationResponse diagnosticsStatusNotificationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DiagnosticsStatusNotificationResponse target = null;
            target = (ocpp.DiagnosticsStatusNotificationResponse)get_store().find_element_user(DIAGNOSTICSSTATUSNOTIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (ocpp.DiagnosticsStatusNotificationResponse)get_store().add_element_user(DIAGNOSTICSSTATUSNOTIFICATIONRESPONSE$0);
            }
            target.set(diagnosticsStatusNotificationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "diagnosticsStatusNotificationResponse" element
     */
    public ocpp.DiagnosticsStatusNotificationResponse addNewDiagnosticsStatusNotificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DiagnosticsStatusNotificationResponse target = null;
            target = (ocpp.DiagnosticsStatusNotificationResponse)get_store().add_element_user(DIAGNOSTICSSTATUSNOTIFICATIONRESPONSE$0);
            return target;
        }
    }
}
