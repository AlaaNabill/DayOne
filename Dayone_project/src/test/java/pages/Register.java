package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.TestBase;

public class Register extends TestBase{

//	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//-----------Paths-------------
	@FindBy(id = "FirstName")
	public static WebElement FirstName;
	
	@FindBy(id = "LastName")
	public static WebElement LastName;
	
	@FindBy(id = "Email")
	public static WebElement Email;
	
	@FindBy(id = "Password")
	public static WebElement Password;
	
	@FindBy(id = "ConfirmPassword")
	public static WebElement ConfirmPassword;
	
	
	//------------Actions-----------
	public static void FirstName(){
		FirstName.sendKeys("Alaa");
	}
	
	public static void LastName(){
		LastName.sendKeys("Nabil");		
	}
	
	public static void Email(){
		Email.sendKeys("alaa.mahmoud@vodafone.com");
	}
	
	public static void Password(){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Password);
		Password.sendKeys("12345678");
	}
	
	public static void ConfirmPassword(){
		
		ConfirmPassword.sendKeys("12345678");
	}
	
}
