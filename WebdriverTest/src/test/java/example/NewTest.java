package example;		

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--start-maximized");
			System.setProperty("webdriver.chrome.driver", "A:\\Workspace\\chromedriver.exe");
			driver = new ChromeDriver(co);
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	