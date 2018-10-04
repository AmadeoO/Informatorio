package ar.com.info.automation.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
	private String sex;
	private String firstName;
	private String lastName;
	private String pass;
	private String day;
	private String month;
	private String year;
	private boolean newlester;
	private boolean offer;
	private String company;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	private String aditionalInformation;
	private String homePhone;
	private String mobilPhone;
	
	
	/*
	
	public User(String sex, String firstName, String lastName, String pass, String day, String month, String year,
			boolean newlester, boolean offer, String company, String companyAddress, String addressLine2, String city,
			String state, String postalCode, String informationAditional, String homePhone, String mobilPhone) {
		super();
		this.sex = sex;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pass = pass;
		this.day = day;
		this.month = month;
		this.year = year;
		this.newlester = newlester;
		this.offer = offer;
		this.company = company;
		this.companyAddress = companyAddress;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.informationAditional = informationAditional;
		this.homePhone = homePhone;
		this.mobilPhone = mobilPhone;
	}
	
*/
	
	
}
