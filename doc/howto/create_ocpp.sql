/*
 * create_ocpp.sql
 * Zakladaci skript ocpp.db pro aplikaci OCPP Web Server.
 * Umisteni viz gui.index.IndexSession.java
 *
 * 2020-03-14 - jmarianek - v1 - dev
 *
 * TODO: entita trans pro transakce 
 *
 */


-- managed devices
create table dev (
    id INTEGER PRIMARY KEY, -- pk
    connector INTEGER not null default 1, -- charging connector
    ip TEXT not null, -- ip adress of charger
    model TEXT,
    vendor TEXT,
    status TEXT not null,
    created_on TEXT,
    updated_on TEXT
);


CREATE TRIGGER dev_ins_trig AFTER INSERT ON dev
BEGIN
update dev SET created_on = datetime('now') WHERE id = NEW.id;
END;


CREATE TRIGGER dev_up_trig AFTER UPDATE ON dev
BEGIN
update dev SET updated_on = datetime('now') WHERE id = NEW.id;
END;


create unique index dev_idx
on dev(ip, connector);
