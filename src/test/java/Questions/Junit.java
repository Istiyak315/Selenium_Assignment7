package Questions;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	
	WebDriver driver;
	
	@Before
	public void bt() {
		
		//open the website 
		 WebDriverManager.chromedriver().setup();
		 
		 //open with Chrome browser
		 driver = new ChromeDriver();
		 
		 //Visiting the applications
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 //window to be maximize
		 driver.manage().window().maximize();
		 
	}
	
	@Test
	public void test() {
		
		 //clicking on checkbox 1
		 WebElement ck = driver.findElement(By.id("checkBoxOption1"));
		 ck.click();
		
		 
		 
		 //clicking on radiobutton 3
		WebElement rd = driver.findElement(By.xpath("//input[@value=\"radio3\"]"));
		rd.click();
	
		
		
	}
	@Test
	public void test1() {
		 //clicking all the chekboxes
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(WebElement i:checkbox) {
			i.click();

	  }
	}
	
	@Test
	public void test2() {
		
	 //clicking all the radiobuttons
		List<WebElement> radiobutton= driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		for(WebElement i:radiobutton) {
			i.click();
		}
     }
	
	@After
	public void ac() {
		driver.quit();
	}
}
