package axis2server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * CentralSystemServiceSkeleton.java
 * SOAP server stubs pro OCPP 1.6.
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.3  Built on : Nov 12, 2010 (02:24:07 CET)
 * 
 * Chagelog:
 * 2020-02-04 - jmarianek - vychozi verze;
 * 2020-03-05 - jmarianek - getIpAddr(), impl. bootNotification() zatim bez 
 *                          persistence;
 *                        - statusNotification() zatim bez persistence;
 * 2020-03-06 - jmarianek - heartbeat();
 *                        - frekvence heartbeat zm. z 60 na 3600s; 
 *                        - startTransaction();
 *                        - stopTransaction();
 * 2020-03-14 - jmarianek - persistence bootNotification;
 * 2020-03-19 - jmarianek - getDB_FILE();
 *                        - oprava update zazn. v bootNotifivation();
 * 2020-03-21 - jmarianek - impl. meterValues(), dataTransfer() - bez persistence;
 * 
 *                        TODO: persistence vsech zprav
 *                        TODO: odsranit dupl. def DB_FILE (viz IndexSession
 *                              wicket servletu)
 *                        
 *                        TODO: authorize implementation
 *                        
 *                        TODO: startTransaction - nast. resp.setTransactionId(N)
 *                              kde N je z DB sekv. 
 *                        
 *                        
 * 
 */


import java.util.Calendar;
import java.util.Date;

import org.apache.axis2.context.MessageContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ocpp.impl.*;

/**
 * CentralSystemServiceSkeleton java skeleton for the axisService
 * SOAP server stubs pro OCPP 1.6.
 */
public class CentralSystemServiceSkeleton {

    
    private static Log log = LogFactory.getLog(CentralSystemServiceSkeleton.class);
    
    
    /**
     * Interval heartbeat v sec.
     */
    private final int HEARTBEAT_INTERVAL = 3600;
    
    /**
     * Umisteni SQLite3 DB souboru pro persistenci dat aplikace.
     * Duplicitne def. v IndexSession wicket servletu!
     */
    private final String DB_FILE =
        "/home/marianek/local/tomcat7.0/webapps/db/ocpp.db";

