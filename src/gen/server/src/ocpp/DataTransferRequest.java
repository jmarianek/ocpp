/*
 * XML Type:  DataTransferRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.DataTransferRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML DataTransferRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface DataTransferRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataTransferRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("datatransferrequestccfftype");
    
    /**
     * Gets the "vendorId" element
     */
    java.lang.String getVendorId();
    
    /**
     * Gets (as xml) the "vendorId" element
     */
    ocpp.CiString255Type xgetVendorId();
    
    /**
     * Sets the "vendorId" element
     */
    void setVendorId(java.lang.String vendorId);
    
    /**
     * Sets (as xml) the "vendorId" element
     */
    void xsetVendorId(ocpp.CiString255Type vendorId);
    
    /**
     * Gets the "messageId" element
     */
    java.lang.String getMessageId();
    
    /**
     * Gets (as xml) the "messageId" element
     */
    ocpp.CiString50Type xgetMessageId();
    
    /**
     * True if has "messageId" element
     */
    boolean isSetMessageId();
    
    /**
     * Sets the "messageId" element
     */
    void setMessageId(java.lang.String messageId);
    
    /**
     * Sets (as xml) the "messageId" element
     */
    void xsetMessageId(ocpp.CiString50Type messageId);
    
    /**
     * Unsets the "messageId" element
     */
    void unsetMessageId();
    
    /**
     * Gets the "data" element
     */
    java.lang.String getData();
    
    /**
     * Gets (as xml) the "data" element
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * True if has "data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "data" element
     */
    void setData(java.lang.String data);
    
    /**
     * Sets (as xml) the "data" element
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Unsets the "data" element
     */
    void unsetData();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.DataTransferRequest newInstance() {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.DataTransferRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.DataTransferRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.DataTransferRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.DataTransferRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.DataTransferRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.DataTransferRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.DataTransferRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.DataTransferRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.DataTransferRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.DataTransferRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.DataTransferRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.DataTransferRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.DataTransferRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.DataTransferRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.DataTransferRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.DataTransferRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.DataTransferRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.DataTransferRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
