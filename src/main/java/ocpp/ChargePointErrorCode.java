/*
 * XML Type:  ChargePointErrorCode
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.ChargePointErrorCode
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML ChargePointErrorCode(@urn://Ocpp/Cs/2015/10/).
 *
 * This is an atomic type that is a restriction of ocpp.ChargePointErrorCode.
 */
public interface ChargePointErrorCode extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChargePointErrorCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("chargepointerrorcodebf8etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CONNECTOR_LOCK_FAILURE = Enum.forString("ConnectorLockFailure");
    static final Enum EV_COMMUNICATION_ERROR = Enum.forString("EVCommunicationError");
    static final Enum GROUND_FAILURE = Enum.forString("GroundFailure");
    static final Enum HIGH_TEMPERATURE = Enum.forString("HighTemperature");
    static final Enum INTERNAL_ERROR = Enum.forString("InternalError");
    static final Enum LOCAL_LIST_CONFLICT = Enum.forString("LocalListConflict");
    static final Enum NO_ERROR = Enum.forString("NoError");
    static final Enum OTHER_ERROR = Enum.forString("OtherError");
    static final Enum OVER_CURRENT_FAILURE = Enum.forString("OverCurrentFailure");
    static final Enum OVER_VOLTAGE = Enum.forString("OverVoltage");
    static final Enum POWER_METER_FAILURE = Enum.forString("PowerMeterFailure");
    static final Enum POWER_SWITCH_FAILURE = Enum.forString("PowerSwitchFailure");
    static final Enum READER_FAILURE = Enum.forString("ReaderFailure");
    static final Enum RESET_FAILURE = Enum.forString("ResetFailure");
    static final Enum UNDER_VOLTAGE = Enum.forString("UnderVoltage");
    static final Enum WEAK_SIGNAL = Enum.forString("WeakSignal");
    
    static final int INT_CONNECTOR_LOCK_FAILURE = Enum.INT_CONNECTOR_LOCK_FAILURE;
    static final int INT_EV_COMMUNICATION_ERROR = Enum.INT_EV_COMMUNICATION_ERROR;
    static final int INT_GROUND_FAILURE = Enum.INT_GROUND_FAILURE;
    static final int INT_HIGH_TEMPERATURE = Enum.INT_HIGH_TEMPERATURE;
    static final int INT_INTERNAL_ERROR = Enum.INT_INTERNAL_ERROR;
    static final int INT_LOCAL_LIST_CONFLICT = Enum.INT_LOCAL_LIST_CONFLICT;
    static final int INT_NO_ERROR = Enum.INT_NO_ERROR;
    static final int INT_OTHER_ERROR = Enum.INT_OTHER_ERROR;
    static final int INT_OVER_CURRENT_FAILURE = Enum.INT_OVER_CURRENT_FAILURE;
    static final int INT_OVER_VOLTAGE = Enum.INT_OVER_VOLTAGE;
    static final int INT_POWER_METER_FAILURE = Enum.INT_POWER_METER_FAILURE;
    static final int INT_POWER_SWITCH_FAILURE = Enum.INT_POWER_SWITCH_FAILURE;
    static final int INT_READER_FAILURE = Enum.INT_READER_FAILURE;
    static final int INT_RESET_FAILURE = Enum.INT_RESET_FAILURE;
    static final int INT_UNDER_VOLTAGE = Enum.INT_UNDER_VOLTAGE;
    static final int INT_WEAK_SIGNAL = Enum.INT_WEAK_SIGNAL;
    
    /**
     * Enumeration value class for ocpp.ChargePointErrorCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CONNECTOR_LOCK_FAILURE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_CONNECTOR_LOCK_FAILURE = 1;
        static final int INT_EV_COMMUNICATION_ERROR = 2;
        static final int INT_GROUND_FAILURE = 3;
        static final int INT_HIGH_TEMPERATURE = 4;
        static final int INT_INTERNAL_ERROR = 5;
        static final int INT_LOCAL_LIST_CONFLICT = 6;
        static final int INT_NO_ERROR = 7;
        static final int INT_OTHER_ERROR = 8;
        static final int INT_OVER_CURRENT_FAILURE = 9;
        static final int INT_OVER_VOLTAGE = 10;
        static final int INT_POWER_METER_FAILURE = 11;
        static final int INT_POWER_SWITCH_FAILURE = 12;
        static final int INT_READER_FAILURE = 13;
        static final int INT_RESET_FAILURE = 14;
        static final int INT_UNDER_VOLTAGE = 15;
        static final int INT_WEAK_SIGNAL = 16;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ConnectorLockFailure", INT_CONNECTOR_LOCK_FAILURE),
                new Enum("EVCommunicationError", INT_EV_COMMUNICATION_ERROR),
                new Enum("GroundFailure", INT_GROUND_FAILURE),
                new Enum("HighTemperature", INT_HIGH_TEMPERATURE),
                new Enum("InternalError", INT_INTERNAL_ERROR),
                new Enum("LocalListConflict", INT_LOCAL_LIST_CONFLICT),
                new Enum("NoError", INT_NO_ERROR),
                new Enum("OtherError", INT_OTHER_ERROR),
                new Enum("OverCurrentFailure", INT_OVER_CURRENT_FAILURE),
                new Enum("OverVoltage", INT_OVER_VOLTAGE),
                new Enum("PowerMeterFailure", INT_POWER_METER_FAILURE),
                new Enum("PowerSwitchFailure", INT_POWER_SWITCH_FAILURE),
                new Enum("ReaderFailure", INT_READER_FAILURE),
                new Enum("ResetFailure", INT_RESET_FAILURE),
                new Enum("UnderVoltage", INT_UNDER_VOLTAGE),
                new Enum("WeakSignal", INT_WEAK_SIGNAL),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ocpp.ChargePointErrorCode newValue(java.lang.Object obj) {
          return (ocpp.ChargePointErrorCode) type.newValue( obj ); }
        
        public static ocpp.ChargePointErrorCode newInstance() {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.ChargePointErrorCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.ChargePointErrorCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.ChargePointErrorCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.ChargePointErrorCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.ChargePointErrorCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.ChargePointErrorCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.ChargePointErrorCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.ChargePointErrorCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.ChargePointErrorCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.ChargePointErrorCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.ChargePointErrorCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.ChargePointErrorCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.ChargePointErrorCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.ChargePointErrorCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.ChargePointErrorCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.ChargePointErrorCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.ChargePointErrorCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.ChargePointErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
