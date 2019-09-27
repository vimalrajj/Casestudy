package Cucumber.CasestudyCucu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class searching {
   static WebDriver driver;
	
   @Given("^User is in the Home page$")
	public void user_is_in_the_Home_page() throws Throwable {
		driver = Utility.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
		  Assert.assertEquals(driver.getTitle(), "Home");
	}

	@When("^The user enters the product name \"([^\"]*)\"$")
	public void the_user_enters_the_product_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver.findElement(By.name("products")).sendKeys(arg1);
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("^The user is navigated to the product page$")
	public void the_user_is_navigated_to_the_product_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals(driver.getTitle(), "Search");
	}

	@When("^The product is added to the cart$")
	public void the_product_is_added_to_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver.findElement(By.linkText("Add to cart")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.partialLinkText("Cart")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Checkout")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  Assert.assertEquals(driver.getTitle(), "Cart Checkout");
		  
	}

	@When("^The payment is made$")
	public void the_payment_is_made() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("btn")).click();
		 driver.findElement(By.name("username")).sendKeys("123459");
		 driver.findElement(By.name("password")).sendKeys("Pass@459");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		 driver.findElement(By.name("transpwd")).sendKeys("Trans@459");
		 driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	}

	@Then("^The product is purchased$")
	public void the_product_is_purchased() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals(driver.getTitle(), "Order Details");
		  driver.findElement(By.linkText("SignOut")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.close();
	}

	@Given("^User is in Home page$")
	public void user_is_in_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver = Utility.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
		  Assert.assertEquals(driver.getTitle(), "Home");
	}

	@When("^The users enters the product name \"([^\"]*)\"$")
	public void the_users_enters_the_product_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("products")).sendKeys(arg1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	}

	@Then("^The product is not found$")
	public void the_product_is_not_found() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals("0", driver.findElement(By.id("itemscount")).getText());
		System.out.println("Product is not found");
		driver.close();
	}

}
