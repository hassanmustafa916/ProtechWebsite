package Protrainingtech.scenarios;

import org.testng.annotations.Test;

import Com.Protrainingtech.Pages.ContactUsPage;
import Com.Protrainingtech.Pages.Home;
import Com.Protrainingtech.Reusables.CodesToReuse;

public class First extends CodesToReuse {
  @Test
  public void f() {
	  Home home=new Home(driver);
	  ContactUsPage ob=new ContactUsPage(driver);
	  home.ContactUsClick();
	  ob.FirstFieldSendKeys("Nadeem");
	  ob.LastNameSendKeys("Chaudry");
	  ob.EmailFieldSendKeys("Protrainingtech@gmail.com");
	  ob.PhoneFieldSendKeys("17035651995");
	  ob.RgsButtonClick();
	  
  }
}
