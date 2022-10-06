package com.Facebook.stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.facebook.pageObject.FbLoginPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Base {

	@Given("User lauch chrome browser")
	public void user_lauch_chrome_browser() throws Exception {
	   System.setProperty("webdriver.chrome.driver", "C:\\Automation Testing\\chromedriver.exe");
	   driver=new ChromeDriver();
	   Thread.sleep(2000);
	   ad=new FbLoginPage(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String Url) throws Exception {
	    driver.get(Url);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
	   ad.setUserName(email);
	   ad.setPassword(password);
	    Thread.sleep(2000);

	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
	   ad.clickLogin();
	    Thread.sleep(2000);

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) throws Exception {
	    Assert.assertEquals(title, driver.getTitle());
	    Thread.sleep(2000);

	}

	@Then("close browser.")
	public void close_browser() {
	   driver.close();
	}
}