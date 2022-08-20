package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomerManagement_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Button3']")).click();
		driver.findElement(By.linkText("Customermanagement")).click();

		WebElement state=driver.findElement(By.id("ContentPlaceHolder1_ddl_state"));

		Select value=new Select(state);
		value.selectByVisibleText("Kerala");

	}

}
