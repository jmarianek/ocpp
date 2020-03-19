package gui.trans;

/**
 * Trans.java
 *
 * Seznam transakci spravovanych zarizeni (nabijecek).
 * Pro persistenci pouziva sqlite jdbc driver xerial
 * @see https://github.com/xerial/sqlite-jdbc/blob/master/README.md
 * 
 * Chagelog:
 * 2020-03-19 - jmarianek - vychozi verze;
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
import wicket.util.string.StringValueConversionException;
import gui.index.IndexPage;
import gui.index.IndexSession;


/**
 * Basic bookmarkable page.
 * 
 */
public class Trans extends WebPage
{
    // TODO Add any page properties or variables here
        
    
    public Trans() 
    {
        Link back = new Link("back") {
            @Override
            public void onClick() {
                setResponsePage(new IndexPage());
            }
        };
        add(back);

        show(null);
    }
    

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * TODO: prebirat PageParameters a podle nich filtrovat tabulku
	 * TODO: @param par URL Page parameters
	 */
	public Trans(final PageParameters par) 
    {
		
        Link back = new Link("back") {
            @Override
            public void onClick() {
                setResponsePage(new IndexPage());
            }
        };
        add(back);
        
        System.out.println("par:" + par);
        Integer devId = null;
        try {
            devId = par.getInt("dev_id");
        } catch (StringValueConversionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        show(devId);
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
	 * @param devId Id zarizeni (dev.id), nebo null.
	 */
	private void show(Integer devId) 
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
            html += "<th>id</th><th>ip</th><th>con</th><th>event</th>";
            html += "<th>rfid</th><th>meter</th><th>trans_date</th>";
            html += "</tr></thead>\n";
            html += "<tbody>\n";
            
            // statement.executeUpdate("drop table if exists person");
            ResultSet rs = statement.executeQuery(
                "select t.*, d.ip, d.connector from trans t left join dev d on t.dev_id = d.id"
                + (devId == null ? "" : " where d.id = " + devId));
            while (rs.next()) {
                // read the result set
                //System.out.println("name = " + rs.getString("id"));
                html += "<tr>";
                html += "<td>" + rs.getString("id") + "</td>";
                html += "<td>" + rs.getString("ip") + "</td>";
                html += "<td>" + rs.getString("connector") + "</td>";
                html += "<td>" + rs.getString("event") + "</td>";
                html += "<td>" + rs.getString("rfid") + "</td>";
                html += "<td>" + rs.getString("meter") + "</td>";
                html += "<td>" + rs.getString("trans_date") + "</td>";
                html += "</tr>\n";
            }
            html += "</tbody></table>\n";
            
            Label transList = new Label("transList", html);
            transList.setEscapeModelStrings(false);
            add(transList);
            
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
