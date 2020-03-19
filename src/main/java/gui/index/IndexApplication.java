package gui.index;

/**
 * IndexApplication.java
 *
 * Vstupni bod wicket web aplikace pro OCPP.
 * 
 * Chagelog:
 * 2020-03-13 - jmarianek - vychozi verze;
 * 2020-03-14 - jmarianek - url mount /about, /dev;
 *                        - session;
 * 2020-03-19 - jmarianek - mount /ocpp-0.1/app/trans;
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import gui.dev.Devices;
import gui.trans.Trans;
import wicket.ISessionFactory;
import wicket.Session;
import wicket.protocol.http.WebApplication;
import wicket.protocol.http.WebSession;
import wicket.request.target.coding.QueryStringUrlCodingStrategy;
import wicket.settings.IExceptionSettings;

/**
 * Application object for your wicket web application.
 * 
 * @see wicket.quickstart.Start#main(String[])
 */
public class IndexApplication extends WebApplication
{    
	/** Logging */
	private static final Log log = LogFactory.getLog(IndexApplication.class);

    /**
     * Constructor
     */
	public IndexApplication()
	{
	}
	
	/**
	 * @see wicket.Application#getHomePage()
	 */
	public Class getHomePage()
	{
		return IndexPage.class;
	}

	
	 @Override
    protected void init()
    {
        super.init();
        
        // Volani configure() zakomentovano, nize provedeme vlastni nastaveni. 
        /*
        configure(DEPLOYMENT);
        // configure(DEVELOPMENT);
        */
        
        // nastaveni exception stranky
        /* Lepsim resenim je ale dle autoru wicket
         ...implement/override RequestCycle.onRuntimeException() */ 
        getExceptionSettings().setUnexpectedExceptionDisplay(
            IExceptionSettings.SHOW_EXCEPTION_PAGE);

        // nastaveni ladeni AJAX
        // getAjaxSettings().setAjaxDebugModeEnabled(false);

        
        // URL aliasy
        /*
        mountBookmarkablePage("/home", IndexPage.class);
        */
        // mount /ocpp-0.1/app/about -> gui.index.About
        mount("/about", new QueryStringUrlCodingStrategy("/about", About.class));

        // mount /ocpp-0.1/app/dev -> gui.dev.Devices
        mount("/dev", new QueryStringUrlCodingStrategy("/dev", Devices.class));
        
        // mount /ocpp-0.1/app/trans -> gui.dev.Trans
        mount("/trans", new QueryStringUrlCodingStrategy("/trans", Trans.class));
    }

	
	 
    @Override
    public WebSession newSession() {
        return new IndexSession(IndexApplication.this);
    } 

}