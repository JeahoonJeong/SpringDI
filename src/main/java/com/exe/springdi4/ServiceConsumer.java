package com.exe.springdi4;

public class ServiceConsumer {
	
	
	MessageService ms;
	TimeService ts;
	JobService js;

	//������ ������ ����
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	//�޼ҵ�(setter) ������ ����
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}
	
	public void setJobService(JobService js) {
		this.js = js;
	}
	
	public void consumserService() {
			
		String message = ms.getMessage();
		
		System.out.println(message);
		
		//�޼ҵ�
		String time = ts.getTimeService();
		System.out.println(time);
	
		js.getJob();
		
	}
	
	
}