    private String getDB_FILE()
    {
        String dbFile = null;
        try {
            dbFile = System.getenv("OCPP_DB_FILE");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (dbFile != null ? dbFile : DB_FILE);
    }
    
    /**
     * Ziskani IP adresy klienta z AXIS2 MessageContext.
     * @return IP adresa ve formatu X.X.X.X
     */
    private String getIpAddr()
    {
        MessageContext inMessageContext = MessageContext.getCurrentMessageContext();
        //String ip = (String)inMessageContext.getProperty("REMOTE_ADDR");        
        String ip = (String)inMessageContext.getProperty(MessageContext.REMOTE_ADDR);
        return ip;
    }

    
    
    
    
    /**
     * Auto generated method signature
     * 
     * @param stopTransactionRequest
     */
    public ocpp.StopTransactionResponseDocument stopTransaction(
            ocpp.StopTransactionRequestDocument stopTransactionRequest)
    {
        /*
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#stopTransaction");
        */
        StopTransactionRequestImpl req = (StopTransactionRequestImpl) stopTransactionRequest.getStopTransactionRequest();
        
        String ipAddr = getIpAddr();
        log.info("stopTransaction("
            + req.getIdTag() + ", "
            + req.getMeterStop() + ", "
            + req.getTimestamp() + ", "
            + req.getTransactionId()
            + ") from " + ipAddr);
        
        ocpp.StopTransactionResponseDocument respDoc = 
            ocpp.StopTransactionResponseDocument.Factory.newInstance();
        ocpp.StopTransactionResponse resp = 
            ocpp.StopTransactionResponse.Factory.newInstance();
        
        ocpp.IdTagInfo iti = ocpp.IdTagInfo.Factory.newInstance();
        iti.setStatus(ocpp.AuthorizationStatus.ACCEPTED); // optional
        
        // TODO: persist
        
        respDoc.setStopTransactionResponse(resp);
        return respDoc;        
    }

    
    
    
    
    
    /**
     * Auto generated method signature
     * 
     * @param statusNotificationRequest
     */
    public ocpp.StatusNotificationResponseDocument statusNotification(
            ocpp.StatusNotificationRequestDocument statusNotificationRequest)
    {
        /*
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#statusNotification");
        */
        
        String ipAddr = getIpAddr();
        StatusNotificationRequestImpl req = (StatusNotificationRequestImpl) statusNotificationRequest.getStatusNotificationRequest();
        int conId = req.getConnectorId();
        ocpp.ChargePointErrorCode.Enum errCode = req.getErrorCode();
        ocpp.ChargePointStatus.Enum status = req.getStatus();
        
        log.info("statusNotification("
                + conId + ", " + errCode + ", " + status + ") from " + ipAddr);
        
        ocpp.StatusNotificationResponseDocument respDoc = 
                ocpp.StatusNotificationResponseDocument.Factory.newInstance();
        ocpp.StatusNotificationResponse resp = 
                ocpp.StatusNotificationResponse.Factory.newInstance();
        respDoc.setStatusNotificationResponse(resp);

        return respDoc;
        
        
    }

    
    
    
    
    /**
     * Auto generated method signature
     * 
     * @param authorizeRequest
     */
    public ocpp.AuthorizeResponseDocument authorize(ocpp.AuthorizeRequestDocument authorizeRequest)
    {
        // TODO : fill this with the necessary business logic
        log.info("authorize()");
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#authorize");
    }

    
    
    
    
    
    /**
     * Auto generated method signature
     * 
     * @param startTransactionRequest
     */
    public ocpp.StartTransactionResponseDocument startTransaction(
            ocpp.StartTransactionRequestDocument startTransactionRequest)
    {
        /*
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#startTransaction");
        */
        
        StartTransactionRequestImpl req = (StartTransactionRequestImpl) startTransactionRequest.getStartTransactionRequest();
        
        String ipAddr = getIpAddr();
        log.info("startTransaction("
            + req.getConnectorId() + ", "
            + req.getIdTag() + ", "
            + req.getMeterStart() + ", "
            + req.getTimestamp()
            + ") from " + ipAddr);
        
        ocpp.StartTransactionResponseDocument respDoc = 
            ocpp.StartTransactionResponseDocument.Factory.newInstance();
        ocpp.StartTransactionResponse resp = 
            ocpp.StartTransactionResponse.Factory.newInstance();
        
        ocpp.IdTagInfo iti = ocpp.IdTagInfo.Factory.newInstance();
        iti.setStatus(ocpp.AuthorizationStatus.ACCEPTED);
        resp.setTransactionId(1); // TODO - ze sekvence
        
        // TODO: persist
        
        respDoc.setStartTransactionResponse(resp);
        return respDoc;
        
    }

    
    
    
    
    
    /**
     * Auto generated method signature
     * 
     * @param firmwareStatusNotificationRequest
     */
    public ocpp.FirmwareStatusNotificationResponseDocument firmwareStatusNotification(
            ocpp.FirmwareStatusNotificationRequestDocument firmwareStatusNotificationRequest) {
        // TODO : fill this with the necessary business logic
        log.info("firmwareStatusNotification()");
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#firmwareStatusNotification");
    }

    
    
    
    
    /**
     * Auto generated method signature
     * 
     * @param bootNotificationRequest
     */
    public ocpp.BootNotificationResponseDocument bootNotification(
            ocpp.BootNotificationRequestDocument bootNotificationRequest)
    {
        /*
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#bootNotification");
         */
        
        String ipAddr = getIpAddr();
        BootNotificationRequestImpl req = (BootNotificationRequestImpl) bootNotificationRequest.getBootNotificationRequest();
        String model = req.getChargePointModel();
        String vendor = req.getChargePointVendor();

        log.info("bootNotification("
                + model + ", " + vendor + ") from " + ipAddr);
        
        // persist
        Connection connection = null;
        try {
            // load the sqlite-JDBC driver using the current class loader
            Class.forName("org.sqlite.JDBC");
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:" + getDB_FILE());
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30); // set timeout to 30 sec.
            
            statement.executeUpdate(
                "insert or ignore into dev(ip, model, vendor, status)\n"
                + "values ('" + ipAddr + "', '" + model + "', '" + vendor + "', 'boot');"
            );
            statement.executeUpdate(
                "update dev set status = 'boot' where ip = '" + ipAddr + "');"
            );

        } catch (Exception e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e);
            }
        }

        // TODO persist using sqlite driver
        
        //org.apache.xmlbeans.SchemaType sType = new org.apache.xmlbeans.SchemaType();
        
        ocpp.BootNotificationResponseDocument respDoc = 
            ocpp.BootNotificationResponseDocument.Factory.newInstance();
        
        ocpp.BootNotificationResponse resp = 
            ocpp.BootNotificationResponse.Factory.newInstance();
        ocpp.RegistrationStatus status =
                ocpp.RegistrationStatus.Factory.newInstance();
        Calendar cal = Calendar.getInstance(); 
        resp.setCurrentTime(cal);
        resp.setInterval(HEARTBEAT_INTERVAL);
        resp.setStatus(status.ACCEPTED);
  
        respDoc.setBootNotificationResponse(resp);
        
        return respDoc;
    }

    
    
    
    
    
    /**
     * Auto generated method signature
     * 
     * @param heartbeatRequest
     */
    public ocpp.HeartbeatResponseDocument heartbeat(ocpp.HeartbeatRequestDocument heartbeatRequest)
    {
        /*
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#heartbeat");
        */
        String ipAddr = getIpAddr();

        log.info("heartbeat() from " + ipAddr);
        
        ocpp.HeartbeatResponseDocument respDoc = 
                ocpp.HeartbeatResponseDocument.Factory.newInstance();
        ocpp.HeartbeatResponse resp = 
                ocpp.HeartbeatResponse.Factory.newInstance();
        resp.setCurrentTime(Calendar.getInstance());
        respDoc.setHeartbeatResponse(resp);
        
        return respDoc;

    }
    
    
    
    

    /**
     * Auto generated method signature
     * 
     * @param meterValuesRequest
     */

    public ocpp.MeterValuesResponseDocument meterValues(ocpp.MeterValuesRequestDocument meterValuesRequest)
    {
        /*
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#meterValues");
        */
        
        MeterValuesRequestImpl req = (MeterValuesRequestImpl) meterValuesRequest.getMeterValuesRequest();

        String ipAddr = getIpAddr();

        log.info("meterValues("
            + req.getConnectorId() + ", "
            + req.getMeterValueArray()
            + ") from " + ipAddr);

        // TODO - persistence 

        ocpp.MeterValuesResponseDocument respDoc = 
                ocpp.MeterValuesResponseDocument.Factory.newInstance();
        ocpp.MeterValuesResponse resp = 
                ocpp.MeterValuesResponse.Factory.newInstance();
                
        respDoc.setMeterValuesResponse(resp);
        
        return respDoc;

    }

    
    
    
    
    /**
     * Auto generated method signature
     * 
     * @param dataTransferRequest
     */

    public ocpp.DataTransferResponseDocument dataTransfer(ocpp.DataTransferRequestDocument dataTransferRequest)
    {
        /*
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#dataTransfer");
        */
        
        DataTransferRequestImpl req = (DataTransferRequestImpl) dataTransferRequest.getDataTransferRequest();

        String ipAddr = getIpAddr();

        log.info("dataTransfer("
            + req.getVendorId()
            + ") from " + ipAddr);

        // TODO - persistence 

        ocpp.DataTransferResponseDocument respDoc = 
                ocpp.DataTransferResponseDocument.Factory.newInstance();
        ocpp.DataTransferResponse resp = 
                ocpp.DataTransferResponse.Factory.newInstance();
        ocpp.DataTransferStatus status =
                ocpp.DataTransferStatus.Factory.newInstance();
        resp.setStatus(status.ACCEPTED);
                
        respDoc.setDataTransferResponse(resp);
        
        return respDoc;
    }

    
    
    
    /**
     * Auto generated method signature
     * 
     * @param diagnosticsStatusNotificationRequest
     */

    public ocpp.DiagnosticsStatusNotificationResponseDocument diagnosticsStatusNotification(
            ocpp.DiagnosticsStatusNotificationRequestDocument diagnosticsStatusNotificationRequest) {
        // TODO : fill this with the necessary business logic
        log.info("diagnosticStatusNotification()");
        throw new java.lang.UnsupportedOperationException(
                "Please implement " + this.getClass().getName() + "#diagnosticsStatusNotification");
    }

}
