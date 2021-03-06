package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://gmail.com");

		driver.findElement(By.name("identifier")).sendKeys("seleniumpractice3@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/span/span")).click();
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		//driver.findElement(By.name("password")).sendKeys("Selenium1234");
		//driver.findElement(By.xpath("(//div[@jsname='LgbsSe']/span/span)[1]")).click();
				
	}

	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
}
