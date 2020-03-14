/*
 * XML Type:  StatusNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StatusNotificationRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML StatusNotificationRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface StatusNotificationRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusNotificationRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("statusnotificationrequest5487type");
    
    /**
     * Gets the "connectorId" element
     */
    int getConnectorId();
    
    /**
     * Gets (as xml) the "connectorId" element
     */
    org.apache.xmlbeans.XmlInt xgetConnectorId();
    
    /**
     * Sets the "connectorId" element
     */
    void setConnectorId(int connectorId);
    
    /**
     * Sets (as xml) the "connectorId" element
     */
    void xsetConnectorId(org.apache.xmlbeans.XmlInt connectorId);
    
    /**
     * Gets the "status" element
     */
    ocpp.ChargePointStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    ocpp.ChargePointStatus xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(ocpp.ChargePointStatus.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(ocpp.ChargePointStatus status);
    
    /**
     * Gets the "errorCode" element
     */
    ocpp.ChargePointErrorCode.Enum getErrorCode();
    
    /**
     * Gets (as xml) the "errorCode" element
     */
    ocpp.ChargePointErrorCode xgetErrorCode();
    
    /**
     * Sets the "errorCode" element
     */
    void setErrorCode(ocpp.ChargePointErrorCode.Enum errorCode);
    
    /**
     * Sets (as xml) the "errorCode" element
     */
    void xsetErrorCode(ocpp.ChargePointErrorCode errorCode);
    
    /**
     * Gets the "info" element
     */
    java.lang.String getInfo();
    
    /**
     * Gets (as xml) the "info" element
     */
    ocpp.CiString50Type xgetInfo();
    
    /**
     * True if has "info" element
     */
    boolean isSetInfo();
    
    /**
     * Sets the "info" element
     */
    void setInfo(java.lang.String info);
    
    /**
     * Sets (as xml) the "info" element
     */
    void xsetInfo(ocpp.CiString50Type info);
    
    /**
     * Unsets the "info" element
     */
    void unsetInfo();
    
    /**
     * Gets the "timestamp" element
     */
    java.util.Calendar getTimestamp();
    
    /**
     * Gets (as xml) the "timestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetTimestamp();
    
    /**
     * True if has "timestamp" element
     */
    boolean isSetTimestamp();
    
    /**
     * Sets the "timestamp" element
     */
    void setTimestamp(java.util.Calendar timestamp);
    
    /**
     * Sets (as xml) the "timestamp" element
     */
    void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp);
    
    /**
     * Unsets the "timestamp" element
     */
    void unsetTimestamp();
    
    /**
     * Gets the "vendorId" element
     */
    java.lang.String getVendorId();
    
    /**
     * Gets (as xml) the "vendorId" element
     */
    ocpp.CiString255Type xgetVendorId();
    
    /**
     * True if has "vendorId" element
     */
    boolean isSetVendorId();
    
    /**
     * Sets the "vendorId" element
     */
    void setVendorId(java.lang.String vendorId);
    
    /**
     * Sets (as xml) the "vendorId" element
     */
    void xsetVendorId(ocpp.CiString255Type vendorId);
    
    /**
     * Unsets the "vendorId" element
     */
    void unsetVendorId();
    
    /**
     * Gets the "vendorErrorCode" element
     */
    java.lang.String getVendorErrorCode();
    
    /**
     * Gets (as xml) the "vendorErrorCode" element
     */
    ocpp.CiString50Type xgetVendorErrorCode();
    
    /**
     * True if has "vendorErrorCode" element
     */
    boolean isSetVendorErrorCode();
    
    /**
     * Sets the "vendorErrorCode" element
     */
    void setVendorErrorCode(java.lang.String vendorErrorCode);
    
    /**
     * Sets (as xml) the "vendorErrorCode" element
     */
    void xsetVendorErrorCode(ocpp.CiString50Type vendorErrorCode);
    
    /**
     * Unsets the "vendorErrorCode" element
     */
    void unsetVendorErrorCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.StatusNotificationRequest newInstance() {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.StatusNotificationRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.StatusNotificationRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.StatusNotificationRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.StatusNotificationRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.StatusNotificationRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.StatusNotificationRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.StatusNotificationRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.StatusNotificationRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.StatusNotificationRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.StatusNotificationRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.StatusNotificationRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.StatusNotificationRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.StatusNotificationRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.StatusNotificationRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.StatusNotificationRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.StatusNotificationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.StatusNotificationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.StatusNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
