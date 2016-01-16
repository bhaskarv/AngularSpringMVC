package org.learn.sys.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greet")
public class GreetingController {

	private final String template = "Hello %s!";
	private final AtomicInteger counter = new AtomicInteger();
	
	//@RequestMapping(value="/greet", method=RequestMethod.GET)
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Greeting greet(@RequestParam("name") String name) {
		System.out.println(" GREETING CONTROLLER IS CALLED");
		return new Greeting(String.format(template, name), counter.incrementAndGet());
	}
	
}
