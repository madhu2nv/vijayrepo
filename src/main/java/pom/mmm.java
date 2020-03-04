
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class mmm {

// public WebDriver driver=null;
// public mmm (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public mmm (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@name='ab_test_data']")public WebElement ab_test_data10;

@FindBy(xpath="//input[@id='u_0_w']")public WebElement reg_passwd__25;

@FindBy(xpath="//input[@id='u_0_m']")public WebElement firstname21;

@FindBy(xpath="//form[@id='login_form']//input[@name='lsd']")public WebElement lsd2;

@FindBy(xpath="//input[@id='u_0_7']")public WebElement sex27;

@FindBy(xpath="//input[@name='lgnrnd']")public WebElement lgnrnd8;

@FindBy(xpath="//input[@id='terms']")public WebElement terms33;

@FindBy(xpath="//form[@id='reg']//input[@name='jazoest']")public WebElement jazoest19;

@FindBy(xpath="//input[@id='referrer']")public WebElement referrer30;

@FindBy(xpath="//input[@id='u_0_c']")public WebElement timezone6;

@FindBy(xpath="//input[@id='pass']")public WebElement pass4;

@FindBy(xpath="//input[@id='asked_to_login']")public WebElement asked_to_login31;

@FindBy(xpath="//input[@name='next']")public WebElement next12;

@FindBy(xpath="//input[@id='prefill_contact_point']")public WebElement prefill_contact_point15;

@FindBy(xpath="//form[@id='login_form']//input[@name='jazoest']")public WebElement jazoest1;

@FindBy(xpath="//input[@id='ignore']")public WebElement ignore37;

@FindBy(xpath="//form[@id='reg']//input[@name='lsd']")public WebElement lsd20;

@FindBy(xpath="//input[@id='u_0_6']")public WebElement sex26;

@FindBy(xpath="//form[@id='login_form']//input[@id='locale']")public WebElement locale11;

@FindBy(xpath="//form[@id='login_form']//input[@name='skstamp']")public WebElement skstamp18;

@FindBy(xpath="//input[@id='prefill_source']")public WebElement prefill_source16;

@FindBy(xpath="//input[@id='action_dialog_shown']")public WebElement action_dialog_shown36;

@FindBy(xpath="//input[@id='captcha_response']")public WebElement captcha_response41;

@FindBy(xpath="//input[@id='prefill_type']")public WebElement prefill_type17;

@FindBy(xpath="//input[@id='u_0_o']")public WebElement lastname22;

@FindBy(xpath="//form[@id='reg']//input[@name='skstamp']")public WebElement skstamp42;

@FindBy(xpath="//input[@id='u_0_r']")public WebElement reg_email__23;

@FindBy(xpath="//input[@id='u_0_b']")public WebElement u_0_b5;

@FindBy(xpath="//input[@id='u_0_8']")public WebElement sex28;

@FindBy(xpath="//input[@id='email']")public WebElement email3;

@FindBy(xpath="//input[@id='lgnjs']")public WebElement lgnjs9;

@FindBy(xpath="//input[@name='guid']")public WebElement guid14;

@FindBy(xpath="//input[@id='u_0_11']")public WebElement custom_gender29;

@FindBy(xpath="//input[@id='ns']")public WebElement ns34;

@FindBy(xpath="//input[@id='reg_instance']")public WebElement reg_instance39;

@FindBy(xpath="//input[@id='captcha_persist_data']")public WebElement captcha_persist_data40;

@FindBy(xpath="//input[@id='u_0_d']")public WebElement lgndim7;

@FindBy(xpath="//input[@id='use_custom_gender']")public WebElement use_custom_gender32;

@FindBy(xpath="//input[@name='login_source']")public WebElement login_source13;

@FindBy(xpath="//form[@id='reg']//input[@id='locale']")public WebElement locale38;

@FindBy(xpath="//input[@id='u_0_u']")public WebElement reg_email_confirmation__24;

@FindBy(xpath="//input[@id='ri']")public WebElement ri35;
//pomStart
	


}
