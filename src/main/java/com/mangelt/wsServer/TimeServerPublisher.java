package com.mangelt.wsServer;

import javax.xml.ws.Endpoint;

import com.mangelt.wsServer.sib.TimeServerImpl;

public class TimeServerPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://127.0.0.1:9091/ts", new TimeServerImpl());
	}

}
