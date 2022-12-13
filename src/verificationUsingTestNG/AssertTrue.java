package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue
{
  @Test
  public void trueUse()
  {
	 boolean a =false;
	 
	 //if a is true then TC should be passed
	 
	 Assert.assertTrue(a,"TC is failed a is false");
  }
}
