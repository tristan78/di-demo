package de.tristan78.didemo.controllers;

import de.tristan78.didemo.services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}