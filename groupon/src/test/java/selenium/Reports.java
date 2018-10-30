package selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("./reports/test.html");
		ExtentReports extent = new ExtentReports();	
		extent.attachReporter(htmlreport);
		ExtentTest logger = extent.createTest("Login Test");
		logger.log(Status.INFO, "this is my first step");
		logger.log(Status.PASS, "this step passed");
		extent.flush();
	}

}
