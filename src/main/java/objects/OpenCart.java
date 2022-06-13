package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverSetUp;
import utilities.ReadPropertiesFile;

public class OpenCart
{
	DriverSetUp set;
	ReadPropertiesFile rp;
	WebDriver driver;
	ReadPropertiesFile rd ;
	
	public OpenCart(WebDriver driver)
	{
		
	 rd = new ReadPropertiesFile("Properties/assignment.properties");
	 this.driver = driver;
		
	}
	
	
	
	
	public boolean navigateOpenCart() 
	
	{
		
		
		
		driver.manage().window().maximize();
		driver.get(rd.ReadData("URL"));
		driver.switchTo().activeElement().findElement(By.linkText("FEATURES")).click();	
		driver.switchTo().activeElement().findElement(By.linkText("DEMO")).click();	
		driver.navigate().back();
		driver.navigate().forward();
		driver.switchTo().activeElement().findElement(By.linkText("MARKETPLACE")).click();	
		driver.navigate().refresh();
		driver.switchTo().activeElement().findElement(By.linkText("BLOG")).click();	
		driver.navigate().back();
		driver.navigate().back();
		driver.switchTo().activeElement().findElement(By.linkText("DOWNLOAD")).click();	
		return true;
		
		
		
		
	}

    

}
