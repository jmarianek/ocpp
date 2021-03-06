/*
 * XML Type:  IdTagInfo
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.IdTagInfo
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML IdTagInfo(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface IdTagInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdTagInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("idtaginfo4c2ctype");
    
    /**
     * Gets the "status" element
     */
    ocpp.AuthorizationStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    ocpp.AuthorizationStatus xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(ocpp.AuthorizationStatus.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(ocpp.AuthorizationStatus status);
    
    /**
     * Gets the "expiryDate" element
     */
    java.util.Calendar getExpiryDate();
    
    /**
     * Gets (as xml) the "expiryDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetExpiryDate();
    
    /**
     * True if has "expiryDate" element
     */
    boolean isSetExpiryDate();
    
    /**
     * Sets the "expiryDate" element
     */
    void setExpiryDate(java.util.Calendar expiryDate);
    
    /**
     * Sets (as xml) the "expiryDate" element
     */
    void xsetExpiryDate(org.apache.xmlbeans.XmlDateTime expiryDate);
    
    /**
     * Unsets the "expiryDate" element
     */
    void unsetExpiryDate();
    
    /**
     * Gets the "parentIdTag" element
     */
    java.lang.String getParentIdTag();
    
    /**
     * Gets (as xml) the "parentIdTag" element
     */
    ocpp.IdToken xgetParentIdTag();
    
    /**
     * True if has "parentIdTag" element
     */
    boolean isSetParentIdTag();
    
    /**
     * Sets the "parentIdTag" element
     */
    void setParentIdTag(java.lang.String parentIdTag);
    
    /**
     * Sets (as xml) the "parentIdTag" element
     */
    void xsetParentIdTag(ocpp.IdToken parentIdTag);
    
    /**
     * Unsets the "parentIdTag" element
     */
    void unsetParentIdTag();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.IdTagInfo newInstance() {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.IdTagInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.IdTagInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.IdTagInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.IdTagInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.IdTagInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.IdTagInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.IdTagInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.IdTagInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.IdTagInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.IdTagInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.IdTagInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.IdTagInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.IdTagInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.IdTagInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.IdTagInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.IdTagInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.IdTagInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.IdTagInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
