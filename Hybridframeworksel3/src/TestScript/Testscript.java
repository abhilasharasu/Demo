package TestScript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import Generic_scripts.Base_Test;
import Pom_script.Pom1;

public class Testscript extends Base_Test
{
@Test(dataProvider="testdata")
public void Test(String d1,String d2)
{
	Pom1 p = new Pom1(driver);
	p.username(d1);;
	p.password(d2);;
	Thread.sleep(2000);
	p.click_button();
	Assert.fail();
}
@DataProvider(name="testdata")
public Object [] [] createData1()
{
	return new Object [] []
			{
		{"abhi","123"},
		{"abhilash","111"},
		
			};
}
}
