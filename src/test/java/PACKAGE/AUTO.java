package PACKAGE;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AUTO {
	public static String url="https://the-internet.herokuapp.com";
	WebDriver driver;
	
	@BeforeTest
	public void OpenURL() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void dropdown() throws InterruptedException{
		driver.findElement(By.linkText("Dropdown")).click();
		Thread.sleep(3000);
		WebElement dd=driver.findElement(By.id("dropdown"));
		Thread.sleep(3000);;
		Select s=new Select(dd);
		s.selectByValue("2");
		
		
		
	}
	

}
