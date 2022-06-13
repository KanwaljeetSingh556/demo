package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selects {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("http://uitestingplayground.com/");
		driver.manage().window().maximize();
		driver.switchTo().activeElement().findElement(By.linkText("Scrollbars")).click();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	//	driver.switchTo().activeElement().findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
	//	WebElement aj = driver.findElement(By.xpath("//p[contains(text(),'AJAX get')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	//	Thread.sleep(8000);
//		Actions a = new Actions(driver);

//		a.moveToElement(aj);
//		a.doubleClick().perform();
		Thread.sleep(5000);
		
		
		

	}

}
