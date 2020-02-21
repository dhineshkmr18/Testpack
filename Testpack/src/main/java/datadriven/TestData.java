package datadriven;

import org.testng.annotations.DataProvider;

public class TestData {


	  @DataProvider
	  public static Object[][] dp() {
	    return new Object[][] {
	      new Object[] {"Welcome: Mercury Tours", "mercury", "mercury", "oneway1", "roundtrip" },
	   //   new Object[] {"Welcome: Mercury Tours", "test", "Test", "oneway" },
	    };
	  }

}
