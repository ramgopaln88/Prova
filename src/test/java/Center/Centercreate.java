package Center;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Centercreate {
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
//	@Then("User is on Dashboard Screen")
//	public void User_is_on_Dashboard_Screen()
//	{
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
//	}
	@Then("User click on Center Management")
	public void User_click_on_Center_Management() throws InterruptedException
	{
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Center Management']")).click();
	}

}
