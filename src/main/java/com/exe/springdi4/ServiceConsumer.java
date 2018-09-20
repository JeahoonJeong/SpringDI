package com.exe.springdi4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("serviceConsumer")
public class ServiceConsumer {
	
	@Autowired
	@Qualifier("messageService")
	MessageService ms;
	
	@Autowired
	TimeService ts;
	
	@Autowired
	JobService js;

	/*//생성자 의존성 주입
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	//메소드(setter) 의존성 주입
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}
	
	public void setJobService(JobService js) {
		this.js = js;
	}*/
	
	public void consumserService() {
			
		String message = ms.getMessage();
		
		System.out.println(message);
		
		//메소드
		String time = ts.getTimeService();
		System.out.println(time);
	
		js.getJob();
		
	}
	
	
}
