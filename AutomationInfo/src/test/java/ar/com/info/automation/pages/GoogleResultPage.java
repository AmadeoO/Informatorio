package ar.com.info.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage extends BasePage {
	
	@FindBy(xpath = "/html//div[@id='rso']/div[@class='bkWMgd']/div/div[1]/div//a[@href='https://gimmeradio.com/']")
	private WebElement firstResult;
	
	public GoogleResultPage(WebDriver driver) {
		super(driver);
		
	}
	/*
	public <T> T openFirstResult(Class<T> returnPage){
		firstResult.click();
		return PageFactory.initElements(driver, returnPage);
	}
*/
	public void openFirstResult() {
		firstResult.click();
	}
	
}
