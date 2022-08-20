package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InventoryManagement_Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();
		driver.findElement(By.linkText("Inventory management")).click();
		WebElement radio=driver.findElement(By.id("ContentPlaceHolder1_Radiobutton_2"));
		radio.click();

		
		


	}

}
