package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	//constructor
	//constructor
		WebDriver driver;
		//this is the constructor for the BasePage class. 
		//it takes a Webdriver object as an argument, which is used to interact with
		//the browser
		
		public BasePage(WebDriver driver)
		{
			this.driver= driver; // the paswed driver is assigned to the instance variable driver. this allows
			//the class and its subclasses to use it for browser interactions. 
			PageFactory.initElements(driver, this);
			//the abolve line itnitialzes the web elements defined in the class using selenium's 
			//pagefactory
		}
	
	
	
	//locators
	
	
	
	//action methods

}
