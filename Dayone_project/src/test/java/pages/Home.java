package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;

public class Home extends TestBase{
	
	//----------------------------------Home Page Elements---------------------------------------
	
	//website url
	String url = driver.getCurrentUrl();
	public static WebElement Url;
	
	//Register button
	
	@FindBy(xpath = "xpath=//a[contains(.,'Register')]")
	public static WebElement Register;
	
    //=======================actions================================
	
	
public static void Url() {
		
		Url.getText();
		
	}

public static void Register(){
	
	Register.click();
}
		
	
	
    //======================================================================================
    public Home(WebDriver driver)
    {
          this.driver = driver;
          PageFactory.initElements(driver, this);
 }


	
}
