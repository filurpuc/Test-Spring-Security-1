package se.patrik.test.spring.second.controllers;

import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import se.patrik.test.spring.second.services.PatrikService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PatrikController
{
	private static Logger logger = Logger.getLogger(PatrikController.class);

	private PatrikService service;

    @Autowired
	//@Inject
	public PatrikController(PatrikService patrikService)
	{
		this.service = patrikService;
	}

	@RequestMapping(
	{ "/", "/patrik", "home" })
	public String home(Map<String, Object> model)
	{
		System.out.println("HomeController: Passing through...");

		logger.debug("Hej svejs!!");

		Date now = new Date();

		model.put("datum", now.toString());
		model.put("echo", "just det");
		return "patrik";
	}
}
