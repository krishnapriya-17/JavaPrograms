package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFeatures {
	public static WebDriver driver;


	@Test(groups="signin check")
	  public void valid() {
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();

		driver.findElement(By.xpath("//a[@id='LinkButton1']")).click();
	  }
	@Test(dependsOnMethods= {"valid"})
	  public void invalid() {
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("admi");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();

		driver.switchTo().alert().accept();	  }
	@Test(timeOut=3000)
	  public void illegal() {
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

		driver.findElement(By.id("txt_unam")).sendKeys("****");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("***");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();

		driver.switchTo().alert().accept();	  }
	@Test(description="Test")
	  public void blank() {
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

		driver.findElement(By.id("txt_unam")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();

		driver.switchTo().alert().accept();	  }
	@Test(priority=1)
	  public void valid1() {
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();

		driver.findElement(By.xpath("//a[@id='LinkButton1']")).click();
	}
	@Test(dependsOnGroups= {"signin check"})
	  public void invalid1() {
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("admi");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();

		driver.switchTo().alert().accept();	  }
	@Test(alwaysRun=true)
	  public void illegal1() {
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

		driver.findElement(By.id("txt_unam")).sendKeys("****");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("***");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();

		driver.switchTo().alert().accept();	  }
	@Test(enabled=false)
	  public void blank1() {
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

		driver.findElement(By.id("txt_unam")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();

		driver.switchTo().alert().accept();	  }






	  @BeforeMethod
	  public void beforeMethod() {
			System.out.println("LoggedIn");
	  }

	  @AfterMethod
	  public void afterMethod() {

	  System.out.println("Loggedout");}

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeclass");

	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterclass");

	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BeforeTest");

	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("afterTest");

	  }

	  @BeforeSuite
	  public void beforeSuite() {

		  System.out.println("beforesuite");
		  System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver104\\chromedriver.exe");
			 driver=new ChromeDriver();
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("aftersuit");

driver.quit();
	  }

		

}
