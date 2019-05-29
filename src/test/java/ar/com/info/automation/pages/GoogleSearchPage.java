package ar.com.info.automation.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage {
	
	@FindBy(name="q")
	private WebElement TextBox;
	
	@FindBy(name="btnK")
	private WebElement searchButton;

	public GoogleSearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void	search(String query) {
		
		this.TextBox.clear();
		this.TextBox.sendKeys(query);
		this.TextBox.sendKeys(Keys.TAB);
		this.searchButton.click();
		
	}
	
}
