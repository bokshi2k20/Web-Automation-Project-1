package project_locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstProject {

	WebDriver driver;
    @BeforeSuite
	public void driverSetup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
    
    @Test
    public void mainTest() {
    	driver.get("https://www.amazon.com/");
    }
    
    @AfterSuite
    public void driverClose() 
    {
    	driver.quit();
    }
    
    

}
