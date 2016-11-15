package com.mangelt.wsServer.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.mangelt.wsServer.sei.TimeServer;

public class TimeClient {
	
	public static void main(String args[ ]) throws Exception {
		URL url = new URL("http://127.0.0.1:9091/ts?wsdl");
		// Qualified name of the service:
		// 1st arg is the service URI
		// 2nd is the service name published in the WSDL
		QName qname = new QName("http://sib.wsServer.mangelt.com/", "TimeServerImplService");
		// Create, in effect, a factory for the service.
		Service service = Service.create(url, qname);
		// Extract the endpoint interface, the service "port".
		TimeServer eif = service.getPort(TimeServer.class);
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
		System.out.println(eif.getUser());
	}

}
