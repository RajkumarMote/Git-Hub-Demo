package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse
{
  @Test
  public void MyTC()
  {
	  boolean a =false;
	  
	  //TC should be passed if a is false
	  
	  Assert.assertFalse(a,"A is true TC is failed");
  }
}
