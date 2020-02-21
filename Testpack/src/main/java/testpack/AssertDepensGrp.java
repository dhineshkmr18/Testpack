package testpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AssertDepensGrp {
  @Test(groups={"reg3"}, dependsOnMethods={"regression3"})
  public void regression1() {
	  
	  System.out.println("Reg1");  
  }
  
  @Test(groups={"reg1"},dependsOnGroups={"reg3"})
  public void regression2() {
	  
	  System.out.println("Reg2");  
  }
  
  @Test(groups={"reg3"})
  public void regression3() {
	  
	  System.out.println("Reg3");  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Launch browser");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Close browser");
  }

}
