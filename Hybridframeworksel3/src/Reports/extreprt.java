package Reports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extreprt {
	@Test
	public void test1()
	{
		ExtentReports rep = new ExtentReports("./rep/r1.html");
		ExtentTest test = rep.startTest("tc1");
		test.log(LogStatus.PASS,"PASS");
		test.log(LogStatus.SKIP,"fail");
		test.log(LogStatus.FAIL,"skip");
		rep.endTest(test);
		rep.flush();
	}

}
