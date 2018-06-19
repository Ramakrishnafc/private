package maven.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class third {

	
	WebDriver driver;
	@BeforeTest 
	@Parameters ("browser")
    public void seond(String browser)
    {
   	 System.setProperty("webdriver.firefox.marionette", "H:\\Latest jars\\geckodriver.exe");
   	 
   	 driver = new FirefoxDriver();
   	 driver.get("https://www.guru99.com/using-apache-ant-with-selenium.html");
   	 System.out.println(System.currentTimeMillis());
   	 driver.quit();
    }
    
//    public void seonds()
//    {
//   	 System.setProperty("webdriver.firefox.marionette", "H:\\Latest jars\\geckodriver.exe");
//   	 
//   	 driver = new FirefoxDriver();
//   	 driver.get("https://www.guru99.com/using-apache-ant-with-selenium.html");
//   	 System.out.println(System.currentTimeMillis());
//   	 driver.quit();
//    }
}
