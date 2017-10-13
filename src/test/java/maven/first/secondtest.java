package maven.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class secondtest {

	
	WebDriver driver;
	 @Test

     public void seond()
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	 
    	 driver = new ChromeDriver();
    	 driver.get("https://www.guru99.com/using-apache-ant-with-selenium.html");
    	 driver.quit();
     }
}
