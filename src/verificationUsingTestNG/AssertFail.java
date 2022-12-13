package verificationUsingTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertFail 
{
  @Test
  public void AssertFail() 
  {
	  Assert.fail();
  }
}
