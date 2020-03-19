package gui.dev;

/**
 * Devices.java
 *
 * Seznam spravovanych zarizeni (nabijecek).
 * Pro persistenci pouziva sqlite jdbc driver xerial
 * @see https://github.com/xerial/sqlite-jdbc/blob/master/README.md
 * 
 * Chagelog:
 * 2020-03-14 - jmarianek - vychozi verze;
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import wicket.PageParameters;
import wicket.markup.html.WebPage;
import wicket.markup.html.basic.Label;
import wicket.markup.html.link.Link;

import gui.index.IndexPage;
import gui.index.IndexSession;


/**
 * Basic bookmarkable page.
 * 
 */
public class Devices extends WebPage
{
    // TODO Add any page properties or variables here
        

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * TODO: prebirat PageParameters a podle nich filtrovat tabulku
	 * TODO: @param parameters URL Page parameters
	 */
	public Devices(/*final PageParameters parameters*/) 
    {
		
        Link back = new Link("back") {
            @Override
            public void onClick() {
                setResponsePage(new IndexPage());
            }
        };
        add(back);
        
        show();
	}
	
	
	
    /**
     * Get downcast session object for easy access by subclasses
     * 
     * @return The session
     */
    public IndexSession getIndexSession()
    {
        return (IndexSession)getSession();
    }
    
    
    
	
	/**
	 * Seznam zarizeni.
	 */
	private void show() 
	{

        Connection connection = null;
        try {
            // load the sqlite-JDBC driver using the current class loader
            Class.forName("org.sqlite.JDBC");

            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:" + getIndexSession().getDB_FILE());
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30); // set timeout to 30 sec.

            // TODO - lepe pomoci DataTable z wicket-extensions
            String html = "<table border='1'><thead><tr>\n";
            html += "<th>id</th><th>ip</th><th>con</th><th>model</th>";
            html += "<th>vendor</th><th>status</th><th>updated</th>";
            html += "</tr></thead>\n";
            html += "<tbody>\n";
            
            // statement.executeUpdate("drop table if exists person");
            ResultSet rs = statement.executeQuery("select * from dev");
            while (rs.next()) {
                // read the result set
                //System.out.println("name = " + rs.getString("id"));
                html += "<tr>";
                html += "<td>" + rs.getString("id") + "</td>";
                html += "<td>" + rs.getString("ip") + "</td>";
                html += "<td>" + rs.getString("connector") + "</td>";
                html += "<td>" + rs.getString("model") + "</td>";
                html += "<td>" + rs.getString("vendor") + "</td>";
                html += "<td>" + rs.getString("status") + "</td>";
                html += "<td>" + rs.getString("updated_on") + "</td>";
                html += "</tr>\n";
            }
            html += "</tbody></table>\n";
            
            Label devList = new Label("devList", html);
            devList.setEscapeModelStrings(false);
            add(devList);
            
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
    }
	
}
