package axis2client;


/*
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest;

import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse;
import org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse;
 */

import axis2client.CentralSystemServiceStub;
import axis2client.CentralSystemServiceStub.AuthorizeRequestE;
import axis2client.CentralSystemServiceStub.AuthorizeRequest;
import axis2client.CentralSystemServiceStub.IdToken;
import axis2client.CentralSystemServiceStub.AuthorizeResponseE;
import axis2client.CentralSystemServiceStub.ChargeBoxIdentity;


//import java.net.*;
//import java.util.*;



public class Client {

private static String clientIP = "127.0.0.1"; // K cemu to tu je? Mozna pro hash.
private static String serverIP = "127.0.0.1";

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

        String wsUrl = "http://" + serverIP + ":8080/ocpp-0.1/services/CentralSystemService";

        System.out.println("Client's IP = " + clientIP + "\n");
        System.out.println("Server's IP = " + serverIP + "\n");
        System.out.println("OCPP URL = " + wsUrl + "\n");
        
        CentralSystemServiceStub stub =
            new CentralSystemServiceStub
            (wsUrl);

        //unlockConnectorRequest(stub);
        
        authorize(stub);

    } catch(Exception e){
        e.printStackTrace();
        System.out.println("\n\n\n");
    }
}





public static void authorize(CentralSystemServiceStub stub)
{
    try {
        
        AuthorizeRequestE req = new AuthorizeRequestE();
        AuthorizeRequest par = new AuthorizeRequest();
        IdToken it = new IdToken();
        it.setIdToken("xx");
        par.setIdTag(it);
        req.setAuthorizeRequest(par);
        
        ChargeBoxIdentity cbi = new ChargeBoxIdentity();
        cbi.setChargeBoxIdentity("1902512668/B94060092");        

        AuthorizeResponseE res = stub.authorize(req, cbi);                  

        System.out.println(1);
        //System.out.println(res.get_return());
        System.out.println(2);

    } catch(Exception e){
        e.printStackTrace();
        System.out.println("\n\n\n");
    }

}



}


