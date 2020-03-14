
/**
 * CentralSystemServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.3  Built on : Nov 12, 2010 (02:24:07 CET)
 */
        package axis2server;

        /**
        *  CentralSystemServiceMessageReceiverInOut message receiver
        */

        public class CentralSystemServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CentralSystemServiceSkeleton skel = (CentralSystemServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        

            if("stopTransaction".equals(methodName)){
                
                ocpp.StopTransactionResponseDocument stopTransactionResponse71 = null;
	                        ocpp.StopTransactionRequestDocument wrappedParam =
                                                             (ocpp.StopTransactionRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.StopTransactionRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               stopTransactionResponse71 =
                                                   
                                                   
                                                         skel.stopTransaction(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), stopTransactionResponse71, false);
                                    } else 

            if("statusNotification".equals(methodName)){
                
                ocpp.StatusNotificationResponseDocument statusNotificationResponse74 = null;
	                        ocpp.StatusNotificationRequestDocument wrappedParam =
                                                             (ocpp.StatusNotificationRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.StatusNotificationRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               statusNotificationResponse74 =
                                                   
                                                   
                                                         skel.statusNotification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), statusNotificationResponse74, false);
                                    } else 

            if("authorize".equals(methodName)){
                
                ocpp.AuthorizeResponseDocument authorizeResponse77 = null;
	                        ocpp.AuthorizeRequestDocument wrappedParam =
                                                             (ocpp.AuthorizeRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.AuthorizeRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               authorizeResponse77 =
                                                   
                                                   
                                                         skel.authorize(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), authorizeResponse77, false);
                                    } else 

            if("startTransaction".equals(methodName)){
                
                ocpp.StartTransactionResponseDocument startTransactionResponse80 = null;
	                        ocpp.StartTransactionRequestDocument wrappedParam =
                                                             (ocpp.StartTransactionRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.StartTransactionRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               startTransactionResponse80 =
                                                   
                                                   
                                                         skel.startTransaction(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), startTransactionResponse80, false);
                                    } else 

            if("firmwareStatusNotification".equals(methodName)){
                
                ocpp.FirmwareStatusNotificationResponseDocument firmwareStatusNotificationResponse83 = null;
	                        ocpp.FirmwareStatusNotificationRequestDocument wrappedParam =
                                                             (ocpp.FirmwareStatusNotificationRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.FirmwareStatusNotificationRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               firmwareStatusNotificationResponse83 =
                                                   
                                                   
                                                         skel.firmwareStatusNotification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), firmwareStatusNotificationResponse83, false);
                                    } else 

            if("bootNotification".equals(methodName)){
                
                ocpp.BootNotificationResponseDocument bootNotificationResponse86 = null;
	                        ocpp.BootNotificationRequestDocument wrappedParam =
                                                             (ocpp.BootNotificationRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.BootNotificationRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bootNotificationResponse86 =
                                                   
                                                   
                                                         skel.bootNotification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bootNotificationResponse86, false);
                                    } else 

            if("heartbeat".equals(methodName)){
                
                ocpp.HeartbeatResponseDocument heartbeatResponse89 = null;
	                        ocpp.HeartbeatRequestDocument wrappedParam =
                                                             (ocpp.HeartbeatRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.HeartbeatRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               heartbeatResponse89 =
                                                   
                                                   
                                                         skel.heartbeat(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), heartbeatResponse89, false);
                                    } else 

            if("meterValues".equals(methodName)){
                
                ocpp.MeterValuesResponseDocument meterValuesResponse92 = null;
	                        ocpp.MeterValuesRequestDocument wrappedParam =
                                                             (ocpp.MeterValuesRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.MeterValuesRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               meterValuesResponse92 =
                                                   
                                                   
                                                         skel.meterValues(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), meterValuesResponse92, false);
                                    } else 

            if("dataTransfer".equals(methodName)){
                
                ocpp.DataTransferResponseDocument dataTransferResponse95 = null;
	                        ocpp.DataTransferRequestDocument wrappedParam =
                                                             (ocpp.DataTransferRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.DataTransferRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               dataTransferResponse95 =
                                                   
                                                   
                                                         skel.dataTransfer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), dataTransferResponse95, false);
                                    } else 

            if("diagnosticsStatusNotification".equals(methodName)){
                
                ocpp.DiagnosticsStatusNotificationResponseDocument diagnosticsStatusNotificationResponse98 = null;
	                        ocpp.DiagnosticsStatusNotificationRequestDocument wrappedParam =
                                                             (ocpp.DiagnosticsStatusNotificationRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ocpp.DiagnosticsStatusNotificationRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               diagnosticsStatusNotificationResponse98 =
                                                   
                                                   
                                                         skel.diagnosticsStatusNotification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), diagnosticsStatusNotificationResponse98, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //

            private  org.apache.axiom.om.OMElement  toOM(ocpp.StopTransactionRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.StopTransactionRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.StopTransactionResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.StopTransactionResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.ChargeBoxIdentityDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.ChargeBoxIdentityDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.StatusNotificationRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.StatusNotificationRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.StatusNotificationResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.StatusNotificationResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.AuthorizeRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.AuthorizeRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.AuthorizeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.AuthorizeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.StartTransactionRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.StartTransactionRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.StartTransactionResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.StartTransactionResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.FirmwareStatusNotificationRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.FirmwareStatusNotificationRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.FirmwareStatusNotificationResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.FirmwareStatusNotificationResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.BootNotificationRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.BootNotificationRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.BootNotificationResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.BootNotificationResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.HeartbeatRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.HeartbeatRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.HeartbeatResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.HeartbeatResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.MeterValuesRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.MeterValuesRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.MeterValuesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.MeterValuesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.DataTransferRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.DataTransferRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.DataTransferResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.DataTransferResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.DiagnosticsStatusNotificationRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.DiagnosticsStatusNotificationRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(ocpp.DiagnosticsStatusNotificationResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final ocpp.DiagnosticsStatusNotificationResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.StopTransactionResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.StatusNotificationResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.AuthorizeResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.StartTransactionResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.FirmwareStatusNotificationResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.BootNotificationResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.HeartbeatResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.MeterValuesResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.DataTransferResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ocpp.DiagnosticsStatusNotificationResponseDocument param, boolean optimizeContent)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (ocpp.StopTransactionRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.StopTransactionRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.StopTransactionRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.StopTransactionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.StopTransactionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.StopTransactionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.StatusNotificationRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.StatusNotificationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.StatusNotificationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.StatusNotificationResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.StatusNotificationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.StatusNotificationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.AuthorizeRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.AuthorizeRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.AuthorizeRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.AuthorizeResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.AuthorizeResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.AuthorizeResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.StartTransactionRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.StartTransactionRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.StartTransactionRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.StartTransactionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.StartTransactionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.StartTransactionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.FirmwareStatusNotificationRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.FirmwareStatusNotificationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.FirmwareStatusNotificationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.FirmwareStatusNotificationResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.FirmwareStatusNotificationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.FirmwareStatusNotificationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.BootNotificationRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.BootNotificationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.BootNotificationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.BootNotificationResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.BootNotificationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.BootNotificationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.HeartbeatRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.HeartbeatRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.HeartbeatRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.HeartbeatResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.HeartbeatResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.HeartbeatResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.MeterValuesRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.MeterValuesRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.MeterValuesRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.MeterValuesResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.MeterValuesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.MeterValuesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.DataTransferRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.DataTransferRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.DataTransferRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.DataTransferResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.DataTransferResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.DataTransferResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.DiagnosticsStatusNotificationRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.DiagnosticsStatusNotificationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.DiagnosticsStatusNotificationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.DiagnosticsStatusNotificationResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.DiagnosticsStatusNotificationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.DiagnosticsStatusNotificationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (ocpp.ChargeBoxIdentityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return ocpp.ChargeBoxIdentityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    