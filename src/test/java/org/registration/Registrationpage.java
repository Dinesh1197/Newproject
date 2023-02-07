package org.registration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Registrationpage extends BaseClass{
	
	public Registrationpage() {
		
		PageFactory.initElements(driver, this);
	}
		
		
		@FindBy(id="email")
		private WebElement Textuser;
		
		@FindBy(id="pass")
    	private WebElement password;
		
		@FindBy(name="login")
		private WebElement btnlogin;
		
		@FindBy(xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
		private WebElement btncreate;
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstname;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastname;
		
		@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
		private WebElement emailorphone;
		
		@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[4]")
		private WebElement reentertext;
		
		@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")
		private WebElement newpass;
		
		@FindBy(xpath="//select[@id='day']")
	    private WebElement day;
		
		@FindBy(xpath="//select[@id='month']")
	    private WebElement month;
		
		@FindBy(xpath="//select[@id='year']")
	    private WebElement year;
		
		@FindBy(xpath="(//label[@class='_58mt'])[2]")
		private WebElement gender;
		

		public WebElement getTextuser() {
			return Textuser;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getBtnlogin() {
			return btnlogin;
		}

		public WebElement getbtncreate() {
			return btncreate;
		}
		
		public WebElement getfirstname() {
			return firstname;
		}
		
		public WebElement getlastname() {
			return lastname;
		}
		
		public WebElement getemailorphone() {
			return emailorphone;
		}
		
		public WebElement getreentertext() {
			return reentertext;
		}
		
		public WebElement getnewpass() {
			return newpass;
		}
		
		public WebElement getday() {
			return day;
		}
		public WebElement getmonth() {
			return month;
		}
		public WebElement getyear() {
			return year;
		}
		public WebElement getgender() {
			return gender;
		}
	

}

