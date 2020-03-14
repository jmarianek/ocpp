/*
 * XML Type:  SampledValue
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.SampledValue
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML SampledValue(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class SampledValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.SampledValue
{
    
    public SampledValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "value");
    private static final javax.xml.namespace.QName CONTEXT$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "context");
    private static final javax.xml.namespace.QName FORMAT$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "format");
    private static final javax.xml.namespace.QName MEASURAND$6 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "measurand");
    private static final javax.xml.namespace.QName PHASE$8 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "phase");
    private static final javax.xml.namespace.QName LOCATION$10 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "location");
    private static final javax.xml.namespace.QName UNIT$12 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "unit");
    
    
    /**
     * Gets the "value" element
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" element
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$0);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "context" element
     */
    public ocpp.ReadingContext.Enum getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.ReadingContext.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "context" element
     */
    public ocpp.ReadingContext xgetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.ReadingContext target = null;
            target = (ocpp.ReadingContext)get_store().find_element_user(CONTEXT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "context" element
     */
    public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "context" element
     */
    public void setContext(ocpp.ReadingContext.Enum context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEXT$2);
            }
            target.setEnumValue(context);
        }
    }
    
    /**
     * Sets (as xml) the "context" element
     */
    public void xsetContext(ocpp.ReadingContext context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.ReadingContext target = null;
            target = (ocpp.ReadingContext)get_store().find_element_user(CONTEXT$2, 0);
            if (target == null)
            {
                target = (ocpp.ReadingContext)get_store().add_element_user(CONTEXT$2);
            }
            target.set(context);
        }
    }
    
    /**
     * Unsets the "context" element
     */
    public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$2, 0);
        }
    }
    
    /**
     * Gets the "format" element
     */
    public ocpp.ValueFormat.Enum getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$4, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.ValueFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "format" element
     */
    public ocpp.ValueFormat xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.ValueFormat target = null;
            target = (ocpp.ValueFormat)get_store().find_element_user(FORMAT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "format" element
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$4) != 0;
        }
    }
    
    /**
     * Sets the "format" element
     */
    public void setFormat(ocpp.ValueFormat.Enum format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$4);
            }
            target.setEnumValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "format" element
     */
    public void xsetFormat(ocpp.ValueFormat format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.ValueFormat target = null;
            target = (ocpp.ValueFormat)get_store().find_element_user(FORMAT$4, 0);
            if (target == null)
            {
                target = (ocpp.ValueFormat)get_store().add_element_user(FORMAT$4);
            }
            target.set(format);
        }
    }
    
    /**
     * Unsets the "format" element
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$4, 0);
        }
    }
    
    /**
     * Gets the "measurand" element
     */
    public ocpp.Measurand.Enum getMeasurand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASURAND$6, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.Measurand.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "measurand" element
     */
    public ocpp.Measurand xgetMeasurand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.Measurand target = null;
            target = (ocpp.Measurand)get_store().find_element_user(MEASURAND$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "measurand" element
     */
    public boolean isSetMeasurand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASURAND$6) != 0;
        }
    }
    
    /**
     * Sets the "measurand" element
     */
    public void setMeasurand(ocpp.Measurand.Enum measurand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASURAND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEASURAND$6);
            }
            target.setEnumValue(measurand);
        }
    }
    
    /**
     * Sets (as xml) the "measurand" element
     */
    public void xsetMeasurand(ocpp.Measurand measurand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.Measurand target = null;
            target = (ocpp.Measurand)get_store().find_element_user(MEASURAND$6, 0);
            if (target == null)
            {
                target = (ocpp.Measurand)get_store().add_element_user(MEASURAND$6);
            }
            target.set(measurand);
        }
    }
    
    /**
     * Unsets the "measurand" element
     */
    public void unsetMeasurand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASURAND$6, 0);
        }
    }
    
    /**
     * Gets the "phase" element
     */
    public ocpp.Phase.Enum getPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHASE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.Phase.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "phase" element
     */
    public ocpp.Phase xgetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.Phase target = null;
            target = (ocpp.Phase)get_store().find_element_user(PHASE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "phase" element
     */
    public boolean isSetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHASE$8) != 0;
        }
    }
    
    /**
     * Sets the "phase" element
     */
    public void setPhase(ocpp.Phase.Enum phase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHASE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHASE$8);
            }
            target.setEnumValue(phase);
        }
    }
    
    /**
     * Sets (as xml) the "phase" element
     */
    public void xsetPhase(ocpp.Phase phase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.Phase target = null;
            target = (ocpp.Phase)get_store().find_element_user(PHASE$8, 0);
            if (target == null)
            {
                target = (ocpp.Phase)get_store().add_element_user(PHASE$8);
            }
            target.set(phase);
        }
    }
    
    /**
     * Unsets the "phase" element
     */
    public void unsetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHASE$8, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public ocpp.Location.Enum getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.Location.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "location" element
     */
    public ocpp.Location xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.Location target = null;
            target = (ocpp.Location)get_store().find_element_user(LOCATION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$10) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(ocpp.Location.Enum location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$10);
            }
            target.setEnumValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "location" element
     */
    public void xsetLocation(ocpp.Location location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.Location target = null;
            target = (ocpp.Location)get_store().find_element_user(LOCATION$10, 0);
            if (target == null)
            {
                target = (ocpp.Location)get_store().add_element_user(LOCATION$10);
            }
            target.set(location);
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$10, 0);
        }
    }
    
    /**
     * Gets the "unit" element
     */
    public ocpp.UnitOfMeasure.Enum getUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$12, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.UnitOfMeasure.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "unit" element
     */
    public ocpp.UnitOfMeasure xgetUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.UnitOfMeasure target = null;
            target = (ocpp.UnitOfMeasure)get_store().find_element_user(UNIT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "unit" element
     */
    public boolean isSetUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIT$12) != 0;
        }
    }
    
    /**
     * Sets the "unit" element
     */
    public void setUnit(ocpp.UnitOfMeasure.Enum unit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIT$12);
            }
            target.setEnumValue(unit);
        }
    }
    
    /**
     * Sets (as xml) the "unit" element
     */
    public void xsetUnit(ocpp.UnitOfMeasure unit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.UnitOfMeasure target = null;
            target = (ocpp.UnitOfMeasure)get_store().find_element_user(UNIT$12, 0);
            if (target == null)
            {
                target = (ocpp.UnitOfMeasure)get_store().add_element_user(UNIT$12);
            }
            target.set(unit);
        }
    }
    
    /**
     * Unsets the "unit" element
     */
    public void unsetUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIT$12, 0);
        }
    }
}
