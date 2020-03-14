/*
 * XML Type:  BootNotificationRequest
 * Namespace: urn://Ocpp/Cs/2015/10/
 * Java type: ocpp.BootNotificationRequest
 *
 * Automatically generated - do not modify.
 */
package ocpp.impl;
/**
 * An XML BootNotificationRequest(@urn://Ocpp/Cs/2015/10/).
 *
 * This is a complex type.
 */
public class BootNotificationRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ocpp.BootNotificationRequest
{
    
    public BootNotificationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARGEPOINTVENDOR$0 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "chargePointVendor");
    private static final javax.xml.namespace.QName CHARGEPOINTMODEL$2 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "chargePointModel");
    private static final javax.xml.namespace.QName CHARGEPOINTSERIALNUMBER$4 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "chargePointSerialNumber");
    private static final javax.xml.namespace.QName CHARGEBOXSERIALNUMBER$6 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "chargeBoxSerialNumber");
    private static final javax.xml.namespace.QName FIRMWAREVERSION$8 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "firmwareVersion");
    private static final javax.xml.namespace.QName ICCID$10 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "iccid");
    private static final javax.xml.namespace.QName IMSI$12 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "imsi");
    private static final javax.xml.namespace.QName METERTYPE$14 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "meterType");
    private static final javax.xml.namespace.QName METERSERIALNUMBER$16 = 
        new javax.xml.namespace.QName("urn://Ocpp/Cs/2015/10/", "meterSerialNumber");
    
    
    /**
     * Gets the "chargePointVendor" element
     */
    public java.lang.String getChargePointVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEPOINTVENDOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chargePointVendor" element
     */
    public ocpp.CiString20Type xgetChargePointVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString20Type target = null;
            target = (ocpp.CiString20Type)get_store().find_element_user(CHARGEPOINTVENDOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "chargePointVendor" element
     */
    public void setChargePointVendor(java.lang.String chargePointVendor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEPOINTVENDOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGEPOINTVENDOR$0);
            }
            target.setStringValue(chargePointVendor);
        }
    }
    
    /**
     * Sets (as xml) the "chargePointVendor" element
     */
    public void xsetChargePointVendor(ocpp.CiString20Type chargePointVendor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString20Type target = null;
            target = (ocpp.CiString20Type)get_store().find_element_user(CHARGEPOINTVENDOR$0, 0);
            if (target == null)
            {
                target = (ocpp.CiString20Type)get_store().add_element_user(CHARGEPOINTVENDOR$0);
            }
            target.set(chargePointVendor);
        }
    }
    
    /**
     * Gets the "chargePointModel" element
     */
    public java.lang.String getChargePointModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEPOINTMODEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chargePointModel" element
     */
    public ocpp.CiString20Type xgetChargePointModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString20Type target = null;
            target = (ocpp.CiString20Type)get_store().find_element_user(CHARGEPOINTMODEL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "chargePointModel" element
     */
    public void setChargePointModel(java.lang.String chargePointModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEPOINTMODEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGEPOINTMODEL$2);
            }
            target.setStringValue(chargePointModel);
        }
    }
    
    /**
     * Sets (as xml) the "chargePointModel" element
     */
    public void xsetChargePointModel(ocpp.CiString20Type chargePointModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString20Type target = null;
            target = (ocpp.CiString20Type)get_store().find_element_user(CHARGEPOINTMODEL$2, 0);
            if (target == null)
            {
                target = (ocpp.CiString20Type)get_store().add_element_user(CHARGEPOINTMODEL$2);
            }
            target.set(chargePointModel);
        }
    }
    
    /**
     * Gets the "chargePointSerialNumber" element
     */
    public java.lang.String getChargePointSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEPOINTSERIALNUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chargePointSerialNumber" element
     */
    public ocpp.CiString25Type xgetChargePointSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString25Type target = null;
            target = (ocpp.CiString25Type)get_store().find_element_user(CHARGEPOINTSERIALNUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "chargePointSerialNumber" element
     */
    public boolean isSetChargePointSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARGEPOINTSERIALNUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "chargePointSerialNumber" element
     */
    public void setChargePointSerialNumber(java.lang.String chargePointSerialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEPOINTSERIALNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGEPOINTSERIALNUMBER$4);
            }
            target.setStringValue(chargePointSerialNumber);
        }
    }
    
    /**
     * Sets (as xml) the "chargePointSerialNumber" element
     */
    public void xsetChargePointSerialNumber(ocpp.CiString25Type chargePointSerialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString25Type target = null;
            target = (ocpp.CiString25Type)get_store().find_element_user(CHARGEPOINTSERIALNUMBER$4, 0);
            if (target == null)
            {
                target = (ocpp.CiString25Type)get_store().add_element_user(CHARGEPOINTSERIALNUMBER$4);
            }
            target.set(chargePointSerialNumber);
        }
    }
    
    /**
     * Unsets the "chargePointSerialNumber" element
     */
    public void unsetChargePointSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARGEPOINTSERIALNUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "chargeBoxSerialNumber" element
     */
    public java.lang.String getChargeBoxSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEBOXSERIALNUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chargeBoxSerialNumber" element
     */
    public ocpp.CiString25Type xgetChargeBoxSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString25Type target = null;
            target = (ocpp.CiString25Type)get_store().find_element_user(CHARGEBOXSERIALNUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "chargeBoxSerialNumber" element
     */
    public boolean isSetChargeBoxSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARGEBOXSERIALNUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "chargeBoxSerialNumber" element
     */
    public void setChargeBoxSerialNumber(java.lang.String chargeBoxSerialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEBOXSERIALNUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGEBOXSERIALNUMBER$6);
            }
            target.setStringValue(chargeBoxSerialNumber);
        }
    }
    
    /**
     * Sets (as xml) the "chargeBoxSerialNumber" element
     */
    public void xsetChargeBoxSerialNumber(ocpp.CiString25Type chargeBoxSerialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString25Type target = null;
            target = (ocpp.CiString25Type)get_store().find_element_user(CHARGEBOXSERIALNUMBER$6, 0);
            if (target == null)
            {
                target = (ocpp.CiString25Type)get_store().add_element_user(CHARGEBOXSERIALNUMBER$6);
            }
            target.set(chargeBoxSerialNumber);
        }
    }
    
    /**
     * Unsets the "chargeBoxSerialNumber" element
     */
    public void unsetChargeBoxSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARGEBOXSERIALNUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "firmwareVersion" element
     */
    public java.lang.String getFirmwareVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRMWAREVERSION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "firmwareVersion" element
     */
    public ocpp.CiString50Type xgetFirmwareVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString50Type target = null;
            target = (ocpp.CiString50Type)get_store().find_element_user(FIRMWAREVERSION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "firmwareVersion" element
     */
    public boolean isSetFirmwareVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRMWAREVERSION$8) != 0;
        }
    }
    
    /**
     * Sets the "firmwareVersion" element
     */
    public void setFirmwareVersion(java.lang.String firmwareVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRMWAREVERSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRMWAREVERSION$8);
            }
            target.setStringValue(firmwareVersion);
        }
    }
    
    /**
     * Sets (as xml) the "firmwareVersion" element
     */
    public void xsetFirmwareVersion(ocpp.CiString50Type firmwareVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString50Type target = null;
            target = (ocpp.CiString50Type)get_store().find_element_user(FIRMWAREVERSION$8, 0);
            if (target == null)
            {
                target = (ocpp.CiString50Type)get_store().add_element_user(FIRMWAREVERSION$8);
            }
            target.set(firmwareVersion);
        }
    }
    
    /**
     * Unsets the "firmwareVersion" element
     */
    public void unsetFirmwareVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRMWAREVERSION$8, 0);
        }
    }
    
    /**
     * Gets the "iccid" element
     */
    public java.lang.String getIccid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICCID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iccid" element
     */
    public ocpp.CiString20Type xgetIccid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString20Type target = null;
            target = (ocpp.CiString20Type)get_store().find_element_user(ICCID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "iccid" element
     */
    public boolean isSetIccid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICCID$10) != 0;
        }
    }
    
    /**
     * Sets the "iccid" element
     */
    public void setIccid(java.lang.String iccid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICCID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICCID$10);
            }
            target.setStringValue(iccid);
        }
    }
    
    /**
     * Sets (as xml) the "iccid" element
     */
    public void xsetIccid(ocpp.CiString20Type iccid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString20Type target = null;
            target = (ocpp.CiString20Type)get_store().find_element_user(ICCID$10, 0);
            if (target == null)
            {
                target = (ocpp.CiString20Type)get_store().add_element_user(ICCID$10);
            }
            target.set(iccid);
        }
    }
    
    /**
     * Unsets the "iccid" element
     */
    public void unsetIccid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICCID$10, 0);
        }
    }
    
    /**
     * Gets the "imsi" element
     */
    public java.lang.String getImsi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMSI$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "imsi" element
     */
    public ocpp.CiString20Type xgetImsi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString20Type target = null;
            target = (ocpp.CiString20Type)get_store().find_element_user(IMSI$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "imsi" element
     */
    public boolean isSetImsi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMSI$12) != 0;
        }
    }
    
    /**
     * Sets the "imsi" element
     */
    public void setImsi(java.lang.String imsi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMSI$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMSI$12);
            }
            target.setStringValue(imsi);
        }
    }
    
    /**
     * Sets (as xml) the "imsi" element
     */
    public void xsetImsi(ocpp.CiString20Type imsi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString20Type target = null;
            target = (ocpp.CiString20Type)get_store().find_element_user(IMSI$12, 0);
            if (target == null)
            {
                target = (ocpp.CiString20Type)get_store().add_element_user(IMSI$12);
            }
            target.set(imsi);
        }
    }
    
    /**
     * Unsets the "imsi" element
     */
    public void unsetImsi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMSI$12, 0);
        }
    }
    
    /**
     * Gets the "meterType" element
     */
    public java.lang.String getMeterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METERTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "meterType" element
     */
    public ocpp.CiString25Type xgetMeterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString25Type target = null;
            target = (ocpp.CiString25Type)get_store().find_element_user(METERTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "meterType" element
     */
    public boolean isSetMeterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METERTYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "meterType" element
     */
    public void setMeterType(java.lang.String meterType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METERTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METERTYPE$14);
            }
            target.setStringValue(meterType);
        }
    }
    
    /**
     * Sets (as xml) the "meterType" element
     */
    public void xsetMeterType(ocpp.CiString25Type meterType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString25Type target = null;
            target = (ocpp.CiString25Type)get_store().find_element_user(METERTYPE$14, 0);
            if (target == null)
            {
                target = (ocpp.CiString25Type)get_store().add_element_user(METERTYPE$14);
            }
            target.set(meterType);
        }
    }
    
    /**
     * Unsets the "meterType" element
     */
    public void unsetMeterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METERTYPE$14, 0);
        }
    }
    
    /**
     * Gets the "meterSerialNumber" element
     */
    public java.lang.String getMeterSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METERSERIALNUMBER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "meterSerialNumber" element
     */
    public ocpp.CiString25Type xgetMeterSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString25Type target = null;
            target = (ocpp.CiString25Type)get_store().find_element_user(METERSERIALNUMBER$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "meterSerialNumber" element
     */
    public boolean isSetMeterSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METERSERIALNUMBER$16) != 0;
        }
    }
    
    /**
     * Sets the "meterSerialNumber" element
     */
    public void setMeterSerialNumber(java.lang.String meterSerialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METERSERIALNUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METERSERIALNUMBER$16);
            }
            target.setStringValue(meterSerialNumber);
        }
    }
    
    /**
     * Sets (as xml) the "meterSerialNumber" element
     */
    public void xsetMeterSerialNumber(ocpp.CiString25Type meterSerialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ocpp.CiString25Type target = null;
            target = (ocpp.CiString25Type)get_store().find_element_user(METERSERIALNUMBER$16, 0);
            if (target == null)
            {
                target = (ocpp.CiString25Type)get_store().add_element_user(METERSERIALNUMBER$16);
            }
            target.set(meterSerialNumber);
        }
    }
    
    /**
     * Unsets the "meterSerialNumber" element
     */
    public void unsetMeterSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METERSERIALNUMBER$16, 0);
        }
    }
}
