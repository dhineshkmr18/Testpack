package testpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class AnnotationsDemo1 {
  
	WebDriver driver;
	
  @Test(dataProvider = "dp", dataProviderClass = TestData.class)
  public void c(String expTitle, String UserName, String Password, String tripType) {
	  	Assert.assertEquals(driver.getTitle(), expTitle);
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		List<WebElement> trip=driver.findElements(By.name("tripType"));
		for(WebElement t:trip)
		{
			if (t.getAttribute("value").equals(tripType))
			{
				t.click();
			}
		}
		driver.findElement(By.linkText("SIGN-OFF")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  }

}
