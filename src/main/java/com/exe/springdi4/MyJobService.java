package com.exe.springdi4;

import org.springframework.stereotype.Component;

@Component("dummyService")
public class MyJobService implements JobService{

	public void getJob() {
		
		System.out.println("getJob()메소드 테스트 ok");
		
	}
	
	
	
}
