package se.patrik.test.spring.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	private Hello hello;

	public Main(Hello hello)
	{
		setHello(hello);
	}

	public Hello getHello()
	{
		return hello;
	}

	public void setHello(Hello hello)
	{
		this.hello = hello;
	}

	public static void main(String[] args)
	{
		System.out.println("Hejsan!");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"patrik.xml");
		Hello hello = (Hello) context.getBean("hello");
		
		hello.printHello("PPPPPPPPPPPP");
	}
}
