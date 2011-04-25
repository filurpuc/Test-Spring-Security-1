package se.patrik.test.spring.second.services;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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
		return "Echooooo: " + s;
	}

	@Override
	public String getUsername()
	{
		String username;
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
		{
			username = ((UserDetails) principal).getUsername();
		} else
		{
			username = principal.toString();
		}

		return username;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities()
	{
		return SecurityContextHolder.getContext().getAuthentication()
				.getAuthorities();
	}

}
