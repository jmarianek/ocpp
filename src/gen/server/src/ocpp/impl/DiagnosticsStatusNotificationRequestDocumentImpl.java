/*
 * An XML document type.
 * Localname: diagnosticsStatusNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.DiagnosticsStatusNotificationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * A document containing one diagnosticsStatusNotificationRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public class DiagnosticsStatusNotificationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.DiagnosticsStatusNotificationRequestDocument
{
    
    public DiagnosticsStatusNotificationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSTICSSTATUSNOTIFICATIONREQUEST$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "diagnosticsStatusNotificationRequest");
    
    
    /**
     * Gets the "diagnosticsStatusNotificationRequest" element
     */
    public ocpp.DiagnosticsStatusNotificationRequest getDiagnosticsStatusNotificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DiagnosticsStatusNotificationRequest target = null;
            target = (ocpp.DiagnosticsStatusNotificationRequest)get_store().find_element_user(DIAGNOSTICSSTATUSNOTIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "diagnosticsStatusNotificationRequest" element
     */
    public void setDiagnosticsStatusNotificationRequest(ocpp.DiagnosticsStatusNotificationRequest diagnosticsStatusNotificationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DiagnosticsStatusNotificationRequest target = null;
            target = (ocpp.DiagnosticsStatusNotificationRequest)get_store().find_element_user(DIAGNOSTICSSTATUSNOTIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (ocpp.DiagnosticsStatusNotificationRequest)get_store().add_element_user(DIAGNOSTICSSTATUSNOTIFICATIONREQUEST$0);
            }
            target.set(diagnosticsStatusNotificationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "diagnosticsStatusNotificationRequest" element
     */
    public ocpp.DiagnosticsStatusNotificationRequest addNewDiagnosticsStatusNotificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.DiagnosticsStatusNotificationRequest target = null;
            target = (ocpp.DiagnosticsStatusNotificationRequest)get_store().add_element_user(DIAGNOSTICSSTATUSNOTIFICATIONREQUEST$0);
            return target;
        }
    }
}
