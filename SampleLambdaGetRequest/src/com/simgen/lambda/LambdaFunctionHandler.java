package com.simgen.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.amazonaws.services.lambda.runtime.events.S3Event;

/*
 * This is sample get request . API gateway get request will be mapped to this lambda function
 * 
 * 
 */
public class LambdaFunctionHandler implements RequestHandler<S3Event, String> {

	  @Override
	    public String handleRequest(S3Event input, Context context) {
	        return printMessage();
	    }
	    
	    public static String printMessage(){
	    	return "Hello From get request " ; 
	    }


}
