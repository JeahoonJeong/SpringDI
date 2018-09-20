package com.exe.springdi4;

public class ServiceConsumer {
	
	
	MessageService ms;
	TimeService ts;
	JobService js;

	//생성자 의존성 주입
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	//메소드(setter) 의존성 주입
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}
	
	public void setJobService(JobService js) {
		this.js = js;
	}
	
	public void consumserService() {
			
		String message = ms.getMessage();
		
		System.out.println(message);
		
		//메소드
		String time = ts.getTimeService();
		System.out.println(time);
	
		js.getJob();
		
	}
	
	
}
