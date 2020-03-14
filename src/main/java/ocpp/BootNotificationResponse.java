/*
 * XML Type:  BootNotificationResponse
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.BootNotificationResponse
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML BootNotificationResponse(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface BootNotificationResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BootNotificationResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("bootnotificationresponse1a49type");
    
    /**
     * Gets the "status" element
     */
    ocpp.RegistrationStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    ocpp.RegistrationStatus xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(ocpp.RegistrationStatus.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(ocpp.RegistrationStatus status);
    
    /**
     * Gets the "currentTime" element
     */
    java.util.Calendar getCurrentTime();
    
    /**
     * Gets (as xml) the "currentTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCurrentTime();
    
    /**
     * Sets the "currentTime" element
     */
    void setCurrentTime(java.util.Calendar currentTime);
    
    /**
     * Sets (as xml) the "currentTime" element
     */
    void xsetCurrentTime(org.apache.xmlbeans.XmlDateTime currentTime);
    
    /**
     * Gets the "interval" element
     */
    int getInterval();
    
    /**
     * Gets (as xml) the "interval" element
     */
    org.apache.xmlbeans.XmlInt xgetInterval();
    
    /**
     * Sets the "interval" element
     */
    void setInterval(int interval);
    
    /**
     * Sets (as xml) the "interval" element
     */
    void xsetInterval(org.apache.xmlbeans.XmlInt interval);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.BootNotificationResponse newInstance() {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.BootNotificationResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.BootNotificationResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.BootNotificationResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.BootNotificationResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.BootNotificationResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.BootNotificationResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.BootNotificationResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.BootNotificationResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.BootNotificationResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.BootNotificationResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.BootNotificationResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.BootNotificationResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.BootNotificationResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.BootNotificationResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.BootNotificationResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.BootNotificationResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.BootNotificationResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.BootNotificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
