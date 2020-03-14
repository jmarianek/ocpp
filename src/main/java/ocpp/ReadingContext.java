/*
 * XML Type:  ReadingContext
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.ReadingContext
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML ReadingContext(@urn://Ocpp/Cs/2015/10/).
 *
 * This is an atomic type that is a restriction of ocpp.ReadingContext.
 */
public interface ReadingContext extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReadingContext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("readingcontextf044type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INTERRUPTION_BEGIN = Enum.forString("Interruption.Begin");
    static final Enum INTERRUPTION_END = Enum.forString("Interruption.End");
    static final Enum OTHER = Enum.forString("Other");
    static final Enum SAMPLE_CLOCK = Enum.forString("Sample.Clock");
    static final Enum SAMPLE_PERIODIC = Enum.forString("Sample.Periodic");
    static final Enum TRANSACTION_BEGIN = Enum.forString("Transaction.Begin");
    static final Enum TRANSACTION_END = Enum.forString("Transaction.End");
    static final Enum TRIGGER = Enum.forString("Trigger");
    
    static final int INT_INTERRUPTION_BEGIN = Enum.INT_INTERRUPTION_BEGIN;
    static final int INT_INTERRUPTION_END = Enum.INT_INTERRUPTION_END;
    static final int INT_OTHER = Enum.INT_OTHER;
    static final int INT_SAMPLE_CLOCK = Enum.INT_SAMPLE_CLOCK;
    static final int INT_SAMPLE_PERIODIC = Enum.INT_SAMPLE_PERIODIC;
    static final int INT_TRANSACTION_BEGIN = Enum.INT_TRANSACTION_BEGIN;
    static final int INT_TRANSACTION_END = Enum.INT_TRANSACTION_END;
    static final int INT_TRIGGER = Enum.INT_TRIGGER;
    
    /**
     * Enumeration value class for ocpp.ReadingContext.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INTERRUPTION_BEGIN
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
        
        static final int INT_INTERRUPTION_BEGIN = 1;
        static final int INT_INTERRUPTION_END = 2;
        static final int INT_OTHER = 3;
        static final int INT_SAMPLE_CLOCK = 4;
        static final int INT_SAMPLE_PERIODIC = 5;
        static final int INT_TRANSACTION_BEGIN = 6;
        static final int INT_TRANSACTION_END = 7;
        static final int INT_TRIGGER = 8;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Interruption.Begin", INT_INTERRUPTION_BEGIN),
                new Enum("Interruption.End", INT_INTERRUPTION_END),
                new Enum("Other", INT_OTHER),
                new Enum("Sample.Clock", INT_SAMPLE_CLOCK),
                new Enum("Sample.Periodic", INT_SAMPLE_PERIODIC),
                new Enum("Transaction.Begin", INT_TRANSACTION_BEGIN),
                new Enum("Transaction.End", INT_TRANSACTION_END),
                new Enum("Trigger", INT_TRIGGER),
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
        public static ocpp.ReadingContext newValue(java.lang.Object obj) {
          return (ocpp.ReadingContext) type.newValue( obj ); }
        
        public static ocpp.ReadingContext newInstance() {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.ReadingContext newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.ReadingContext parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.ReadingContext parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.ReadingContext parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.ReadingContext parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.ReadingContext parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.ReadingContext parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.ReadingContext parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.ReadingContext parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.ReadingContext parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.ReadingContext parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.ReadingContext parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.ReadingContext parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.ReadingContext parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.ReadingContext parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.ReadingContext parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.ReadingContext parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.ReadingContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
