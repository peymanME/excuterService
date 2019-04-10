package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskComponent {
	
	@Autowired
	AsynchronousService asysvc;
	
	public void start() {
		for(int i=0;i<1000; ++i) {
			System.out.print(" i : " + i + "\r\n");
			asysvc.executeAsynchronously(i);
		}
	}

}
