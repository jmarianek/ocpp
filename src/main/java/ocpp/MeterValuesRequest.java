/*
 * XML Type:  MeterValuesRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.MeterValuesRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML MeterValuesRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface MeterValuesRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MeterValuesRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("metervaluesrequest4723type");
    
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
     * Gets the "transactionId" element
     */
    int getTransactionId();
    
    /**
     * Gets (as xml) the "transactionId" element
     */
    org.apache.xmlbeans.XmlInt xgetTransactionId();
    
    /**
     * True if has "transactionId" element
     */
    boolean isSetTransactionId();
    
    /**
     * Sets the "transactionId" element
     */
    void setTransactionId(int transactionId);
    
    /**
     * Sets (as xml) the "transactionId" element
     */
    void xsetTransactionId(org.apache.xmlbeans.XmlInt transactionId);
    
    /**
     * Unsets the "transactionId" element
     */
    void unsetTransactionId();
    
    /**
     * Gets array of all "meterValue" elements
     */
    ocpp.MeterValue[] getMeterValueArray();
    
    /**
     * Gets ith "meterValue" element
     */
    ocpp.MeterValue getMeterValueArray(int i);
    
    /**
     * Returns number of "meterValue" element
     */
    int sizeOfMeterValueArray();
    
    /**
     * Sets array of all "meterValue" element
     */
    void setMeterValueArray(ocpp.MeterValue[] meterValueArray);
    
    /**
     * Sets ith "meterValue" element
     */
    void setMeterValueArray(int i, ocpp.MeterValue meterValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "meterValue" element
     */
    ocpp.MeterValue insertNewMeterValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "meterValue" element
     */
    ocpp.MeterValue addNewMeterValue();
    
    /**
     * Removes the ith "meterValue" element
     */
    void removeMeterValue(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.MeterValuesRequest newInstance() {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.MeterValuesRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.MeterValuesRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.MeterValuesRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.MeterValuesRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.MeterValuesRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.MeterValuesRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.MeterValuesRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.MeterValuesRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.MeterValuesRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.MeterValuesRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.MeterValuesRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.MeterValuesRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.MeterValuesRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.MeterValuesRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.MeterValuesRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.MeterValuesRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.MeterValuesRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.MeterValuesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
