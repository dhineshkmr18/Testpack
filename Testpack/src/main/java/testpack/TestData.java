package testpack;

import org.testng.annotations.DataProvider;

public class TestData {


	  @DataProvider
	  public static Object[][] dp() {
	    return new Object[][] {
	      new Object[] {"Welcome: Mercury Tours", "mercury", "mercury", "oneway" },
	      new Object[] {"Welcome: Mercury Tours", "test", "Test", "oneway" },
	    };
	  }

}
