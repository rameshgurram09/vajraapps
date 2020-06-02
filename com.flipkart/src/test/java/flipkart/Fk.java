package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fk {

	public WebDriver driver;
	//public Actions action;

	
	
  @Test(priority=1)
  public void login() throws InterruptedException {
	 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		/*
		 * action = new Actions(driver); //login First mouse over Thread.sleep(3000);
		 * 
		 * WebElement ele1 = driver.findElement(By.xpath(
		 * "//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/span"));
		 * action.moveToElement(ele1).build().perform(); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.linkText("Sandals & Floaters")).click();
		 */	   }
  @Test(priority=2)
  public void search() throws InterruptedException {
	  driver.findElement(By.name("q")).sendKeys("reebook sandals");
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
	  Thread.sleep(3000);
		 
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
  
	  driver.findElement(By.linkText("7")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		 
  
  
  
  }  
  
  
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com");
  }  
	  
	
  @AfterTest
  public void afterTest() {
  }

}
