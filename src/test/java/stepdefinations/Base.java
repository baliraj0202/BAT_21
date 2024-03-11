package stepdefinations;

import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomerPage;
import pageObject.AdminPage;
import pageObject.Vendor;
import utilities.ReadConfig;

public class Base {

	WebDriver driver;
	
	AdminPage admin;
	
	public ReadConfig readConfig;
	
	public AddNewCustomerPage addCust;
	
	 public Vendor vendor;
	 
}
