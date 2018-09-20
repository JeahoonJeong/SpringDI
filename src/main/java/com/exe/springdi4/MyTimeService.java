package com.exe.springdi4;

import java.text.DateFormat;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component("timeService")
public class MyTimeService implements TimeService{

	public String getTimeService() {
		//출력형식
		DateFormat dateFormat = 
				DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String now = dateFormat.format(new Date());
		
		return now;
	}

	
	
}
