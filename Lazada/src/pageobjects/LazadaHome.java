package pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LazadaHome {

	@Test
	public static void main (String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "A:\\Workspace\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(co);

			
			String baseUrl = "http://www.lazada.com.ph";
	        String actualTitle = "";
	        
	        driver.get(baseUrl);
	      //  ((JavaScriptExecutor)driver).ExecuteScript("window.resizeTo(1024, 768);");
	        actualTitle = driver.getTitle();
	        System.out.println(actualTitle);
			
	        Thread.sleep(500);
	        WebElement lazadaBanner = driver.findElement(By.xpath("//*[@id='topActionHeader']/div/div[2]/div/div[1]/a/img"));
	      
	    assertEquals(true, lazadaBanner);
	       if (lazadaBanner.isDisplayed()){
	    	   System.out.println("It is present");
	       }
	       else
	       {
	    	   System.out.println("Not present");
	       }
	       
	       driver.close();
	}
}
