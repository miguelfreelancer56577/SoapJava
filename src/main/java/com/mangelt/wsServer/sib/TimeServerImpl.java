package com.mangelt.wsServer.sib;

import java.util.Date;

import javax.jws.WebService;

import com.mangelt.wsServer.model.User;
import com.mangelt.wsServer.sei.TimeServer;

/**
* The @WebService property endpointInterface links the
* SIB (this class) to the SEI (ch01.ts.TimeServer).
* Note that the method implementations are not annotated
* as @WebMethods.
*/

@WebService(endpointInterface = "com.mangelt.wsServer.sei.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		// TODO return a date since string 
		return new  Date().toString();
	}

	@Override
	public long getTimeAsElapsed() {
		// TODO return a date to time
		return new Date().getTime();
	}
	
	@Override
	public User getUser(){
		return new User("Miguel", "Torres");
	}

}
