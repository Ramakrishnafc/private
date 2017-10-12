package maven.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class third {

	
	WebDriver driver;
	 @Test
    public void seond()
    {
   	 System.setProperty("webdriver.firefox.marionette", "H:\\Latest jars\\geckodriver.exe");
   	 
   	 driver = new FirefoxDriver();
   	 driver.get("https://www.guru99.com/using-apache-ant-with-selenium.html");
   	 driver.quit();
    }
}
