/*
 * XML Type:  MeterValue
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.MeterValue
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML MeterValue(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class MeterValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.MeterValue
{
    
    public MeterValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESTAMP$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "timestamp");
    private static final javax.xml.namespace.QName SAMPLEDVALUE$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "sampledValue");
    
    
    /**
     * Gets the "timestamp" element
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "timestamp" element
     */
    public void setTimestamp(java.util.Calendar timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$0);
            }
            target.setCalendarValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "timestamp" element
     */
    public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$0);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Gets array of all "sampledValue" elements
     */
    public ocpp.SampledValue[] getSampledValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SAMPLEDVALUE$2, targetList);
            ocpp.SampledValue[] result = new ocpp.SampledValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sampledValue" element
     */
    public ocpp.SampledValue getSampledValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.SampledValue target = null;
            target = (ocpp.SampledValue)get_store().find_element_user(SAMPLEDVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sampledValue" element
     */
    public int sizeOfSampledValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMPLEDVALUE$2);
        }
    }
    
    /**
     * Sets array of all "sampledValue" element
     */
    public void setSampledValueArray(ocpp.SampledValue[] sampledValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sampledValueArray, SAMPLEDVALUE$2);
        }
    }
    
    /**
     * Sets ith "sampledValue" element
     */
    public void setSampledValueArray(int i, ocpp.SampledValue sampledValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.SampledValue target = null;
            target = (ocpp.SampledValue)get_store().find_element_user(SAMPLEDVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sampledValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sampledValue" element
     */
    public ocpp.SampledValue insertNewSampledValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.SampledValue target = null;
            target = (ocpp.SampledValue)get_store().insert_element_user(SAMPLEDVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sampledValue" element
     */
    public ocpp.SampledValue addNewSampledValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.SampledValue target = null;
            target = (ocpp.SampledValue)get_store().add_element_user(SAMPLEDVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "sampledValue" element
     */
    public void removeSampledValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMPLEDVALUE$2, i);
        }
    }
}
