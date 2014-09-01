package org.zac;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService()
public class Cal {

	@WebMethod(action = "sample_operation")
	public String operation(@WebParam(name = "param_name") String param) {
		// implement the web service operation here
		return param;
	}

	@WebMethod(action = "add")
	public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
		int k = i + j;
		return k;
	}
}