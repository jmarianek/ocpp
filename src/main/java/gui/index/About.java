package gui.index;

/**
 * About.java
 *
 * O aplikaci - copyright, licence, vyvojovy tym, ...
 * 
 * Chagelog:
 * 2020-03-14 - jmarianek - vychozi verze;
 */

import wicket.PageParameters;
import wicket.markup.html.WebPage;
import wicket.markup.html.basic.Label;
import wicket.markup.html.link.Link;

/**
 * Basic bookmarkable about page.
 * 
 */
public class About extends WebPage
{
    // TODO Add any page properties or variables here

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 */
	public About() 
    {
		
        Link back = new Link("back") {
            @Override
            public void onClick() {
                setResponsePage(new IndexPage());
            }
        };
        add(back);
	}
}
