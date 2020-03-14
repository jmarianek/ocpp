/*
 * XML Type:  ChargePointStatus
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.ChargePointStatus
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML ChargePointStatus(@urn://Ocpp/Cs/2015/10/).
 *
 * This is an atomic type that is a restriction of ocpp.ChargePointStatus.
 */
public interface ChargePointStatus extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChargePointStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("chargepointstatus618btype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AVAILABLE = Enum.forString("Available");
    static final Enum PREPARING = Enum.forString("Preparing");
    static final Enum CHARGING = Enum.forString("Charging");
    static final Enum SUSPENDED_EV = Enum.forString("SuspendedEV");
    static final Enum SUSPENDED_EVSE = Enum.forString("SuspendedEVSE");
    static final Enum FINISHING = Enum.forString("Finishing");
    static final Enum RESERVED = Enum.forString("Reserved");
    static final Enum FAULTED = Enum.forString("Faulted");
    static final Enum UNAVAILABLE = Enum.forString("Unavailable");
    
    static final int INT_AVAILABLE = Enum.INT_AVAILABLE;
    static final int INT_PREPARING = Enum.INT_PREPARING;
    static final int INT_CHARGING = Enum.INT_CHARGING;
    static final int INT_SUSPENDED_EV = Enum.INT_SUSPENDED_EV;
    static final int INT_SUSPENDED_EVSE = Enum.INT_SUSPENDED_EVSE;
    static final int INT_FINISHING = Enum.INT_FINISHING;
    static final int INT_RESERVED = Enum.INT_RESERVED;
    static final int INT_FAULTED = Enum.INT_FAULTED;
    static final int INT_UNAVAILABLE = Enum.INT_UNAVAILABLE;
    
    /**
     * Enumeration value class for ocpp.ChargePointStatus.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AVAILABLE
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
        
        static final int INT_AVAILABLE = 1;
        static final int INT_PREPARING = 2;
        static final int INT_CHARGING = 3;
        static final int INT_SUSPENDED_EV = 4;
        static final int INT_SUSPENDED_EVSE = 5;
        static final int INT_FINISHING = 6;
        static final int INT_RESERVED = 7;
        static final int INT_FAULTED = 8;
        static final int INT_UNAVAILABLE = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Available", INT_AVAILABLE),
                new Enum("Preparing", INT_PREPARING),
                new Enum("Charging", INT_CHARGING),
                new Enum("SuspendedEV", INT_SUSPENDED_EV),
                new Enum("SuspendedEVSE", INT_SUSPENDED_EVSE),
                new Enum("Finishing", INT_FINISHING),
                new Enum("Reserved", INT_RESERVED),
                new Enum("Faulted", INT_FAULTED),
                new Enum("Unavailable", INT_UNAVAILABLE),
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
        public static ocpp.ChargePointStatus newValue(java.lang.Object obj) {
          return (ocpp.ChargePointStatus) type.newValue( obj ); }
        
        public static ocpp.ChargePointStatus newInstance() {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.ChargePointStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.ChargePointStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.ChargePointStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.ChargePointStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.ChargePointStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.ChargePointStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.ChargePointStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.ChargePointStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.ChargePointStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.ChargePointStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.ChargePointStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.ChargePointStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.ChargePointStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.ChargePointStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.ChargePointStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.ChargePointStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.ChargePointStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.ChargePointStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
