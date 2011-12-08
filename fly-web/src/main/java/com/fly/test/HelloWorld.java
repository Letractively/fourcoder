package com.fly.test;

import org.apache.log4j.Logger;



public class HelloWorld {  
	  
	private static Logger logger = Logger.getLogger("appenderDefalut");
  
    public static void main(String args[]){ 
    	System.out.println("ok");
    	logger.error("ok");
    }  

  
}  