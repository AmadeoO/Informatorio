package ar.com.info.automation.model;


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
	private String companyAddress;
	private String addressLine2;
	private String informationAditional;
	
	
	
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



	public String getCompanyAddress() {
		return companyAddress;
	}



	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}



	public String getAddressLine2() {
		return addressLine2;
	}



	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}



	public String getInformationAditional() {
		return informationAditional;
	}



	public void setInformationAditional(String informationAditional) {
		this.informationAditional = informationAditional;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getDay() {
		return day;
	}



	public void setDay(String day) {
		this.day = day;
	}



	public String getMonth() {
		return month;
	}



	public void setMonth(String month) {
		this.month = month;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public boolean isNewlester() {
		return newlester;
	}



	public void setNewlester(boolean newlester) {
		this.newlester = newlester;
	}



	public boolean isOffer() {
		return offer;
	}



	public void setOffer(boolean offer) {
		this.offer = offer;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getAddress1() {
		return address1;
	}



	public void setAddress1(String address1) {
		this.address1 = address1;
	}



	public String getAddress2() {
		return address2;
	}



	public void setAddress2(String address2) {
		this.address2 = address2;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	public String getAditionalInformation() {
		return aditionalInformation;
	}



	public void setAditionalInformation(String aditionalInformation) {
		this.aditionalInformation = aditionalInformation;
	}



	public String getHomePhone() {
		return homePhone;
	}



	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}



	public String getMobilPhone() {
		return mobilPhone;
	}



	public void setMobilPhone(String mobilPhone) {
		this.mobilPhone = mobilPhone;
	}
	
	
	
	
}
