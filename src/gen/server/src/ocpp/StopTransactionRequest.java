/*
 * XML Type:  StopTransactionRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StopTransactionRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML StopTransactionRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface StopTransactionRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StopTransactionRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("stoptransactionrequestdb54type");
    
    /**
     * Gets the "transactionId" element
     */
    int getTransactionId();
    
    /**
     * Gets (as xml) the "transactionId" element
     */
    org.apache.xmlbeans.XmlInt xgetTransactionId();
    
    /**
     * Sets the "transactionId" element
     */
    void setTransactionId(int transactionId);
    
    /**
     * Sets (as xml) the "transactionId" element
     */
    void xsetTransactionId(org.apache.xmlbeans.XmlInt transactionId);
    
    /**
     * Gets the "idTag" element
     */
    java.lang.String getIdTag();
    
    /**
     * Gets (as xml) the "idTag" element
     */
    ocpp.IdToken xgetIdTag();
    
    /**
     * True if has "idTag" element
     */
    boolean isSetIdTag();
    
    /**
     * Sets the "idTag" element
     */
    void setIdTag(java.lang.String idTag);
    
    /**
     * Sets (as xml) the "idTag" element
     */
    void xsetIdTag(ocpp.IdToken idTag);
    
    /**
     * Unsets the "idTag" element
     */
    void unsetIdTag();
    
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
     * Gets the "meterStop" element
     */
    int getMeterStop();
    
    /**
     * Gets (as xml) the "meterStop" element
     */
    org.apache.xmlbeans.XmlInt xgetMeterStop();
    
    /**
     * Sets the "meterStop" element
     */
    void setMeterStop(int meterStop);
    
    /**
     * Sets (as xml) the "meterStop" element
     */
    void xsetMeterStop(org.apache.xmlbeans.XmlInt meterStop);
    
    /**
     * Gets the "reason" element
     */
    ocpp.Reason.Enum getReason();
    
    /**
     * Gets (as xml) the "reason" element
     */
    ocpp.Reason xgetReason();
    
    /**
     * True if has "reason" element
     */
    boolean isSetReason();
    
    /**
     * Sets the "reason" element
     */
    void setReason(ocpp.Reason.Enum reason);
    
    /**
     * Sets (as xml) the "reason" element
     */
    void xsetReason(ocpp.Reason reason);
    
    /**
     * Unsets the "reason" element
     */
    void unsetReason();
    
    /**
     * Gets array of all "transactionData" elements
     */
    ocpp.MeterValue[] getTransactionDataArray();
    
    /**
     * Gets ith "transactionData" element
     */
    ocpp.MeterValue getTransactionDataArray(int i);
    
    /**
     * Returns number of "transactionData" element
     */
    int sizeOfTransactionDataArray();
    
    /**
     * Sets array of all "transactionData" element
     */
    void setTransactionDataArray(ocpp.MeterValue[] transactionDataArray);
    
    /**
     * Sets ith "transactionData" element
     */
    void setTransactionDataArray(int i, ocpp.MeterValue transactionData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transactionData" element
     */
    ocpp.MeterValue insertNewTransactionData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transactionData" element
     */
    ocpp.MeterValue addNewTransactionData();
    
    /**
     * Removes the ith "transactionData" element
     */
    void removeTransactionData(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.StopTransactionRequest newInstance() {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.StopTransactionRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.StopTransactionRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.StopTransactionRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.StopTransactionRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.StopTransactionRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.StopTransactionRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.StopTransactionRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.StopTransactionRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.StopTransactionRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.StopTransactionRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.StopTransactionRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.StopTransactionRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.StopTransactionRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.StopTransactionRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.StopTransactionRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.StopTransactionRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.StopTransactionRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.StopTransactionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
