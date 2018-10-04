package ar.com.info.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageSignIn extends BasePage {
	

	@FindBy(xpath="/html//header[@id='header']//nav//a[@title='Log in to your customer account']")
	private WebElement buttomSing;
	
	public HomePageSignIn(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickSignIn() {
		this.buttomSing.click();
	}

}
