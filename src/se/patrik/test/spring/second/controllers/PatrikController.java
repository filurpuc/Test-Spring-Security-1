package se.patrik.test.spring.second.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PatrikController {
	private static Logger logger = Logger.getLogger(PatrikController.class);
	
	@RequestMapping({"/","/patrik"})
    public String home() {
        System.out.println("HomeController: Passing through...");
        
        logger.debug("Hej!");
        return "patrik";
    }
}
