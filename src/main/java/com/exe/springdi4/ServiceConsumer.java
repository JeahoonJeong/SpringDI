package com.exe.springdi4;

public class ServiceConsumer {
	
	//积己磊 狼粮己 林涝
	MessageService ms;
	
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	
	public void consumserService() {
			
		String message = ms.getMessage();
		
		System.out.println(message);
		
	}
}
