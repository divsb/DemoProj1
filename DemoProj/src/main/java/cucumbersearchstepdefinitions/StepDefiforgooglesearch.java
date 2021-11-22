package cucumbersearchstepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
	

public class StepDefiforgooglesearch {			
	
	    WebDriver driver;			
	    		

@Given("^Open the ChromeDriver and launch the application$")
public void open_the_ChromeDriver_and_launch_the_application() 					
	    {		
	       System.setProperty("webdriver.chrome.driver", "C://Users//talkt//eclipse-workspace//DemoProj//Drivers//chromedriver.exe");					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://demo.guru99.com/v4");		
	     //  Thread.sleep(4000);
	       
	    }		
@When("^User enters username and password$")
public void User_enters_username_and_password()	throws InterruptedException 					
	    {		
	Thread.sleep(2000);
	       driver.findElement(By.name("uid")).sendKeys("username12");							
	       driver.findElement(By.name("password")).sendKeys("password12");	
	       Thread.sleep(2000);
	    }		

        @Then("^Reset the credential$")				
	    public void Reset_the_credential() throws Throwable 							
	    {		
	       driver.findElement(By.name("btnReset")).click();	
	       Thread.sleep(1000);
	       driver.quit();
	    }		
	}
	
