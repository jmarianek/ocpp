/*
 * XML Type:  StopTransactionRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.StopTransactionRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML StopTransactionRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class StopTransactionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.StopTransactionRequest
{
    
    public StopTransactionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONID$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "transactionId");
    private static final javax.xml.namespace.QName IDTAG$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "idTag");
    private static final javax.xml.namespace.QName TIMESTAMP$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "timestamp");
    private static final javax.xml.namespace.QName METERSTOP$6 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "meterStop");
    private static final javax.xml.namespace.QName REASON$8 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "reason");
    private static final javax.xml.namespace.QName TRANSACTIONDATA$10 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "transactionData");
    
    
    /**
     * Gets the "transactionId" element
     */
    public int getTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONID$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TRANSACTIONID$0);
            }
            target.set(transactionId);
        }
    }
    
    /**
     * Gets the "idTag" element
     */
    public java.lang.String getIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTAG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idTag" element
     */
    public ocpp.IdToken xgetIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdToken target = null;
            target = (ocpp.IdToken)get_store().find_element_user(IDTAG$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "idTag" element
     */
    public boolean isSetIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDTAG$2) != 0;
        }
    }
    
    /**
     * Sets the "idTag" element
     */
    public void setIdTag(java.lang.String idTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTAG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTAG$2);
            }
            target.setStringValue(idTag);
        }
    }
    
    /**
     * Sets (as xml) the "idTag" element
     */
    public void xsetIdTag(ocpp.IdToken idTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.IdToken target = null;
            target = (ocpp.IdToken)get_store().find_element_user(IDTAG$2, 0);
            if (target == null)
            {
                target = (ocpp.IdToken)get_store().add_element_user(IDTAG$2);
            }
            target.set(idTag);
        }
    }
    
    /**
     * Unsets the "idTag" element
     */
    public void unsetIdTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDTAG$2, 0);
        }
    }
    
    /**
     * Gets the "timestamp" element
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$4, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$4);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Gets the "meterStop" element
     */
    public int getMeterStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METERSTOP$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "meterStop" element
     */
    public org.apache.xmlbeans.XmlInt xgetMeterStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(METERSTOP$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "meterStop" element
     */
    public void setMeterStop(int meterStop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METERSTOP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METERSTOP$6);
            }
            target.setIntValue(meterStop);
        }
    }
    
    /**
     * Sets (as xml) the "meterStop" element
     */
    public void xsetMeterStop(org.apache.xmlbeans.XmlInt meterStop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(METERSTOP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(METERSTOP$6);
            }
            target.set(meterStop);
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public ocpp.Reason.Enum getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ocpp.Reason.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "reason" element
     */
    public ocpp.Reason xgetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.Reason target = null;
            target = (ocpp.Reason)get_store().find_element_user(REASON$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "reason" element
     */
    public boolean isSetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$8) != 0;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(ocpp.Reason.Enum reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$8);
            }
            target.setEnumValue(reason);
        }
    }
    
    /**
     * Sets (as xml) the "reason" element
     */
    public void xsetReason(ocpp.Reason reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.Reason target = null;
            target = (ocpp.Reason)get_store().find_element_user(REASON$8, 0);
            if (target == null)
            {
                target = (ocpp.Reason)get_store().add_element_user(REASON$8);
            }
            target.set(reason);
        }
    }
    
    /**
     * Unsets the "reason" element
     */
    public void unsetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$8, 0);
        }
    }
    
    /**
     * Gets array of all "transactionData" elements
     */
    public ocpp.MeterValue[] getTransactionDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSACTIONDATA$10, targetList);
            ocpp.MeterValue[] result = new ocpp.MeterValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "transactionData" element
     */
    public ocpp.MeterValue getTransactionDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValue target = null;
            target = (ocpp.MeterValue)get_store().find_element_user(TRANSACTIONDATA$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "transactionData" element
     */
    public int sizeOfTransactionDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONDATA$10);
        }
    }
    
    /**
     * Sets array of all "transactionData" element
     */
    public void setTransactionDataArray(ocpp.MeterValue[] transactionDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(transactionDataArray, TRANSACTIONDATA$10);
        }
    }
    
    /**
     * Sets ith "transactionData" element
     */
    public void setTransactionDataArray(int i, ocpp.MeterValue transactionData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValue target = null;
            target = (ocpp.MeterValue)get_store().find_element_user(TRANSACTIONDATA$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transactionData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transactionData" element
     */
    public ocpp.MeterValue insertNewTransactionData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValue target = null;
            target = (ocpp.MeterValue)get_store().insert_element_user(TRANSACTIONDATA$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transactionData" element
     */
    public ocpp.MeterValue addNewTransactionData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.MeterValue target = null;
            target = (ocpp.MeterValue)get_store().add_element_user(TRANSACTIONDATA$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "transactionData" element
     */
    public void removeTransactionData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONDATA$10, i);
        }
    }
}
