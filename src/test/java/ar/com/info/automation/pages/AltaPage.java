package ar.com.info.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AltaPage extends BasePage {
	
	@FindBy(xpath="/html//input[@id='email_create']")
	private WebElement textBox;
	
	@FindBy(xpath="//button[@id='SubmitCreate']/span")
	private WebElement buttomTextBox;
		
	
	public AltaPage(WebDriver driver) {
		super(driver);
		
	}
	
	

	
	public void createCount(String mail) {
		this.textBox.sendKeys(mail);
		this.buttomTextBox.click();
	}
	
	

}
