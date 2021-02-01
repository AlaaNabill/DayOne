package tests;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.Home;
import utilities.TestBase;

public class FirstTest extends TestBase{
	
	
	
	@Test(enabled=true , priority = 1)
	public void tc1()
	{
		
		Home.Url();
		System.out.println(Home.Url);
		
		Home.Register();
		
		Assert.assertEquals("https://demo.nopcommerce.com/", Home.Url , "The two URLs are equal");
		Assert.assertNotSame("https://demo.nopcommerce.com/", Home.Url ,"The two URLs are equal" );
		
		
		
		//action.moveToElement(Home.leftItemFromMostSelling).click().perform();
		
		
		}
}
