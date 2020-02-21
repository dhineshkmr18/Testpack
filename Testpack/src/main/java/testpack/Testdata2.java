package testpack;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Testdata2 {

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "mgr123", "mgr!23" },
      new Object[] { "mct1", "mct1" },
    };
  }
}
