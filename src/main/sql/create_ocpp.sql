/*
 * create_ocpp.sql
 * Zakladaci skript ocpp.db pro aplikaci OCPP Web Server.
 * Umisteni viz gui.index.IndexSession.java,
 * resp. env_var DB_FILE (priorita).
 *
 * 2020-03-14 - jmarianek - v1 - dev
 * 2020-03-19 - jmarianek - trans;
 *
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



-- transactions
create table trans (
    id INTEGER PRIMARY KEY, -- pk
    dev_id INTEGER not null, -- fk dev.id
    event TEXT, -- hodnoty 'start'/'stop'
    id_tag TEXT, -- viz zprava start/stop transaction
    rfid TEXT, 
    meter TEXT, -- stav meridla
    trans_date TEXT, -- datum start/stop transakce 
    created_on TEXT, -- datum vytv. zaznamu
    updated_on TEXT -- datum modif. zaznamu
);

-- FK nefunguje, nutno drzet konzistenci v aplikaci
-- (nebo pouzit PRAGMA foreign_keys = ON)
ALTER TABLE trans ADD CONSTRAINT trans_dev_fk
FOREIGN KEY (dev_id)
REFERENCES dev (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

CREATE TRIGGER trans_ins_trig AFTER INSERT ON trans
BEGIN
update trans SET created_on = datetime('now') WHERE id = NEW.id;
END;


CREATE TRIGGER trans_up_trig AFTER UPDATE ON trans
BEGIN
update trans SET updated_on = datetime('now') WHERE id = NEW.id;
END;

