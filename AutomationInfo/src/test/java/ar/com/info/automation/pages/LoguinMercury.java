package ar.com.info.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoguinMercury extends BasePage {
	@FindBy(xpath = "//body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form[@name='home']/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input[@name='userName']")
	private WebElement userName;
	
	public LoguinMercury(WebDriver driver){
		super(driver);
	}
	
	public void enterUserName1(String query) {
		System.out.println("User1 ANTES del METODO");
		this.userName.sendKeys(query);
		System.out.println("User1 DESPUES del METODO");		
	}
	
	public void enterUserName2(String query) {
		System.out.println("USer2");
		By locator = By.xpath("//body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form[@name='home']/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input[@name='userName']");
		WebElement userNamer = driver.findElement(locator);
		userNamer.sendKeys(query);
				
	}
}
