package Com.Protrainingtech.Reusables;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;


import Com.Protrainingtech.Reusables.CodesToReuse;

public class Protrainingtechlistners extends CodesToReuse implements ITestListener {

	public void onTestStart(ITestResult result) {
				System.out.println("Test is started");
		
	}

	public void onTestSuccess(ITestResult result) {
				String Path=	  System.getProperty("user.dir");
		this.driver = ((CodesToReuse)result.getInstance()).driver;
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(si);
		File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(capture,new File(Path+"\\Pictures\\Passed\\"+si+"Picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
		
	}

	public void onTestFailure(ITestResult result) {
				String Path=	  System.getProperty("user.dir");
		
		this.driver = ((CodesToReuse)result.getInstance()).driver;
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(si);
		File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(capture,new File(Path+"\\Pictures\\Failed\\"+si+"Picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
