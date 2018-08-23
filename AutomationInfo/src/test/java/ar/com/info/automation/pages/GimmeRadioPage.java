package ar.com.info.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GimmeRadioPage extends BasePage {
	
	@FindBy(xpath="//*[@id=\"Hero\"]/div[2]/h1")
	private WebElement title;

	public GimmeRadioPage(WebDriver driver) {
		super(driver);
	}
	
	public String getTitle() {
		return this.title.getText();
		
		
	}

}
