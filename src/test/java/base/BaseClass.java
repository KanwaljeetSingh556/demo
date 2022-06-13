package base;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.reporters.jq.Main;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.DriverSetUp;
import objects.Login;
import objects.OpenCart;

public class BaseClass 
{

	  ExtentTest child;
	  boolean result;
	 ExtentReports extents;
	  String root;
	  int ran;
	  
	  public  void logReport(boolean flag,String stepName)
	  {
		  if(flag) {
			  child.log(LogStatus.PASS, "success");
		  }
		  
		  else {
			  child.log(LogStatus.FAIL, "fail");
		  }
		  
	  }
	static  ExtentTest parent;
	  
	  public BaseClass() 
	  {
		  try {
			root = new File(".").getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  ran = new Random().nextInt(999);
		  
	  extents = new ExtentReports(root+ "\\Reports\\OpenCart- "+ran+".html"); 
	  parent = extents.startTest("start");
	 
	  }
	
	 
	@Test
public void Test()	
	{
		
		
		child = extents.startTest("open cart");
		parent.appendChild(child);
		
	

	    WebDriver driver = new DriverSetUp().GetDriver();
	    OpenCart oc = new OpenCart(driver); 
	    logReport(oc.navigateOpenCart(),"open cart");
		System.out.println("executed");
		Login l = new Login(driver);
		logReport(l.navigateToLogin(),"navigate");
		logReport(l.FillDetails(),"fill");
		System.out.println("executed");
		
		extents.endTest(parent);
		extents.flush();
		
		
		
		
		
	}

}
