package ar.com.info.automation.test;





import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ar.com.info.automation.model.User;
import ar.com.info.automation.pages.AltaPage;
import ar.com.info.automation.pages.CompleteFieldsPage;
import ar.com.info.automation.pages.HomePageSignIn;



public class TestAltaUsr extends BaseTest{
	
	private User user;
	
	@BeforeMethod
	public void initUser() {
		this.user= new User("mr.", "pepe", "zorin", "asdewq", "15", "10", "1996", true, true, "Las Muletas de MAMA",
							"calle sin nombre", "calle sin numero", "lalala", "Louisiana", "3258",
							"Amante del Blues y casador de COCODRILOS ", "1478520225","15453131");
	}
	
	
	@Test
	public void createAcount() {
		driver.get("http://automationpractice.com/index.php");
		HomePageSignIn homePageSignIn = new HomePageSignIn(driver);
		homePageSignIn.clickSignIn();
		AltaPage alta= new AltaPage(driver);
		alta.createCount("pepito@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		CompleteFieldsPage completeFieldsPage = new CompleteFieldsPage(driver, this.user);
		completeFieldsPage.completePersonalInformation();
		completeFieldsPage.yourAddress();
		
		
	}

	@Test(enabled=false)
	public void prueba() {
		System.out.println(this.user.getLastName()); 
	}
	

}
