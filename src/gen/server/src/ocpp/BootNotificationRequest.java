/*
 * XML Type:  BootNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.BootNotificationRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML BootNotificationRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface BootNotificationRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BootNotificationRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("bootnotificationrequest8dc7type");
    
    /**
     * Gets the "chargePointVendor" element
     */
    java.lang.String getChargePointVendor();
    
    /**
     * Gets (as xml) the "chargePointVendor" element
     */
    ocpp.CiString20Type xgetChargePointVendor();
    
    /**
     * Sets the "chargePointVendor" element
     */
    void setChargePointVendor(java.lang.String chargePointVendor);
    
    /**
     * Sets (as xml) the "chargePointVendor" element
     */
    void xsetChargePointVendor(ocpp.CiString20Type chargePointVendor);
    
    /**
     * Gets the "chargePointModel" element
     */
    java.lang.String getChargePointModel();
    
    /**
     * Gets (as xml) the "chargePointModel" element
     */
    ocpp.CiString20Type xgetChargePointModel();
    
    /**
     * Sets the "chargePointModel" element
     */
    void setChargePointModel(java.lang.String chargePointModel);
    
    /**
     * Sets (as xml) the "chargePointModel" element
     */
    void xsetChargePointModel(ocpp.CiString20Type chargePointModel);
    
    /**
     * Gets the "chargePointSerialNumber" element
     */
    java.lang.String getChargePointSerialNumber();
    
    /**
     * Gets (as xml) the "chargePointSerialNumber" element
     */
    ocpp.CiString25Type xgetChargePointSerialNumber();
    
    /**
     * True if has "chargePointSerialNumber" element
     */
    boolean isSetChargePointSerialNumber();
    
    /**
     * Sets the "chargePointSerialNumber" element
     */
    void setChargePointSerialNumber(java.lang.String chargePointSerialNumber);
    
    /**
     * Sets (as xml) the "chargePointSerialNumber" element
     */
    void xsetChargePointSerialNumber(ocpp.CiString25Type chargePointSerialNumber);
    
    /**
     * Unsets the "chargePointSerialNumber" element
     */
    void unsetChargePointSerialNumber();
    
    /**
     * Gets the "chargeBoxSerialNumber" element
     */
    java.lang.String getChargeBoxSerialNumber();
    
    /**
     * Gets (as xml) the "chargeBoxSerialNumber" element
     */
    ocpp.CiString25Type xgetChargeBoxSerialNumber();
    
    /**
     * True if has "chargeBoxSerialNumber" element
     */
    boolean isSetChargeBoxSerialNumber();
    
    /**
     * Sets the "chargeBoxSerialNumber" element
     */
    void setChargeBoxSerialNumber(java.lang.String chargeBoxSerialNumber);
    
    /**
     * Sets (as xml) the "chargeBoxSerialNumber" element
     */
    void xsetChargeBoxSerialNumber(ocpp.CiString25Type chargeBoxSerialNumber);
    
    /**
     * Unsets the "chargeBoxSerialNumber" element
     */
    void unsetChargeBoxSerialNumber();
    
    /**
     * Gets the "firmwareVersion" element
     */
    java.lang.String getFirmwareVersion();
    
    /**
     * Gets (as xml) the "firmwareVersion" element
     */
    ocpp.CiString50Type xgetFirmwareVersion();
    
    /**
     * True if has "firmwareVersion" element
     */
    boolean isSetFirmwareVersion();
    
    /**
     * Sets the "firmwareVersion" element
     */
    void setFirmwareVersion(java.lang.String firmwareVersion);
    
    /**
     * Sets (as xml) the "firmwareVersion" element
     */
    void xsetFirmwareVersion(ocpp.CiString50Type firmwareVersion);
    
    /**
     * Unsets the "firmwareVersion" element
     */
    void unsetFirmwareVersion();
    
    /**
     * Gets the "iccid" element
     */
    java.lang.String getIccid();
    
    /**
     * Gets (as xml) the "iccid" element
     */
    ocpp.CiString20Type xgetIccid();
    
    /**
     * True if has "iccid" element
     */
    boolean isSetIccid();
    
    /**
     * Sets the "iccid" element
     */
    void setIccid(java.lang.String iccid);
    
    /**
     * Sets (as xml) the "iccid" element
     */
    void xsetIccid(ocpp.CiString20Type iccid);
    
    /**
     * Unsets the "iccid" element
     */
    void unsetIccid();
    
    /**
     * Gets the "imsi" element
     */
    java.lang.String getImsi();
    
    /**
     * Gets (as xml) the "imsi" element
     */
    ocpp.CiString20Type xgetImsi();
    
    /**
     * True if has "imsi" element
     */
    boolean isSetImsi();
    
    /**
     * Sets the "imsi" element
     */
    void setImsi(java.lang.String imsi);
    
    /**
     * Sets (as xml) the "imsi" element
     */
    void xsetImsi(ocpp.CiString20Type imsi);
    
    /**
     * Unsets the "imsi" element
     */
    void unsetImsi();
    
    /**
     * Gets the "meterType" element
     */
    java.lang.String getMeterType();
    
    /**
     * Gets (as xml) the "meterType" element
     */
    ocpp.CiString25Type xgetMeterType();
    
    /**
     * True if has "meterType" element
     */
    boolean isSetMeterType();
    
    /**
     * Sets the "meterType" element
     */
    void setMeterType(java.lang.String meterType);
    
    /**
     * Sets (as xml) the "meterType" element
     */
    void xsetMeterType(ocpp.CiString25Type meterType);
    
    /**
     * Unsets the "meterType" element
     */
    void unsetMeterType();
    
    /**
     * Gets the "meterSerialNumber" element
     */
    java.lang.String getMeterSerialNumber();
    
    /**
     * Gets (as xml) the "meterSerialNumber" element
     */
    ocpp.CiString25Type xgetMeterSerialNumber();
    
    /**
     * True if has "meterSerialNumber" element
     */
    boolean isSetMeterSerialNumber();
    
    /**
     * Sets the "meterSerialNumber" element
     */
    void setMeterSerialNumber(java.lang.String meterSerialNumber);
    
    /**
     * Sets (as xml) the "meterSerialNumber" element
     */
    void xsetMeterSerialNumber(ocpp.CiString25Type meterSerialNumber);
    
    /**
     * Unsets the "meterSerialNumber" element
     */
    void unsetMeterSerialNumber();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.BootNotificationRequest newInstance() {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.BootNotificationRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.BootNotificationRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.BootNotificationRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.BootNotificationRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.BootNotificationRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.BootNotificationRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.BootNotificationRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.BootNotificationRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.BootNotificationRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.BootNotificationRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.BootNotificationRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.BootNotificationRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.BootNotificationRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.BootNotificationRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.BootNotificationRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.BootNotificationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.BootNotificationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.BootNotificationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
