package verificationUsingTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertNotNull 
{
  @Test
  public void MyTC() 
  {
	  String a ="ABC";
	  
	  //TC should be passed if a value is not null
	  
	  Assert.assertNotNull(a,"A value is null,TC is failed");
  }
}
