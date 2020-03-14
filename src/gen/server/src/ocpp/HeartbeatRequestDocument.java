/*
 * An XML document type.
 * Localname: heartbeatRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.HeartbeatRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * A document containing one heartbeatRequest(@urn://Ocpp/Cs/2015/10/) element.
 *
 * This is a complex type.
 */
public interface HeartbeatRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeartbeatRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("heartbeatrequest4424doctype");
    
    /**
     * Gets the "heartbeatRequest" element
     */
    ocpp.HeartbeatRequest getHeartbeatRequest();
    
    /**
     * Sets the "heartbeatRequest" element
     */
    void setHeartbeatRequest(ocpp.HeartbeatRequest heartbeatRequest);
    
    /**
     * Appends and returns a new empty "heartbeatRequest" element
     */
    ocpp.HeartbeatRequest addNewHeartbeatRequest();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.HeartbeatRequestDocument newInstance() {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.HeartbeatRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.HeartbeatRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.HeartbeatRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.HeartbeatRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.HeartbeatRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.HeartbeatRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.HeartbeatRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.HeartbeatRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.HeartbeatRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.HeartbeatRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.HeartbeatRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.HeartbeatRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.HeartbeatRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.HeartbeatRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.HeartbeatRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.HeartbeatRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.HeartbeatRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.HeartbeatRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
