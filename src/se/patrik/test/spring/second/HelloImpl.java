package se.patrik.test.spring.second;

public class HelloImpl implements Hello
{
	private String helloString;

	public String getHelloString()
	{
		return helloString;
	}

	public void setHelloString(String helloString)
	{
		this.helloString = helloString;
	}

	@Override
	public void printHello(String s)
	{
		System.out.println("Hello " + s);
		System.out.println("helloString=" + getHelloString());
		System.out.println(new java.util.Date());
	}
}
