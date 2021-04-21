package Com.Protrainingtech.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(linkText = "Contact us") WebElement Contact;
	public WebDriver driver;
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void ContactUsClick() {
	Contact.click();
}
}
