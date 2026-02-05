package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
  //Declaration
	@FindBy(id="gender-male") private WebElement genderMale;
	@FindBy(id="gender-female") private WebElement genderFemale;
	@FindBy(id="FirstName") private WebElement firstNameTextbox;
	@FindBy(id="LastName") private WebElement lastNameTextbox;
	@FindBy(id="Email") private WebElement emailTextbox;
	@FindBy(id="Password") private WebElement passwordTextbox;
	@FindBy(id="ConfirmPassword") private WebElement confirmPasswordTextBox;
	@FindBy(id="register-button") private WebElement registerButton;
	
	//Initialization
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	//Utilization

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getGenderFemale() {
		return genderFemale;
	}

	public WebElement getFirstNameTextbox() {
		return firstNameTextbox;
	}

	public WebElement getLastNameTextbox() {
		return lastNameTextbox;
	}

	public WebElement getEmailTextbox() {
		return emailTextbox;
	}
 
	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	

}
