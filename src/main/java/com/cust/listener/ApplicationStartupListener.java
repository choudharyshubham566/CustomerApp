package com.cust.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.cust.annotation.LogCustomer;
import com.cust.service.ReferenceDataService;

public class ApplicationStartupListener implements ApplicationListener<ApplicationEvent> {

	@Autowired
	private ReferenceDataService referenceDataService;
	
	@LogCustomer
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		referenceDataService.loadReferenceData();
	}

}