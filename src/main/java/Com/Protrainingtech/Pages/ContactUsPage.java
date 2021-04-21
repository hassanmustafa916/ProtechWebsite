package Com.Protrainingtech.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;
@FindBy(name = "fname") WebElement FirstFieldName;
@FindBy(name = "lname") WebElement LastFieldName;
@FindBy(name = "email")	WebElement EmailFieldName;
@FindBy(name = "nf-field-20") WebElement PhoneFieldName;
@FindBy(id="nf-field-27") WebElement RegisterButtonName;
public ContactUsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void FirstFieldSendKeys(String Name) {
	FirstFieldName.sendKeys(Name);
}
public void LastNameSendKeys(String Name) {
	LastFieldName.sendKeys(Name);
}
public void EmailFieldSendKeys(String Name) {
	EmailFieldName.sendKeys(Name);
}
public void PhoneFieldSendKeys(String Name) {
	PhoneFieldName.sendKeys(Name);
}
public void RgsButtonClick() {
	RegisterButtonName.click();
}
}
