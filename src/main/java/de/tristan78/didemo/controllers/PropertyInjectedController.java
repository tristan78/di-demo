package de.tristan78.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.tristan78.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	// hier sollte eigentlich GreetingServiceImpl benutzt werden. Wenn die Variable aber so heißt, macht Spring reflection und wirft keinen Fehler!
	public GreetingService greetingServiceImpl;

	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
	
}
