# OCPP Web Server

Web app for communication with car chargers using SOAP OCPP 1.6 communication protocol.
Communication stubs were generated using AXIS2 FW.
SQLite DB persistence and Wicket administration GUI included.
Some messages are not finished, and there is also some work on GUI and persistence needed.
For build use maven2

`$ mvn2 package`

and them put war into your java servlet container (tomcat, ...).

