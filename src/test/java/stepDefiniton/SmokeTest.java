package stepDefiniton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("Open chrome and start application")
	public void open_firefox_and_start_application() {
		//System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "default-src 'self'; script-src 'self' 'unsafe-inline' 'unsafe-eval'; img-src 'self'; style-src 'self' 'unsafe-inline'; font-src *");
		//System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://www.facebook.com");

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	options.addArguments("start-maximized");
	WebDriver driver = new ChromeDriver(options);
	driver.navigate().to("https://google.com");
}
	    
	@When("I enter valid {string} and valid {string}")
	public void i_enter_valid_and_valid(String uname, String upass) {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(upass);   
	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("first commit");
		//driver.findElement(By.xpath("//input[@type='submit'][@id='u_0_3']")).click();
	    
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	driver.close();
	}


}
