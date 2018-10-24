package de.tristan78.didemo.controllers;

import de.tristan78.didemo.services.GreetingService;

public class ConstructorInjectedController {

	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}