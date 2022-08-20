package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inventory_Preclosure_checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();
		driver.findElement(By.linkText("ordermanagement")).click();
		driver.findElement(By.partialLinkText("PRE")).click();
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_salesorderid")).sendKeys("priya");
		driver.findElement(By.id("ContentPlaceHolder1_CheckBox1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_CheckBox2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_Button1")).click();
		driver.switchTo().alert().accept();

		
		

	}

}
