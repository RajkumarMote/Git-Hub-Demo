package testNgxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing3 
{
  @Test (groups = "un")
  public void A()
   {
	  Reporter.log("A TC is running", true); 
   }
  
  @Test (groups = "funds")
  public void C() 
  {
	  Reporter.log("C TC is running", true);  
  }
  
  @Test
  public void D() 
  {
	  Reporter.log("D TC is running", true); 
  }
  
  @Test
  public void B() 
  {
	  Reporter.log("B TC is running", true); 
  }

}
