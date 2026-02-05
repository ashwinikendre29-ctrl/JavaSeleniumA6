package org.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
	
	
		@FindBy(id="Email") private WebElement emailTextbox;
		
		@FindBy(id="Password") private WebElement passwordTextbox;
		@FindBy(id="RememberMe") private WebElement rememberMeCheckbox;
		@FindBy(linkText="Forgot Password") private WebElement forgotPasswordLink;
		@FindBy(xpath="//input[@value='Log in']") private WebElement loginButton;
		
		//Initialization
		public LoginPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver,this);
		}
		//Utilization

		public WebElement getEmailTextbox() {
			return emailTextbox;
		}

		public WebElement getPasswordTextbox() {
			return passwordTextbox;
		}

		public WebElement getRememberMeCheckbox() {
			return rememberMeCheckbox;
		}

		public WebElement getForgotPasswordLink() {
			return forgotPasswordLink;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		public void login(String email,String password)
		{
			getLoginLink().click();
			emailTextbox.clear();
			emailTextbox.sendKeys(email);
			passwordTextbox.clear();
			passwordTextbox.sendKeys(password);
			loginButton.click();
			
		}
		//public void logout()
		//{
			//getLogoutLink().click();
		//}


		
		

	}


