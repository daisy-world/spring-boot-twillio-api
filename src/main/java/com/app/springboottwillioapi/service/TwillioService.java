package com.app.springboottwillioapi.service;

public interface TwillioService {

	public void sendSms(String to, String from, String body);
	
	
	public void makeCall(String from, String to);
	
	

}
