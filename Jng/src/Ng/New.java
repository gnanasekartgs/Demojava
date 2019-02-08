package Ng;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class New {
  @Test
  public void f() {
	  Assert.fail();
  }
  @Test
  public void ff()
  {
	  Assert.assertTrue(true);
  }
  @Test
  public void fff()
  {
	  throw new SkipException("s");
  }
}
