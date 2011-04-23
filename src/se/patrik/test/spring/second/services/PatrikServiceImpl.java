package se.patrik.test.spring.second.services;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class PatrikServiceImpl implements PatrikService
{
	@Override
	public Date getDate()
	{
		return new Date();
	}

	@Override
	public String echo(String s)
	{
		return "Echo: " + s;
	}
}
