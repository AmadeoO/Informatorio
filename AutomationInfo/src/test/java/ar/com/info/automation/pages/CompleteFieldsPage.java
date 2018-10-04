package ar.com.info.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import ar.com.info.automation.model.User;

public class CompleteFieldsPage extends BasePage {
	
	@FindBy(xpath="/html//form[@id='account-creation_form']/div[1]/div[1]/div[1]/label[@class='top']/div[@class='radio']//input[@name='id_gender']")
	private WebElement radioMr;
	
	@FindBy(xpath="/html//form[@id='account-creation_form']/div[1]/div[1]/div[2]/label[@class='top']/div[@class='radio']//input[@name='id_gender']")
	private WebElement radioMrs;
	
	@FindBy(id="customer_firstname")
	private WebElement firstName;
	
	@FindBy(xpath="/html//input[@id='customer_lastname']")
	private WebElement lastName;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(id="days")
	private WebElement day;
	
	@FindBy(id="months")
	private WebElement month;
	
	@FindBy(id="years")
	private WebElement year;
	
	@FindBy(id="company")
	private WebElement company;
	
	@FindBy(id="address1")
	private WebElement address1;
	
	@FindBy(id="address2")
	private WebElement address2;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id="postcode")
	private WebElement postcode;
	
	@FindBy(id="other")
	private WebElement aditionalInformation;
	
	@FindBy(id="phone")
	private WebElement homePhone;
	
	@FindBy(id="phone_mobile")
	private WebElement mobilPhone;

	@FindBy(id="alias")
	private WebElement aliasAddress;
	
	
	@FindBy(id="submitAccount")
	private WebElement registerButton;
	
	
	
	
	
	
	
	
	private User user;
	
	public CompleteFieldsPage(WebDriver driver, User user) {
		super (driver);
		this.user= user;
	}
	
	
	public void clickRadioButton(String sex) { //how question for check in this field?
		
		if (sex.equalsIgnoreCase("Mr.")) {
			this.radioMr.click();			
		}
		
		if (sex.equalsIgnoreCase("Mrs.")) {
			this.radioMrs.click();
			}
		
	}
	
	public void completePersonalInformation() {
		clickRadioButton(this.user.getSex());
		
		this.firstName.sendKeys(this.user.getFirstName());
		this.lastName.sendKeys(this.user.getLastName());
		this.pass.sendKeys(this.user.getPass()); //how do i select the pop-up window?
		Select selectDay = new Select(this.day);
		selectDay.selectByValue(this.user.getDay());
		Select selectMonth = new Select(this.month);
		selectMonth.selectByValue(this.user.getMonth());
		Select selectYear = new Select(this.year);
		selectYear.selectByValue(this.user.getYear());
		
		
	}
	
	public void yourAddress() {
		this.company.sendKeys(this.user.getCompany());
		this.address1.sendKeys(this.user.getAddress1());
		this.address2.sendKeys(this.user.getAddress2());
		this.city.sendKeys(this.user.getCity());
		Select selectSate = new Select(this.state);
		selectSate.selectByVisibleText(this.user.getState());
		this.postcode.sendKeys(this.user.getPostalCode());
		this.aditionalInformation.sendKeys(this.user.getAditionalInformation());
		this.homePhone.sendKeys(this.user.getHomePhone());
		this.mobilPhone.sendKeys(this.user.getMobilPhone());
		this.aliasAddress.clear();
		this.aliasAddress.sendKeys(this.user.getAddress1());
		this.registerButton.click();
	}
	

	
	
}
