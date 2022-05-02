package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pushCordPurchase.FunctionalMethod;

public class LoginPOM {

	public LoginPOM() {
		
		PageFactory.initElements(FunctionalMethod.driver,this);		
	}
	
	@FindBy(xpath="//span[text()='Signin']")
	private WebElement signinhomepage;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signIn;
	
	
	public void signInhome() {
		
		this.signinhomepage.click();
	}
	
	public void uname(String username) {
		
		this.username.sendKeys(username);
	}
	
	public void pword(String password) {
		this.password.sendKeys(password);
	}
	
	public void signIn() {
		this.signIn.click();
	}
	
	}

