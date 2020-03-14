package gui.index;
/**
 * IndexApplication.java
 *
 * Home page wicket web aplikace pro OCPP.
 * 
 * Chagelog:
 * 2020-03-13 - jmarianek - vychozi verze;
 * 2020-03-14 - jmarianek - licence, o aplikaci;
 */

import gui.dev.Devices;

import wicket.PageParameters;
import wicket.markup.html.WebPage;
import wicket.markup.html.basic.Label;
import wicket.markup.html.link.Link;

/**
 * Basic bookmarkable index page.
 * 
 */
public class IndexPage extends WebPage
{
    /**
     * id serializace
     */
    private static final long serialVersionUID = 1L;

    /**
     * Verze aplikace.
     */
    private final String VER = "0.1";
    
    /**
     * Zakaznik, pro ktereho je licence vystavena.
     * Tj. pro kazdeho zakaznika bude vlastni kompilace war.
     */
    private final String LIC = "Dan Mader";
    

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 */
	public IndexPage(/*final PageParameters parameters*/) 
    {
        // TODO Add your page's components here
		add(new Label("ver", VER));
	    add(new Label("lic", LIC));
	    
	    Link back = new Link("dev") {
            @Override
            public void onClick() {
                setResponsePage(new Devices());
            }
        };
        add(back);

	}
}
