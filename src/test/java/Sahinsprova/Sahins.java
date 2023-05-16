package Sahinsprova;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Sahins {
 public static WebDriver driver;
 @Given("User have to enter Sahins Web Application through Edge browser")
 public void User_have_to_enter_Sahins_Web_Application_through_Edge_browser()
 {
	 System.setProperty("webdriver.http.factory", "jdk-http-client");
  	 WebDriverManager.edgedriver().setup();
  	 driver = new EdgeDriver();

 	 driver.get("https://sahins-dev.agiratech.com/");
  	 driver.manage().window().maximize();
   }
@When("User have to enter valid username and valid password")
public void User_have_to_enter_valid_username_and_valid_password()
{
	driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("sahins@agiratech.com");
    driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sahins@123");
}
@And("User have to click the login button")
public void User_have_to_click_the_login_button()
{
    driver.findElement(By.xpath("//span[text()=' Login ']")).click();
}
@Then("User is on Dashboard Screen")
public void User_is_on_Dashboard_Screen()
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
}
@And("User click on User Management")
public void User_click_on_User_Management()
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[text()='User Management']")).click();
}
@Then("User Click on Phlebo Management")
public void user_click_on_phlebo_management() {
    driver.findElement(By.xpath("//span[text()=' Phlebo Management']")).click();
}

@Then("User Click on Phlebo Create Button")
public void user_click_on_phlebo_create_button() {
	driver.findElement(By.xpath("//b[text()=' Create Phlebo ']")).click();
   
}

@Then("User enter all mandatory fields")
public void user_enter_all_mandatory_fields() throws InterruptedException, AWTException {
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
   driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("SAHINS125");
   driver.findElement(By.xpath("//button[@type='button']")).click();
   driver.findElement(By.xpath("//span[text()='DEC 2004']")).click();
   driver.findElement(By.xpath("//div[text()=' 1990 ']")).click();
   driver.findElement(By.xpath("//div[text()=' JUL ']")).click();
   driver.findElement(By.xpath("//div[text()=' 18 ']")).click();
   driver.findElement(By.xpath("(//span[text()='Gender'])[2]")).click();
   
  WebElement gender = driver.findElement(By.xpath("//span[text()='Male']"));
  gender.click();
      driver.findElement(By.xpath("//input[@formcontrolname='mobile_number']")).sendKeys("91291289960");
   driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("Sahins125@gmail.com");
   
   
   driver.findElement(By.xpath("//span[text()='Select Collection Center']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//span[text()=' Agam Demo Center ']")).click();
   
   driver.findElement(By.xpath("(//span[text()='Center'])[2]")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//span[text()='Select All']")).click();
   
   Robot r = new Robot();
   r.keyPress(KeyEvent.VK_ESCAPE);
   r.keyRelease(KeyEvent.VK_ESCAPE);

 
   driver.findElement(By.xpath("(//span[text()='State'])[2]")).click();
   WebElement state = driver.findElement(By.xpath("//span[text()='Tamil Nadu']"));
   state.click();
   
   driver.findElement(By.xpath("//input[@formcontrolname='district']")).sendKeys("Chennai");
   driver.findElement(By.xpath("(//span[text()='City'])[2]")).click();
   
//   driver.findElement(By.xpath("(//span[text()='City'])[2])).click();
   WebElement city = driver.findElement(By.xpath("//span[text()='Alandur']"));
   city.click();
   
   
   driver.findElement(By.xpath("//input[@formcontrolname='address']")).sendKeys("5th Cross Street");
   
   driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys("600126");
   
   


  
 
   r.keyPress(KeyEvent.VK_ESCAPE);
   r.keyRelease(KeyEvent.VK_ESCAPE);
   
  
   driver.findElement(By.xpath("//input[@formcontrolname='address']")).sendKeys("Guindy"); 
   
   driver.findElement(By.xpath("//span[text()=' Register ']")).click();
   
//   driver.findElement(By.xpath("//span[text()=' Upload Image ']")).click();
//  WebElement uploadfile = driver.findElement(By.name("file"));
//  uploadfile.sendKeys("filepath");
//
//  driver.findElement(By.id("file")).sendKeys("C:\\Users\\Agira\\Pictures\\Screenshots\\7007.png");
  
 }
}
