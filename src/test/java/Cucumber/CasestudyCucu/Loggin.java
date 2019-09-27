package Cucumber.CasestudyCucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Loggin {
	static WebDriver driver;
	@Given("^user not logged in$")
	public void user_not_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver = Utility.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		 Assert.assertEquals(driver.getTitle(), "Login");
	}

	@When("^User logins with \"([^\"]*)\"$")
	public void user_logins_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver.findElement(By.name("userName")).sendKeys(arg1);
	}
	
	@When("^User logins with as \"([^\"]*)\"$")
	public void user_logins_with_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.name("password")).sendKeys(arg1);}

	

	@Then("^Loggin successfull$")
	public void loggin_successfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		  driver.findElement(By.name("Login")).click();
		  Assert.assertEquals(driver.getTitle(), "Home");
		  driver.close();
	}


}
