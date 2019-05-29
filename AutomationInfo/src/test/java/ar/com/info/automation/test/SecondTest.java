package ar.com.info.automation.test;

//import static org.testng.Assert.assertEquals;

import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import ar.com.info.automation.pages.GimmeRadioPage;
//import ar.com.info.automation.pages.GoogleResultPage;
import ar.com.info.automation.pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SecondTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
        try {
        	ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.get("https://google.com.ar");
		
		GoogleSearchPage searchPage = new GoogleSearchPage(driver);
		searchPage.search("GimmeRadio");
		/*GoogleResultPage resultPage = new GoogleResultPage(driver);
		resultPage.openFirstResult();
		
		GimmeRadioPage radio = new GimmeRadioPage(driver);
		
		
		assertEquals("The Home For Metal", radio.getTitle());
*/
        } finally {
        	if(null != driver){
        		driver.quit();
        	}
        }
	}
}