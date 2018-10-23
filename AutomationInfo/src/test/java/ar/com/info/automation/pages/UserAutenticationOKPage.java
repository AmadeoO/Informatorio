/**
 * 
 */
package ar.com.info.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class UserAutenticationOKPage extends BasePage {
	
	
	@FindBy(class="page-heading")
	private WebElement title;

	public UserAutenticationOKPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title.getText();
	}
	
	

}
