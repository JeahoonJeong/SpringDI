package com.exe.springdi4;

public class ServiceConsumer {
	
	//생성자 의존성 주입
	MessageService ms;
	
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	
	public void consumserService() {
			
		String message = ms.getMessage();
		
		System.out.println(message);
		
	}
}
