package com.atmecs.general;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//import com.atmecs.configuration.FileConstant;
import com.atmecs.configuration.FindLocator;
import com.atmecs.helper.CommonUtility;

public class AtmecsHomePage {
	
public static void clickOnHome(FindLocator loc, WebDriver driver)
{
	CommonUtility.clickElement(driver, loc.getlocator("homelink"));
	//CommonUtility.scrollDownPage(driver,FileConstant.scrolling_resolution);	
	CommonUtility.scrollToElement(driver, loc.getlocator("termofuse"));
	}
	
public static void clickOnService(FindLocator loc, WebDriver driver)
{
	CommonUtility.clickElement(driver, loc.getlocator("service"));
	CommonUtility.isDisplayed(driver, loc.getlocator("service"));
	//CommonUtility.scrollDownPage(driver,FileConstant.scrolling_resolution);	
	CommonUtility.scrollToElement(driver, loc.getlocator("termofuse"));

}

public static void clickOnAboutUs(FindLocator loc, WebDriver driver)
{
	CommonUtility.clickElement(driver, loc.getlocator("aboutus"));
	//CommonUtility.scrollDownPage(driver, FileConstant.scrolling_resolution);
	CommonUtility.scrollToElement(driver, loc.getlocator("termofuse"));
	
}
	
public static void clickOnPartner(FindLocator loc, WebDriver driver)
{
	CommonUtility.clickElement(driver, loc.getlocator("partner"));
	//CommonUtility.scrollDownPage(driver, FileConstant.scrolling_resolution);
	CommonUtility.scrollToElement(driver, loc.getlocator("termofuse"));

}
public static void clickOnMedia(FindLocator loc, WebDriver driver)
{
	CommonUtility.clickElement(driver, loc.getlocator("media"));
	//CommonUtility.scrollDownPage(driver, FileConstant.scrolling_resolution);	
	CommonUtility.scrollToElement(driver, loc.getlocator("termofuse"));

}
public static void clickOnInsight(FindLocator loc, WebDriver driver)
{
CommonUtility.clickElement(driver, loc.getlocator("insights"));
//CommonUtility.scrollDownPage(driver, FileConstant.scrolling_resolution);	
CommonUtility.scrollToElement(driver, loc.getlocator("termofuse"));
	
}
public static void clickOnCarrer(FindLocator loc, WebDriver driver)
{
	CommonUtility.clickElement(driver, loc.getlocator("careers"));
	//CommonUtility.scrollDownPage(driver, FileConstant.scrolling_resolution);	
	CommonUtility.scrollToElement(driver, loc.getlocator("termofuse"));

}
public static void clickOnContactUs(FindLocator loc, WebDriver driver)
{
	CommonUtility.clickElement(driver, loc.getlocator("contactus"));
	//CommonUtility.scrollDownPage(driver, FileConstant.scrolling_resolution);	
	CommonUtility.scrollToElement(driver, loc.getlocator("termofuse"));

	
}
	
	
	
	
	
	
	public  static  void isFooterPresent(String footerlink,FindLocator loc,WebDriver driver) {
		if (footerlink != null) {
			String actual_text= CommonUtility.getText(driver, loc.getlocator("footer").replace("xxxx", footerlink));
			System.out.println(actual_text);
			Assert.assertEquals(actual_text, footerlink, "footer is not present");
			
		
	}
	}}
 	
	


	
	

