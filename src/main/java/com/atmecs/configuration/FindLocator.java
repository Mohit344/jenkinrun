package com.atmecs.configuration;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.helper.CommonUtility;
import com.atmecs.util.ReadPropertiesFile;


/**
 * Find locator class
 * @author Mohit.Jaiswal
 *
 */
public class FindLocator {


	static Properties homePageProperty;
	static Properties productdetail;

	public FindLocator() {
		try {

			// load the property file home.properties
			homePageProperty= CommonUtility.propertyFileLoad(FileConstant.findlocator);
		} catch (IOException e) {
			e.getMessage();
		}
	}
//		try {
//
//			// load the property file productdeatil.properties
//			productdetail= CommonUtility.propertyFileLoad(FileConstant.productdetail);
//		} catch (IOException e) {
//			e.getMessage();
//		}
//	}




	/**
	 * method - getlocator
	 * @param key
	 * @return
	 */
	public  String getlocator(String key)
	{
		String value=homePageProperty.getProperty(key);
		return value;

	}
	/**
	 * method-getproperty
	 * @param key
	 * @return
//	 */
//	public  String getproperty(String key)
//	{
//		String value=productdetail.getProperty(key);
//		return value;
//
//	}
//
//

}
