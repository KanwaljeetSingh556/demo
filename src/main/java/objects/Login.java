package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ReadPropertiesFile;

public class Login
{
	WebDriver driver;
	ReadPropertiesFile rd;
	public Login(WebDriver driver)
	{
		rd = new ReadPropertiesFile("Properties/assignment.properties");
		this.driver = driver;
		
		
	}
	
	public boolean navigateToLogin()
	{
		driver.switchTo().activeElement().findElement(By.linkText("LOGIN")).click();	
		return true;
		
	}
	
	public boolean FillDetails()
	{
		driver.switchTo().activeElement().findElement(By.name("email")).sendKeys(rd.ReadData("email"));
		driver.switchTo().activeElement().findElement(By.xpath("//input[@name='password']")).sendKeys(rd.ReadData("password"));
		driver.switchTo().activeElement().findElement(By.xpath("//button[text()='Login']")).click();
		return true;
		
		
		
	}

}
