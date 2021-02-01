//Assignment 2(check forgot email)


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2 {

	public static void main(String[] args) {
		
	
			WebDriver driver = new ChromeDriver();
		
			String chromepath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";// 	
			System.setProperty("webdriver.chrome.driver", chromepath);
			
			
            driver.navigate().to("https://www.google.com.eg");
            driver.manage().window().maximize();
            
            driver.findElement(By.linkText("English")).click();
            driver.findElement(By.cssSelector("a[href*='https://accounts.google.com/ServiceLogin']")).click();
            driver.findElement(By.cssSelector("button[jsname='Cuz2Ue']")).click();
            
            String ActualResult=driver.getCurrentUrl();
            String ExpectedResut="/signin/v2/fogotemail";
            
            
            System.out.println(ActualResult.contains(ExpectedResut));
           driver.quit();
	}

} 
