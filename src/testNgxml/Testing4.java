package testNgxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing4 
{
	@Test (groups = {"un","funds"})
	  public void E() 
	  {
		  Reporter.log("E TC is running", true); 
	  }
	  
	  @Test
	  public void F() 
	  {
		  Reporter.log("F TC is running", true);  
	  }
	  
	  @Test (groups = "un")
	  public void G() 
	  {
		  Reporter.log("G TC is running", true); 
	  }
	  
	  @Test
	  public void H() 
	  {
		  Reporter.log("H TC is running", true); 
	  }
}
