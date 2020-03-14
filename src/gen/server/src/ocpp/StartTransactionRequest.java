/*
 * XML Type:  StartTransactionRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StartTransactionRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML StartTransactionRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface StartTransactionRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StartTransactionRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("starttransactionrequest15a6type");
    
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
     * Gets the "idTag" element
     */
    java.lang.String getIdTag();
    
    /**
     * Gets (as xml) the "idTag" element
     */
    ocpp.IdToken xgetIdTag();
    
    /**
     * Sets the "idTag" element
     */
    void setIdTag(java.lang.String idTag);
    
    /**
     * Sets (as xml) the "idTag" element
     */
    void xsetIdTag(ocpp.IdToken idTag);
    
    /**
     * Gets the "timestamp" element
     */
    java.util.Calendar getTimestamp();
    
    /**
     * Gets (as xml) the "timestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetTimestamp();
    
    /**
     * Sets the "timestamp" element
     */
    void setTimestamp(java.util.Calendar timestamp);
    
    /**
     * Sets (as xml) the "timestamp" element
     */
    void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp);
    
    /**
     * Gets the "meterStart" element
     */
    int getMeterStart();
    
    /**
     * Gets (as xml) the "meterStart" element
     */
    org.apache.xmlbeans.XmlInt xgetMeterStart();
    
    /**
     * Sets the "meterStart" element
     */
    void setMeterStart(int meterStart);
    
    /**
     * Sets (as xml) the "meterStart" element
     */
    void xsetMeterStart(org.apache.xmlbeans.XmlInt meterStart);
    
    /**
     * Gets the "reservationId" element
     */
    int getReservationId();
    
    /**
     * Gets (as xml) the "reservationId" element
     */
    org.apache.xmlbeans.XmlInt xgetReservationId();
    
    /**
     * True if has "reservationId" element
     */
    boolean isSetReservationId();
    
    /**
     * Sets the "reservationId" element
     */
    void setReservationId(int reservationId);
    
    /**
     * Sets (as xml) the "reservationId" element
     */
    void xsetReservationId(org.apache.xmlbeans.XmlInt reservationId);
    
    /**
     * Unsets the "reservationId" element
     */
    void unsetReservationId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.StartTransactionRequest newInstance() {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.StartTransactionRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.StartTransactionRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.StartTransactionRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.StartTransactionRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.StartTransactionRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.StartTransactionRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.StartTransactionRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.StartTransactionRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.StartTransactionRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.StartTransactionRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.StartTransactionRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.StartTransactionRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.StartTransactionRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.StartTransactionRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.StartTransactionRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.StartTransactionRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.StartTransactionRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.StartTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
