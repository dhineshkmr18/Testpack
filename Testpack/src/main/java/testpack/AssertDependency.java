package testpack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AssertDependency {
  @Test
  public void demotest1() {
	  
	  //Assert.assertEquals("a", "b");  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals("a", "b");
	  System.out.println("validate test1");
	  sa.assertAll();
  }
  
  @Test(dependsOnMethods= {"demotest1"}, alwaysRun=true)
  
  public void demotest2()
  {
	  System.out.println("Validate test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("launch");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Close Application");
  }

}
