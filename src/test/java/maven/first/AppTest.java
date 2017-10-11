package maven.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


 
public class AppTest 
{
	@Test
	public void logintest()
	{
		WebDriver driver ;
		
		System.setProperty("webdriver.firefox.marionette", "H:\\Latest jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://github.com/SeleniumHQ/selenium/issues/3884");
		System.out.println("sdsd");
		driver.quit();
		
	}
	


}
