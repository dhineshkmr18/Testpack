package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestStep {
	
	WebDriver driver;
	
	public TestStep(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void inputByName(String objectName, String testData)
	{
		if(driver.findElements(By.name(objectName)).size()==1)
		{
			driver.findElement(By.name(objectName)).sendKeys(testData);
		}
		else{
			Assert.fail("Unable to identify object"+objectName);
		}
	}
	
	public void clickByName(String objectName)
	{
		if(driver.findElements(By.name(objectName)).size()==1)
		{
			driver.findElement(By.name(objectName)).click();
		}
		else{
			Assert.fail("Unable to identify object"+objectName);
		}
	}
	
	public void rdButtonname(String objectName, String testData)
	{
		List<WebElement> trip = driver.findElements(By.name(objectName));
		for (WebElement t:trip)
		{
			if (t.getAttribute("value").equals(testData))
			{
				t.click();
			}
			else{
				//Assert.fail("Unable to identify object"+ objectName);
				SoftAssert sa = new SoftAssert();
				sa.assertNotEquals(objectName, testData);
				//System.out.println("Unable to identify" + objectName);
			}
			
		}
	}

}
