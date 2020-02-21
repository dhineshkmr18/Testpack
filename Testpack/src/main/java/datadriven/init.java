package datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.TestStep;
import repository.NewToursRepository;


public class init {
		WebDriver driver;
		NewToursRepository nt;
		TestStep ts;
		
	  @Test(dataProvider = "dp", dataProviderClass = TestData.class)
	  public void c(String expTitle, String UserName, String Password, String tripType, String tripType1) {
		  	Assert.assertEquals(driver.getTitle(), expTitle);
		  	ts.inputByName(nt.txtUserName, UserName);
			//driver.findElement(By.name(nt.txtUserName)).sendKeys(UserName);
		  	ts.inputByName(nt.txtPassword, Password);
			//driver.findElement(By.name(nt.txtPassword)).sendKeys(Password);
		  	
		  	ts.clickByName(nt.btnLogin);
			//driver.findElement(By.name(nt.btnLogin)).click();
		  			  	
			ts.rdButtonname(nt.radTripType, tripType);
		  	/*List<WebElement> trip=driver.findElements(By.name(nt.radTripType));
			for(WebElement t:trip)
			{
				if (t.getAttribute("value").equals(tripType))
				{
					t.click();
				}
			}*/
			
			ts.rdButtonname(nt.radTripType, tripType1);
			driver.findElement(By.linkText(nt.lnkSignOff)).click();
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "D:\\software\\Jar\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			ts= new TestStep(driver);
			driver.get("http://newtours.demoaut.com/");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
		  }

}
