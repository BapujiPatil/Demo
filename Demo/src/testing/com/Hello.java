package testing.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Hello

	{
	
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Login Successful");
		
		
	}
	@Test(priority=2)
	public void Search()
	{
		System.out.println("Search Successful");
		

}
	@Test(priority=3)
	public void Logout()
	{
		System.out.println("logout Successful");
		
}
	}