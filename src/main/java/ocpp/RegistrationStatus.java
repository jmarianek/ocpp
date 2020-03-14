/*
 * XML Type:  RegistrationStatus
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.RegistrationStatus
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML RegistrationStatus(@urn://Ocpp/Cs/2015/10/).
 *
 * This is an atomic type that is a restriction of ocpp.RegistrationStatus.
 */
public interface RegistrationStatus extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegistrationStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("registrationstatus473ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ACCEPTED = Enum.forString("Accepted");
    static final Enum PENDING = Enum.forString("Pending");
    static final Enum REJECTED = Enum.forString("Rejected");
    
    static final int INT_ACCEPTED = Enum.INT_ACCEPTED;
    static final int INT_PENDING = Enum.INT_PENDING;
    static final int INT_REJECTED = Enum.INT_REJECTED;
    
    /**
     * Enumeration value class for ocpp.RegistrationStatus.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ACCEPTED
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
        
        static final int INT_ACCEPTED = 1;
        static final int INT_PENDING = 2;
        static final int INT_REJECTED = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Accepted", INT_ACCEPTED),
                new Enum("Pending", INT_PENDING),
                new Enum("Rejected", INT_REJECTED),
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
        public static ocpp.RegistrationStatus newValue(java.lang.Object obj) {
          return (ocpp.RegistrationStatus) type.newValue( obj ); }
        
        public static ocpp.RegistrationStatus newInstance() {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.RegistrationStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.RegistrationStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.RegistrationStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.RegistrationStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.RegistrationStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.RegistrationStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.RegistrationStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.RegistrationStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.RegistrationStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.RegistrationStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.RegistrationStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.RegistrationStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.RegistrationStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.RegistrationStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.RegistrationStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.RegistrationStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.RegistrationStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.RegistrationStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
