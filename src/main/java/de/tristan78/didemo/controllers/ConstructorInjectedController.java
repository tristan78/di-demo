package de.tristan78.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.tristan78.didemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;

	@Autowired
	// bei Constructor based injection ist das @Autowired nicht notwenig, aber besser lesbar
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}