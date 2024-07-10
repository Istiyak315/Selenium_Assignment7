package Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	
	WebDriver driver;
	
	
	 @BeforeTest
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
	 @Test(enabled = false)
	 public void Test1() {
		 //clicking on checkbox 1
		 driver.findElement(By.id("checkBoxOption1")).click();
		 
		 //clicking on radiobutton 3
		 driver.findElement(By.xpath("//input[@value=\"radio3\"]")).click();
	 }
	 
	 
	 @Test
	 public void test2() {
		 
		 //clicking all the chekboxes
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(WebElement i:checkbox) {
			i.click();
		}
	 }
	 @Test
	 public void test3() {
		 
		 //clicking all the radiobuttons
		List<WebElement> radiobutton= driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		for(WebElement i:radiobutton) {
			i.click();
		}
	 }
	 
	 
	 
	 
	 @AfterTest
	 public void at() {
		 //to close the browser
		 driver.quit();
	 }
}
