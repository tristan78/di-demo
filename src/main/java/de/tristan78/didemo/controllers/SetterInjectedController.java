package de.tristan78.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import de.tristan78.didemo.services.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	@Qualifier("setterGreetingService")
	// bei setter based injection kann @Qualifier auf Methoden-Level (wie hier) oder auf Property-Level (siehe Constructor based) stehen
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}