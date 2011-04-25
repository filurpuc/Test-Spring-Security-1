package se.patrik.test.spring.second.services;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;

public interface PatrikService
{
	public Date getDate();
	
	public String echo(String s);
	
	public String getUsername();
	
	public Collection<GrantedAuthority> getAuthorities();
}
