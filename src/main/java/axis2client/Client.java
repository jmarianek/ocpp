package axis2client;
/**
 * Client.java
 * SOAP klient pro volani sluzeb chargeru (reset, unlock zasuvky, ...)
 *
 * Chagelog:
 * 2020-02-05 - jmarianek - vychozi verze;
 */

import axis2client.ChargePointServiceStub.ChargeBoxIdentity;
import axis2client.ChargePointServiceStub.ResetType;
import axis2client.ChargePointServiceStub.ResetRequest;
import axis2client.ChargePointServiceStub.ResetRequestE;
import axis2client.ChargePointServiceStub.ResetResponse;
import axis2client.ChargePointServiceStub.ResetResponseE;

/*
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest;

import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse;
 */

import axis2client.ChargePointServiceStub.UnlockConnectorRequest;
import axis2client.ChargePointServiceStub.UnlockConnectorResponse;



//import java.net.*;
//import java.util.*;


/**
 * SOAP klient pro volani sluzeb chargeru (reset, unlock zasuvky, ...)  
 *
 */
public class Client {

private static String clientIP = "10.0.0.32"; // K cemu to tu je? Mozna pro hash.
private static String serverIP = "10.0.0.50";// "127.0.0.1";

public static void main(java.lang.String args[]) {
    try {
        // first get client's IP
        //clientIP = args[0];
        //serverIP = args[1];
        
        /*
        	clientIP = InetAddress.getLocalHost().getHostAddress();

	for (Enumeration<NetworkInterface> ifaces = 
        NetworkInterface.getNetworkInterfaces();
      ifaces.hasMoreElements(); )
    {
     NetworkInterface iface = ifaces.nextElement();
     System.out.println(iface.getName() + ":");
	 for (Enumeration<InetAddress> addresses =
	        iface.getInetAddresses();
	      addresses.hasMoreElements(); )
	 {
	     InetAddress address = addresses.nextElement();
	     System.out.println("  " + address);
	     }
 }
// -- exact interface
	NetworkInterface ni = NetworkInterface.getByName("eth1");
	ni.getInetAddresses();
             */

        String wsUrl = "http://" + serverIP + ":81/Ocpp/ChargePointService/";

        System.out.println("Client's IP = " + clientIP + "\n");
        System.out.println("Server's IP = " + serverIP + "\n");
        System.out.println("OCPP URL = " + wsUrl + "\n");
        
        ChargePointServiceStub stub =
            new ChargePointServiceStub
            (wsUrl);
        //                ("http://localhost:8080/mcws-0.1/services/MediaCreatorWS");
        //                ("http://localhost:8080/axis2/services/Axis2UserGuideService");

        //unlockConnectorRequest(stub);
        
        reset(stub);

    } catch(Exception e){
        e.printStackTrace();
        System.out.println("\n\n\n");
    }
}





public static void reset(ChargePointServiceStub stub)
{
    try {
        // delsi cas na odpoved
        stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(120000);
        
        ResetRequestE req = new ResetRequestE();
        ResetRequest par = new ResetRequest();
        ResetType rt = ResetType.Hard;
        par.setType(rt);
        req.setResetRequest(par);
        ChargeBoxIdentity cbi = new ChargeBoxIdentity();
        
        cbi.setChargeBoxIdentity("1902512668/B94060092");
        //cbi.setChargeBoxIdentity("+49*839*00000000001");
        
        ResetResponseE res = stub.reset(req, cbi);

        //System.out.println(res.get_return());
        //ResetResponse res2 = res.getResetResponse();
          
        System.out.println(1);
        System.out.println(res);
        System.out.println(2);

    } catch(Exception e){
        e.printStackTrace();
        System.out.println("\n\n\n");
    }

}



/* two way call/receive */
public static void unlockConnectorRequest(ChargePointServiceStub stub)
{
    try {
        UnlockConnectorRequest req = new UnlockConnectorRequest();

/*
        UnlockConnectorResponse res = stub.unlockConnectorRequest(req);

        System.out.println(res.get_return());
        */

    } catch(Exception e){
        e.printStackTrace();
        System.out.println("\n\n\n");
    }
}


}


