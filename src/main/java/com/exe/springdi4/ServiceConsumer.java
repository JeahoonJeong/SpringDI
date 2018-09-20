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

	/*//������ ������ ����
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	//�޼ҵ�(setter) ������ ����
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}
	
	public void setJobService(JobService js) {
		this.js = js;
	}*/
	
	public void consumserService() {
			
		String message = ms.getMessage();
		
		System.out.println(message);
		
		//�޼ҵ�
		String time = ts.getTimeService();
		System.out.println(time);
	
		js.getJob();
		
	}
	
	
}
