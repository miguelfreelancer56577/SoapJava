package com.mangelt.wsServer.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mangelt.wsServer.model.User;

/**
* The annotation @WebService signals that this is the
* SEI (Service Endpoint Interface). @WebMethod signals
* that each method is a service operation.
*
* The @SOAPBinding annotation impacts the under-the-hood
* construction of the service contract, the WSDL
* (Web Services Definition Language) document. Style.RPC
* simplifies the contract and makes deployment easier.
*/

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface TimeServer {
	@WebMethod
	String getTimeAsString();
	@WebMethod
	long getTimeAsElapsed();
	@WebMethod
	User getUser();
}
