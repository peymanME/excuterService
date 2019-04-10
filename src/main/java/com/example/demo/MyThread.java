package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyThread implements Runnable {
	
    private int param;
    
    public void setParam( int i ){
        this.param = i;
    }

    @Override
    public void run() {
    	System.out.print(" this is thread \r\n" +  this.param);
    	try {
			TimeUnit.SECONDS.sleep(1);
	    	System.out.print(" after 3 seconds \r\n" +  this.param);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    }
}