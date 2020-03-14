package gui.index;
/**
 * IndexSession.java
 * Obsahuje umisteni DB souboru aplikace.
 *
 * Session pro IndexApplication.
 * 
 * Chagelog:
 * 2020-03-14 - jmarianek - vychozi verze;
 */


import wicket.protocol.http.WebApplication;
import wicket.protocol.http.WebSession;

/**
 * Session pro IndexApplication.
 * Obsahuje umisteni DB souboru aplikace.
 */
public final class IndexSession extends WebSession
{
    static final long serialVersionUID = 1L;

    /**
     * Umisteni SQLite3 DB souboru pro persistenci dat aplikace.
     */
    private final String DB_FILE =
        "/home/marianek/local/tomcat7.0/webapps/db/ocpp.db";



    
    public String getDB_FILE() {
        return DB_FILE;
    }





    /**
     * Vraci aktualni instanci.
     */
    public static IndexSession getIndexSession() {
        return (IndexSession) get();
    }





    /**
     * Konstruktor pro vytvoreni session objektu predane aplikace.
     */
    protected IndexSession(final WebApplication application)
    {
        super(application);
    }

}
