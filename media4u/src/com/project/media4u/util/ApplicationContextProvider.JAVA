package com.project.media4u.util;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware {
	private static ApplicationContext applicationContext;
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
///here is the appliction context
	}

	@Override
	public void setApplicationContext(ApplicationContext context) {
		applicationContext=context;
		
	}

}
