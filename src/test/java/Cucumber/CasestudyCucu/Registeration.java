package Cucumber.CasestudyCucu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Registeration {
	static WebDriver driver;
	Select s;
	@Given("^User is in the Signup Page$")
	public void user_is_in_the_Signup_Page() throws Throwable {
	  
		driver = Utility.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignUp")).click();
		 Assert.assertEquals(driver.getTitle(), "Sign Up");
	}  
	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^User enters \"([^\"]*)\" as firstname$")
	public void user_enters_as_firstname(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("firstName")).sendKeys(arg1);
		}

	@When("^User enters \"([^\"]*)\" as lastname$")
	public void user_enters_as_lastname(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("password")).sendKeys(arg1);}

	@When("^User enters \"([^\"]*)\" as confirm password$")
	public void user_enters_as_confirm_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);}

	@When("^User selects \"([^\"]*)\" as radio$")
	public void user_selects_as_radio(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("//input[@type='radio' and @value='"+arg1+"']")).click();
		}

	@When("^User enters \"([^\"]*)\" as e-mail$")
	public void user_enters_as_e_mail(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
		//throw new PendingException();
	}

	@When("^User enters \"([^\"]*)\" as Mobile number$")
	public void user_enters_as_Mobile_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
		 //throw new PendingException();
	}

	@When("^User enters \"([^\"]*)\" as DOB$")
	public void user_enters_as_DOB(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("dob")).sendKeys(arg1);
		}

	@When("^User enters \"([^\"]*)\" as address$")
	public void user_enters_as_address(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^User enters \"([^\"]*)\" as Security question$")
	public void user_enters_as_Security_question(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		s= new Select(driver.findElement(By.name("securityQuestion")));
		  s.selectByValue(arg1);
		  }

	@When("^User enters \"([^\"]*)\" as Answer$")
	public void user_enters_as_Answer(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("answer")).sendKeys(arg1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		  driver.findElement(By.name("Submit")).click();
	}

	@Then("^User must be navigated to the Home Page$")
	public void user_must_be_navigated_to_the_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals(driver.getTitle(), "Login");
		driver.close();

	}
}
