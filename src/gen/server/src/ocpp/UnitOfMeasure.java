/*
 * XML Type:  UnitOfMeasure
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.UnitOfMeasure
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML UnitOfMeasure(@urn://Ocpp/Cs/2015/10/).
 *
 * This is an atomic type that is a restriction of ocpp.UnitOfMeasure.
 */
public interface UnitOfMeasure extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnitOfMeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("unitofmeasure7e56type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CELSIUS = Enum.forString("Celsius");
    static final Enum FAHRENHEIT = Enum.forString("Fahrenheit");
    static final Enum WH = Enum.forString("Wh");
    static final Enum K_WH = Enum.forString("kWh");
    static final Enum VARH = Enum.forString("varh");
    static final Enum KVARH = Enum.forString("kvarh");
    static final Enum W = Enum.forString("W");
    static final Enum K_W = Enum.forString("kW");
    static final Enum VA = Enum.forString("VA");
    static final Enum K_VA = Enum.forString("kVA");
    static final Enum VAR = Enum.forString("var");
    static final Enum KVAR = Enum.forString("kvar");
    static final Enum A = Enum.forString("A");
    static final Enum V = Enum.forString("V");
    static final Enum K = Enum.forString("K");
    static final Enum PERCENT = Enum.forString("Percent");
    
    static final int INT_CELSIUS = Enum.INT_CELSIUS;
    static final int INT_FAHRENHEIT = Enum.INT_FAHRENHEIT;
    static final int INT_WH = Enum.INT_WH;
    static final int INT_K_WH = Enum.INT_K_WH;
    static final int INT_VARH = Enum.INT_VARH;
    static final int INT_KVARH = Enum.INT_KVARH;
    static final int INT_W = Enum.INT_W;
    static final int INT_K_W = Enum.INT_K_W;
    static final int INT_VA = Enum.INT_VA;
    static final int INT_K_VA = Enum.INT_K_VA;
    static final int INT_VAR = Enum.INT_VAR;
    static final int INT_KVAR = Enum.INT_KVAR;
    static final int INT_A = Enum.INT_A;
    static final int INT_V = Enum.INT_V;
    static final int INT_K = Enum.INT_K;
    static final int INT_PERCENT = Enum.INT_PERCENT;
    
    /**
     * Enumeration value class for ocpp.UnitOfMeasure.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CELSIUS
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
        
        static final int INT_CELSIUS = 1;
        static final int INT_FAHRENHEIT = 2;
        static final int INT_WH = 3;
        static final int INT_K_WH = 4;
        static final int INT_VARH = 5;
        static final int INT_KVARH = 6;
        static final int INT_W = 7;
        static final int INT_K_W = 8;
        static final int INT_VA = 9;
        static final int INT_K_VA = 10;
        static final int INT_VAR = 11;
        static final int INT_KVAR = 12;
        static final int INT_A = 13;
        static final int INT_V = 14;
        static final int INT_K = 15;
        static final int INT_PERCENT = 16;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Celsius", INT_CELSIUS),
                new Enum("Fahrenheit", INT_FAHRENHEIT),
                new Enum("Wh", INT_WH),
                new Enum("kWh", INT_K_WH),
                new Enum("varh", INT_VARH),
                new Enum("kvarh", INT_KVARH),
                new Enum("W", INT_W),
                new Enum("kW", INT_K_W),
                new Enum("VA", INT_VA),
                new Enum("kVA", INT_K_VA),
                new Enum("var", INT_VAR),
                new Enum("kvar", INT_KVAR),
                new Enum("A", INT_A),
                new Enum("V", INT_V),
                new Enum("K", INT_K),
                new Enum("Percent", INT_PERCENT),
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
        public static ocpp.UnitOfMeasure newValue(java.lang.Object obj) {
          return (ocpp.UnitOfMeasure) type.newValue( obj ); }
        
        public static ocpp.UnitOfMeasure newInstance() {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.UnitOfMeasure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.UnitOfMeasure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.UnitOfMeasure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.UnitOfMeasure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.UnitOfMeasure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.UnitOfMeasure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.UnitOfMeasure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.UnitOfMeasure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.UnitOfMeasure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.UnitOfMeasure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.UnitOfMeasure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.UnitOfMeasure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.UnitOfMeasure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.UnitOfMeasure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.UnitOfMeasure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.UnitOfMeasure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.UnitOfMeasure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.UnitOfMeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
