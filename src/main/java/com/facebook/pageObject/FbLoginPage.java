package com.facebook.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {

	public WebDriver ldriver;
	
	public FbLoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@id='loginbutton']")
	WebElement btnLogin;
	
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	
	
}
