/*
 * XML Type:  Measurand
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.Measurand
 *
 * Automatically generated - do not modify.
 */
package ocpp;


/**
 * An XML Measurand(@urn://Ocpp/Cs/2015/10/).
 *
 * This is an atomic type that is a restriction of ocpp.Measurand.
 */
public interface Measurand extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC808782C0FA16CDFA1D9835CB82DAB4").resolveHandle("measurandfe09type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CURRENT_EXPORT = Enum.forString("Current.Export");
    static final Enum CURRENT_IMPORT = Enum.forString("Current.Import");
    static final Enum CURRENT_OFFERED = Enum.forString("Current.Offered");
    static final Enum ENERGY_ACTIVE_EXPORT_REGISTER = Enum.forString("Energy.Active.Export.Register");
    static final Enum ENERGY_ACTIVE_IMPORT_REGISTER = Enum.forString("Energy.Active.Import.Register");
    static final Enum ENERGY_REACTIVE_EXPORT_REGISTER = Enum.forString("Energy.Reactive.Export.Register");
    static final Enum ENERGY_REACTIVE_IMPORT_REGISTER = Enum.forString("Energy.Reactive.Import.Register");
    static final Enum ENERGY_ACTIVE_EXPORT_INTERVAL = Enum.forString("Energy.Active.Export.Interval");
    static final Enum ENERGY_ACTIVE_IMPORT_INTERVAL = Enum.forString("Energy.Active.Import.Interval");
    static final Enum ENERGY_REACTIVE_EXPORT_INTERVAL = Enum.forString("Energy.Reactive.Export.Interval");
    static final Enum ENERGY_REACTIVE_IMPORT_INTERVAL = Enum.forString("Energy.Reactive.Import.Interval");
    static final Enum FREQUENCY = Enum.forString("Frequency");
    static final Enum POWER_ACTIVE_EXPORT = Enum.forString("Power.Active.Export");
    static final Enum POWER_ACTIVE_IMPORT = Enum.forString("Power.Active.Import");
    static final Enum POWER_FACTOR = Enum.forString("Power.Factor");
    static final Enum POWER_OFFERED = Enum.forString("Power.Offered");
    static final Enum POWER_REACTIVE_EXPORT = Enum.forString("Power.Reactive.Export");
    static final Enum POWER_REACTIVE_IMPORT = Enum.forString("Power.Reactive.Import");
    static final Enum RPM = Enum.forString("RPM");
    static final Enum SO_C = Enum.forString("SoC");
    static final Enum TEMPERATURE = Enum.forString("Temperature");
    static final Enum VOLTAGE = Enum.forString("Voltage");
    
    static final int INT_CURRENT_EXPORT = Enum.INT_CURRENT_EXPORT;
    static final int INT_CURRENT_IMPORT = Enum.INT_CURRENT_IMPORT;
    static final int INT_CURRENT_OFFERED = Enum.INT_CURRENT_OFFERED;
    static final int INT_ENERGY_ACTIVE_EXPORT_REGISTER = Enum.INT_ENERGY_ACTIVE_EXPORT_REGISTER;
    static final int INT_ENERGY_ACTIVE_IMPORT_REGISTER = Enum.INT_ENERGY_ACTIVE_IMPORT_REGISTER;
    static final int INT_ENERGY_REACTIVE_EXPORT_REGISTER = Enum.INT_ENERGY_REACTIVE_EXPORT_REGISTER;
    static final int INT_ENERGY_REACTIVE_IMPORT_REGISTER = Enum.INT_ENERGY_REACTIVE_IMPORT_REGISTER;
    static final int INT_ENERGY_ACTIVE_EXPORT_INTERVAL = Enum.INT_ENERGY_ACTIVE_EXPORT_INTERVAL;
    static final int INT_ENERGY_ACTIVE_IMPORT_INTERVAL = Enum.INT_ENERGY_ACTIVE_IMPORT_INTERVAL;
    static final int INT_ENERGY_REACTIVE_EXPORT_INTERVAL = Enum.INT_ENERGY_REACTIVE_EXPORT_INTERVAL;
    static final int INT_ENERGY_REACTIVE_IMPORT_INTERVAL = Enum.INT_ENERGY_REACTIVE_IMPORT_INTERVAL;
    static final int INT_FREQUENCY = Enum.INT_FREQUENCY;
    static final int INT_POWER_ACTIVE_EXPORT = Enum.INT_POWER_ACTIVE_EXPORT;
    static final int INT_POWER_ACTIVE_IMPORT = Enum.INT_POWER_ACTIVE_IMPORT;
    static final int INT_POWER_FACTOR = Enum.INT_POWER_FACTOR;
    static final int INT_POWER_OFFERED = Enum.INT_POWER_OFFERED;
    static final int INT_POWER_REACTIVE_EXPORT = Enum.INT_POWER_REACTIVE_EXPORT;
    static final int INT_POWER_REACTIVE_IMPORT = Enum.INT_POWER_REACTIVE_IMPORT;
    static final int INT_RPM = Enum.INT_RPM;
    static final int INT_SO_C = Enum.INT_SO_C;
    static final int INT_TEMPERATURE = Enum.INT_TEMPERATURE;
    static final int INT_VOLTAGE = Enum.INT_VOLTAGE;
    
    /**
     * Enumeration value class for ocpp.Measurand.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CURRENT_EXPORT
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
        
        static final int INT_CURRENT_EXPORT = 1;
        static final int INT_CURRENT_IMPORT = 2;
        static final int INT_CURRENT_OFFERED = 3;
        static final int INT_ENERGY_ACTIVE_EXPORT_REGISTER = 4;
        static final int INT_ENERGY_ACTIVE_IMPORT_REGISTER = 5;
        static final int INT_ENERGY_REACTIVE_EXPORT_REGISTER = 6;
        static final int INT_ENERGY_REACTIVE_IMPORT_REGISTER = 7;
        static final int INT_ENERGY_ACTIVE_EXPORT_INTERVAL = 8;
        static final int INT_ENERGY_ACTIVE_IMPORT_INTERVAL = 9;
        static final int INT_ENERGY_REACTIVE_EXPORT_INTERVAL = 10;
        static final int INT_ENERGY_REACTIVE_IMPORT_INTERVAL = 11;
        static final int INT_FREQUENCY = 12;
        static final int INT_POWER_ACTIVE_EXPORT = 13;
        static final int INT_POWER_ACTIVE_IMPORT = 14;
        static final int INT_POWER_FACTOR = 15;
        static final int INT_POWER_OFFERED = 16;
        static final int INT_POWER_REACTIVE_EXPORT = 17;
        static final int INT_POWER_REACTIVE_IMPORT = 18;
        static final int INT_RPM = 19;
        static final int INT_SO_C = 20;
        static final int INT_TEMPERATURE = 21;
        static final int INT_VOLTAGE = 22;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Current.Export", INT_CURRENT_EXPORT),
                new Enum("Current.Import", INT_CURRENT_IMPORT),
                new Enum("Current.Offered", INT_CURRENT_OFFERED),
                new Enum("Energy.Active.Export.Register", INT_ENERGY_ACTIVE_EXPORT_REGISTER),
                new Enum("Energy.Active.Import.Register", INT_ENERGY_ACTIVE_IMPORT_REGISTER),
                new Enum("Energy.Reactive.Export.Register", INT_ENERGY_REACTIVE_EXPORT_REGISTER),
                new Enum("Energy.Reactive.Import.Register", INT_ENERGY_REACTIVE_IMPORT_REGISTER),
                new Enum("Energy.Active.Export.Interval", INT_ENERGY_ACTIVE_EXPORT_INTERVAL),
                new Enum("Energy.Active.Import.Interval", INT_ENERGY_ACTIVE_IMPORT_INTERVAL),
                new Enum("Energy.Reactive.Export.Interval", INT_ENERGY_REACTIVE_EXPORT_INTERVAL),
                new Enum("Energy.Reactive.Import.Interval", INT_ENERGY_REACTIVE_IMPORT_INTERVAL),
                new Enum("Frequency", INT_FREQUENCY),
                new Enum("Power.Active.Export", INT_POWER_ACTIVE_EXPORT),
                new Enum("Power.Active.Import", INT_POWER_ACTIVE_IMPORT),
                new Enum("Power.Factor", INT_POWER_FACTOR),
                new Enum("Power.Offered", INT_POWER_OFFERED),
                new Enum("Power.Reactive.Export", INT_POWER_REACTIVE_EXPORT),
                new Enum("Power.Reactive.Import", INT_POWER_REACTIVE_IMPORT),
                new Enum("RPM", INT_RPM),
                new Enum("SoC", INT_SO_C),
                new Enum("Temperature", INT_TEMPERATURE),
                new Enum("Voltage", INT_VOLTAGE),
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
        public static ocpp.Measurand newValue(java.lang.Object obj) {
          return (ocpp.Measurand) type.newValue( obj ); }
        
        public static ocpp.Measurand newInstance() {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ocpp.Measurand newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ocpp.Measurand parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ocpp.Measurand parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ocpp.Measurand parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ocpp.Measurand parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ocpp.Measurand parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ocpp.Measurand parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ocpp.Measurand parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ocpp.Measurand parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ocpp.Measurand parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ocpp.Measurand parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ocpp.Measurand parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ocpp.Measurand parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ocpp.Measurand parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ocpp.Measurand parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.Measurand parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ocpp.Measurand parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ocpp.Measurand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
