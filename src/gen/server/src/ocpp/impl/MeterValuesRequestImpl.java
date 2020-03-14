/*
 * XML Type:  MeterValuesRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.MeterValuesRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML MeterValuesRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class MeterValuesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.MeterValuesRequest
{
    
    public MeterValuesRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTORID$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "connectorId");
    private static final javax.xml.namespace.QName TRANSACTIONID$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "transactionId");
    private static final javax.xml.namespace.QName METERVALUE$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "meterValue");
    
    
    /**
     * Gets the "connectorId" element
     */
    public int getConnectorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTORID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectorId" element
     */
    public org.apache.xmlbeans.XmlInt xgetConnectorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONNECTORID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "connectorId" element
     */
    public void setConnectorId(int connectorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONNECTORID$0);
            }
            target.setIntValue(connectorId);
        }
    }
    
    /**
     * Sets (as xml) the "connectorId" element
     */
    public void xsetConnectorId(org.apache.xmlbeans.XmlInt connectorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONNECTORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CONNECTORID$0);
            }
            target.set(connectorId);
        }
    }
    
    /**
     * Gets the "transactionId" element
     */
    public int getTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "transactionId" element
     */
    public org.apache.xmlbeans.XmlInt xgetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "transactionId" element
     */
    public boolean isSetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONID$2) != 0;
        }
    }
    
    /**
     * Sets the "transactionId" element
     */
    public void setTransactionId(int transactionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$2);
            }
            target.setIntValue(transactionId);
        }
    }
    
    /**
     * Sets (as xml) the "transactionId" element
     */
    public void xsetTransactionId(org.apache.xmlbeans.XmlInt transactionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TRANSACTIONID$2);
            }
            target.set(transactionId);
        }
    }
    
    /**
     * Unsets the "transactionId" element
     */
    public void unsetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONID$2, 0);
        }
    }
    
    /**
     * Gets array of all "meterValue" elements
     */
    public ocpp.MeterValue[] getMeterValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METERVALUE$4, targetList);
            ocpp.MeterValue[] result = new ocpp.MeterValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "meterValue" element
     */
    public ocpp.MeterValue getMeterValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValue target = null;
            target = (ocpp.MeterValue)get_store().find_element_user(METERVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "meterValue" element
     */
    public int sizeOfMeterValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METERVALUE$4);
        }
    }
    
    /**
     * Sets array of all "meterValue" element
     */
    public void setMeterValueArray(ocpp.MeterValue[] meterValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(meterValueArray, METERVALUE$4);
        }
    }
    
    /**
     * Sets ith "meterValue" element
     */
    public void setMeterValueArray(int i, ocpp.MeterValue meterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValue target = null;
            target = (ocpp.MeterValue)get_store().find_element_user(METERVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(meterValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "meterValue" element
     */
    public ocpp.MeterValue insertNewMeterValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValue target = null;
            target = (ocpp.MeterValue)get_store().insert_element_user(METERVALUE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "meterValue" element
     */
    public ocpp.MeterValue addNewMeterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValue target = null;
            target = (ocpp.MeterValue)get_store().add_element_user(METERVALUE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "meterValue" element
     */
    public void removeMeterValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METERVALUE$4, i);
        }
    }
}
