package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderDemo {
  @Test(dataProvider = "data")
  public void testDP(Integer n, String s) {
	  System.out.println(n + " : "  + s);
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] 
	{
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  
  @DataProvider
  public Object[][] createUser() {
    return new Object[][] 
	{
      new Object[] { "Aravinda", "HB" , 56566656},
      new Object[] { "Harrry", "H" , 56566656},
      new Object[] { "Koth", "HMB" , 56566656},
      new Object[] { "Shan", "B" , 56566656},
      new Object[] { "Chid", "H" , 56566656},
    };
  }
  
  @DataProvider
  public Object[][] deleteUser() {
    return new Object[][] 
	{
    	 new Object[] { "Aravinda"},
         new Object[] { "Harrry"},
         new Object[] { "Koth"},
         new Object[] { "Shan"},
         new Object[] { "Chid"},
    };
  }
  
  
  @DataProvider
  public Object[][] searchCompany() {
    return new Object[][] 
	{
    	 new Object[] { "IBM"},
         new Object[] { "Infosys"},
         new Object[] { "Wipro"},
         new Object[] { "ICICI"},
         new Object[] { "HDFC"},
    };
  }
}
