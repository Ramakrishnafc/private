package maven.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AppTest {

	
	WebDriver driver;
	
	
	 @Test
    public void seond() throws InterruptedException
    {
   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	 
   	 driver = new ChromeDriver();
   	 driver.get("http://rajamusicbank.com/person_type_new.php?alpbet=&action=Lyrics-Writers&id=6&start=0");
   	 String Purl;
   	 int size;
   	 int asizeonnextpage;
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   	 
   	do {
	          		 
        size = driver.findElements(By.xpath(".//*[@id='persons-image1']/a")).size();
        Purl= driver.getCurrentUrl();
        size =1;
      	 for(int i=1;i<=size;i++)
      	 {      
       	
      		driver.findElement(By.xpath("(.//*[@id='persons-image1']/a)["+i+"]")).click();
      		Thread.sleep(2000);

      		System.out.println("-----------***********----------");
      		 
  		     System.err.println(driver.findElement(By.xpath(".//*[@id='persons-image']")).getText());
  		     asizeonnextpage= driver.findElements(By.xpath("(.//*[@id='songs-list']/span/a)")).size();
      		 do {
      			asizeonnextpage=1;
    //  		   System.out.println(asizeonnextpage);
      	      for(int j=1;j<=asizeonnextpage;j++)
      		  {
      		   System.out.println(driver.findElement(By.xpath("(.//*[@id='songs-list']/span/a)["+j+"]")).getAttribute("href"));
      		  }
      		
      		    Thread.sleep(2000);
      		    try{
         	    driver.findElement(By.xpath(".//td/a[contains(text(),'Next')]")).click();
      		    }
      		    catch(Exception e)
      		    {
      		    	System.out.println("only one page");
      		    }
      		    		
      		  } while(driver.findElements(By.xpath(".//td/a[contains(text(),'Next')]")).size()!=0);
      	  
//      		 System.out.println(Purl);
         	 driver.get(Purl);
   	     }
      	 
      	 
      	 Thread.sleep(2000);
      	 
      	 driver.findElement(By.xpath(".//td/a[contains(text(),'Next')]")).click();
       }while(driver.findElements(By.xpath(".//td/a[contains(text(),'Next')]")).size()!=0);
      	 
//   	driver.quit();
      	 
   	 
    }
	 
//    @Test
	 public void seondww() throws InterruptedException
	    {
	   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	 
//	   	 driver = new ChromeDriver();
	   	 driver.get("http://rajamusicbank.com/person_type_new.php?alpbet=&action=Lyrics-Writers&id=6&start=0");
	   	 String Purl;
	   	 int size;
	   	 int asizeonnextpage;
	     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	   	 
	   	do {
		          		 
	        size =1; //driver.findElements(By.xpath(".//*[@id='persons-image1']/a")).size();
	        Purl= driver.getCurrentUrl();
	        
	      	 for(int i=1;i<=size;i++)
	      	 {      
	       	
	      		driver.findElement(By.xpath("(.//*[@id='persons-image1']/a)["+i+"]")).click();
	      		Thread.sleep(2000);

	      		System.out.println("-----------***********----------");
	      		 
	  		     System.err.println(driver.findElement(By.xpath(".//*[@id='persons-image']")).getText());
	  		     asizeonnextpage= driver.findElements(By.xpath("(.//*[@id='songs-list']/span/a)")).size();
	      		 do {
	      			
	    //  		   System.out.println(asizeonnextpage);
	      	      for(int j=1;j<=asizeonnextpage;j++)
	      		  {
	      		   System.out.println(driver.findElement(By.xpath("(.//*[@id='songs-list']/span/a)["+j+"]")).getAttribute("href"));
	      		  }
	      		
	      		    Thread.sleep(2000);
	      		    try{
	         	    driver.findElement(By.xpath(".//td/a[contains(text(),'Next')]")).click();
	      		    }
	      		    catch(Exception e)
	      		    {
	      		    	System.out.println("only one page");
	      		    }
	      		    		
	      		  } while(driver.findElements(By.xpath(".//td/a[contains(text(),'Next')]")).size()!=0);
	      	  
//	      		 System.out.println(Purl);
	         	 driver.get(Purl);
	   	     }
	      	 
	      	 
	      	 Thread.sleep(2000);
	      	 
	      	 driver.findElement(By.xpath(".//td/a[contains(text(),'Next')]")).click();
	       }while(driver.findElements(By.xpath(".//td/a[contains(text(),'Next')]")).size()!=0);
	      	 
//	   	driver.quit();
	      	 
	   	 
	    }

	 
	 
}
