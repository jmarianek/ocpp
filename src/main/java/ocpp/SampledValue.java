/*
 * XML Type:  SampledValue
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.SampledValue
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML SampledValue(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public interface SampledValue extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SampledValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("sampledvalueef70type");
    
    /**
     * Gets the "value" element
     */
    java.lang.String getValue();
    
    /**
     * Gets (as xml) the "value" element
     */
    org.apache.xmlbeans.XmlString xgetValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(java.lang.String value);
    
    /**
     * Sets (as xml) the "value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
    
    /**
     * Gets the "context" element
     */
    ocpp.ReadingContext.Enum getContext();
    
    /**
     * Gets (as xml) the "context" element
     */
    ocpp.ReadingContext xgetContext();
    
    /**
     * True if has "context" element
     */
    boolean isSetContext();
    
    /**
     * Sets the "context" element
     */
    void setContext(ocpp.ReadingContext.Enum context);
    
    /**
     * Sets (as xml) the "context" element
     */
    void xsetContext(ocpp.ReadingContext context);
    
    /**
     * Unsets the "context" element
     */
    void unsetContext();
    
    /**
     * Gets the "format" element
     */
    ocpp.ValueFormat.Enum getFormat();
    
    /**
     * Gets (as xml) the "format" element
     */
    ocpp.ValueFormat xgetFormat();
    
    /**
     * True if has "format" element
     */
    boolean isSetFormat();
    
    /**
     * Sets the "format" element
     */
    void setFormat(ocpp.ValueFormat.Enum format);
    
    /**
     * Sets (as xml) the "format" element
     */
    void xsetFormat(ocpp.ValueFormat format);
    
    /**
     * Unsets the "format" element
     */
    void unsetFormat();
    
    /**
     * Gets the "measurand" element
     */
    ocpp.Measurand.Enum getMeasurand();
    
    /**
     * Gets (as xml) the "measurand" element
     */
    ocpp.Measurand xgetMeasurand();
    
    /**
     * True if has "measurand" element
     */
    boolean isSetMeasurand();
    
    /**
     * Sets the "measurand" element
     */
    void setMeasurand(ocpp.Measurand.Enum measurand);
    
    /**
     * Sets (as xml) the "measurand" element
     */
    void xsetMeasurand(ocpp.Measurand measurand);
    
    /**
     * Unsets the "measurand" element
     */
    void unsetMeasurand();
    
    /**
     * Gets the "phase" element
     */
    ocpp.Phase.Enum getPhase();
    
    /**
     * Gets (as xml) the "phase" element
     */
    ocpp.Phase xgetPhase();
    
    /**
     * True if has "phase" element
     */
    boolean isSetPhase();
    
    /**
     * Sets the "phase" element
     */
    void setPhase(ocpp.Phase.Enum phase);
    
    /**
     * Sets (as xml) the "phase" element
     */
    void xsetPhase(ocpp.Phase phase);
    
    /**
     * Unsets the "phase" element
     */
    void unsetPhase();
    
    /**
     * Gets the "location" element
     */
    ocpp.Location.Enum getLocation();
    
    /**
     * Gets (as xml) the "location" element
     */
    ocpp.Location xgetLocation();
    
    /**
     * True if has "location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(ocpp.Location.Enum location);
    
    /**
     * Sets (as xml) the "location" element
     */
    void xsetLocation(ocpp.Location location);
    
    /**
     * Unsets the "location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "unit" element
     */
    ocpp.UnitOfMeasure.Enum getUnit();
    
    /**
     * Gets (as xml) the "unit" element
     */
    ocpp.UnitOfMeasure xgetUnit();
    
    /**
     * True if has "unit" element
     */
    boolean isSetUnit();
    
    /**
     * Sets the "unit" element
     */
    void setUnit(ocpp.UnitOfMeasure.Enum unit);
    
    /**
     * Sets (as xml) the "unit" element
     */
    void xsetUnit(ocpp.UnitOfMeasure unit);
    
    /**
     * Unsets the "unit" element
     */
    void unsetUnit();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.SampledValue newInstance() {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.SampledValue newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.SampledValue parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.SampledValue parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.SampledValue parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.SampledValue parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.SampledValue parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.SampledValue parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.SampledValue parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.SampledValue parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.SampledValue parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.SampledValue parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.SampledValue parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.SampledValue parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.SampledValue parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.SampledValue parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.SampledValue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.SampledValue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.SampledValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
