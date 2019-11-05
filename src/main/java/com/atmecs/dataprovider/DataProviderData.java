package com.atmecs.dataprovider;





import org.testng.annotations.DataProvider;

import com.atmecs.configuration.FileConstant;
import com.atmecs.util.ProviderData;
/**
 * 
 * @author Mohit.Jaiswal
 *
 */
public class DataProviderData {


	/**
	 * Data provider name-homePage
	 * @return
	 */
	@DataProvider(name ="PageFooters" )
	public Object[][] getDataOne() {
		ProviderData provideData = new ProviderData(FileConstant.PageFooters);
		Object[][] getData = provideData.provideData();
		return getData;
	}


//	/**
//	 * Data provider name-productDescription
//	 * 
//	 * @return
//	 */
//	@DataProvider(name = "productDescription")
//	public Object[][] getDataSecond() {
//		ProviderData provideData = new ProviderData(FileConstant.productDescription);
//		Object[][] getData = provideData.provideData();
//		return getData;
//	}
//
//	/**
//	 * Data provider name -productReview
//	 * @return
//	 */
//	@DataProvider(name = "productReview")
//	public Object[][] getDataThird() {
//		ProviderData provideData = new ProviderData(FileConstant.productReview);
//		Object[][] getData = provideData.provideData();
//		return getData;
//	}
	//		
	//			/**
	//			 * Data provider 4
	//			 * @return
	//			 */
	//				@DataProvider(name = "productReview")
	//				public Object[][] getDataForth() {
	//					ProviderData provideData = new ProviderData(FileConstant.productReview);
	//					Object[][] getData = provideData.provideData();
	//					return getData;
	//				}
	//		
	//		


}
