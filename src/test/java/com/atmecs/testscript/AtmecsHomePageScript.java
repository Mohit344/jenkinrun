package com.atmecs.testscript;

import org.testng.annotations.Test;

import com.atmecs.configuration.FindLocator;
import com.atmecs.dataprovider.DataProviderData;
import com.atmecs.general.AtmecsHomePage;
import com.atmecs.testbase.TestBase;

public class AtmecsHomePageScript  extends TestBase{
FindLocator loc = new FindLocator();
@Test(priority = 1)
public void clickOnHomeMenu()
{
	
	AtmecsHomePage.clickOnHome(loc, driver);	
}
	
@Test(priority = 2, dataProvider = "PageFooters", dataProviderClass = DataProviderData.class)
public void validateHomeMenuFooter(String footerlink)
{

AtmecsHomePage.isFooterPresent(footerlink, loc, driver);	
}
@Test(priority = 3)
public void  clickOnAboutUsMenu()
{
	AtmecsHomePage.clickOnAboutUs(loc, driver);	
	
}

@Test(priority = 4, dataProvider = "PageFooters", dataProviderClass = DataProviderData.class)
public void validateAboutUsFooter(String footerlink)
{

AtmecsHomePage.isFooterPresent(footerlink, loc, driver);
}
@Test(priority = 5)
public void clickOnServicesMenu()
{
	AtmecsHomePage.clickOnService(loc, driver);

	
}

@Test(priority = 6, dataProvider = "PageFooters", dataProviderClass = DataProviderData.class)
public void validateServicesFooter(String footerlink)
{
AtmecsHomePage.isFooterPresent(footerlink, loc, driver);	
}
@Test(priority = 7)
public void clickOnPatnersMenu()
{
	AtmecsHomePage.clickOnPartner(loc, driver);

	
}
@Test(priority = 8, dataProvider = "PageFooters", dataProviderClass = DataProviderData.class)
public void validatePartnerFooter(String footerlink)
{
AtmecsHomePage.isFooterPresent(footerlink, loc, driver);
}
@Test(priority = 9)
public  void clickOnMediaMenu()
{
	AtmecsHomePage.clickOnMedia(loc, driver);	
}
@Test(priority = 10, dataProvider = "PageFooters", dataProviderClass = DataProviderData.class)
public void validateMediaFooter(String footerlink)
{
AtmecsHomePage.isFooterPresent(footerlink, loc, driver);	
}
@Test(priority = 11)
public void clickOnInsightMenu()
{
AtmecsHomePage.clickOnInsight(loc, driver);
}
@Test(priority = 12, dataProvider = "PageFooters", dataProviderClass = DataProviderData.class)
public void validateInsightsFooter(String footerlink)
{
	
	AtmecsHomePage.isFooterPresent(footerlink, loc, driver);	
}
@Test(priority = 13)
public  void clickOnCarrerMenu()
{
	AtmecsHomePage.clickOnCarrer(loc, driver);
}
@Test(priority = 14, dataProvider = "PageFooters", dataProviderClass = DataProviderData.class)
public void validateCarrersFooter(String footerlink)
{
	AtmecsHomePage.isFooterPresent(footerlink, loc, driver);
}
@Test(priority = 15)
public void clickOnContactUsMenu()
{	
	AtmecsHomePage.clickOnContactUs(loc, driver);
}
@Test(priority = 16, dataProvider = "PageFooters", dataProviderClass = DataProviderData.class)
public void validateContactUsFooter(String footerlink)
{
	AtmecsHomePage.isFooterPresent(footerlink, loc, driver);
	
}



}