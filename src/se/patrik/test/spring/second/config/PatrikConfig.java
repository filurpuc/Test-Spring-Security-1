package se.patrik.test.spring.second.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import se.patrik.test.spring.second.services.PatrikService;
import se.patrik.test.spring.second.services.PatrikServiceImpl;

@Configuration
public class PatrikConfig
{
	@Bean
	public PatrikService patrikService()
	{
		return new PatrikServiceImpl();
	}
}
