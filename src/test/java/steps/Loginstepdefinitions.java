package steps;

import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberpages.Loginpage;
import cucumberpages.Testbase;
import junit.framework.Assert;

public class Loginstepdefinitions extends Testbase {
	
	Loginpage loginpage;

	
	@Before
	public void beforerun() {
		Testbase.init();
		loginpage = PageFactory.initElements(driver, Loginpage.class);
	
	}

	 @Given("^User is on techfios login page$")
	public static void user_is_on_techfios_login_page() {
		 
		driver.get("https://techfios.com/billing/?ng=login/");
		System.out.println("should land on intended page ");

	}

	@When("^User enters username as\"([^\"]*)\"$")
	public void user_enters_username_as(String username) {

		loginpage.enterUserName(username);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginpage.enterPassword(password);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^User clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
		loginpage.clickSignInButton();

	}

	@Then("^User should land on dashboard page$")
    public void user_should_land_on_dashboard_page() throws Throwable {
    
		String expected = "Dashboard- iBilling";
		String actual=loginpage.getPageTitle();
  
  	Assert.assertEquals(expected, actual);
     
    }

}
