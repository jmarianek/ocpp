/*
 * XML Type:  Reason
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.Reason
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML Reason(@urn://Ocpp/Cs/2015/10/).
 *
 * This is an atomic type that is a restriction of ocpp.Reason.
 */
public interface Reason extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reason.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("reasone563type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum EMERGENCY_STOP = Enum.forString("EmergencyStop");
    static final Enum EV_DISCONNECTED = Enum.forString("EVDisconnected");
    static final Enum HARD_RESET = Enum.forString("HardReset");
    static final Enum LOCAL = Enum.forString("Local");
    static final Enum OTHER = Enum.forString("Other");
    static final Enum POWER_LOSS = Enum.forString("PowerLoss");
    static final Enum REBOOT = Enum.forString("Reboot");
    static final Enum REMOTE = Enum.forString("Remote");
    static final Enum SOFT_RESET = Enum.forString("SoftReset");
    static final Enum UNLOCK_COMMAND = Enum.forString("UnlockCommand");
    static final Enum DE_AUTHORIZED = Enum.forString("DeAuthorized");
    
    static final int INT_EMERGENCY_STOP = Enum.INT_EMERGENCY_STOP;
    static final int INT_EV_DISCONNECTED = Enum.INT_EV_DISCONNECTED;
    static final int INT_HARD_RESET = Enum.INT_HARD_RESET;
    static final int INT_LOCAL = Enum.INT_LOCAL;
    static final int INT_OTHER = Enum.INT_OTHER;
    static final int INT_POWER_LOSS = Enum.INT_POWER_LOSS;
    static final int INT_REBOOT = Enum.INT_REBOOT;
    static final int INT_REMOTE = Enum.INT_REMOTE;
    static final int INT_SOFT_RESET = Enum.INT_SOFT_RESET;
    static final int INT_UNLOCK_COMMAND = Enum.INT_UNLOCK_COMMAND;
    static final int INT_DE_AUTHORIZED = Enum.INT_DE_AUTHORIZED;
    
    /**
     * Enumeration value class for ocpp.Reason.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EMERGENCY_STOP
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
        
        static final int INT_EMERGENCY_STOP = 1;
        static final int INT_EV_DISCONNECTED = 2;
        static final int INT_HARD_RESET = 3;
        static final int INT_LOCAL = 4;
        static final int INT_OTHER = 5;
        static final int INT_POWER_LOSS = 6;
        static final int INT_REBOOT = 7;
        static final int INT_REMOTE = 8;
        static final int INT_SOFT_RESET = 9;
        static final int INT_UNLOCK_COMMAND = 10;
        static final int INT_DE_AUTHORIZED = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("EmergencyStop", INT_EMERGENCY_STOP),
                new Enum("EVDisconnected", INT_EV_DISCONNECTED),
                new Enum("HardReset", INT_HARD_RESET),
                new Enum("Local", INT_LOCAL),
                new Enum("Other", INT_OTHER),
                new Enum("PowerLoss", INT_POWER_LOSS),
                new Enum("Reboot", INT_REBOOT),
                new Enum("Remote", INT_REMOTE),
                new Enum("SoftReset", INT_SOFT_RESET),
                new Enum("UnlockCommand", INT_UNLOCK_COMMAND),
                new Enum("DeAuthorized", INT_DE_AUTHORIZED),
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
        public static ocpp.Reason newValue(java.lang.Object obj) {
          return (ocpp.Reason) type.newValue( obj ); }
        
        public static ocpp.Reason newInstance() {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.Reason newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.Reason parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.Reason parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.Reason parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.Reason parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.Reason parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.Reason parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.Reason parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.Reason parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.Reason parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.Reason parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.Reason parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.Reason parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.Reason parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.Reason parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.Reason parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.Reason parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
