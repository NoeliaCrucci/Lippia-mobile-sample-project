package com.crowdar.examples.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.crowdar.core.pageObjects.PageBaseMobile;

public class PHPTHotelsResultsPage extends PageBaseMobile {

	private static final String HOTEL_FOUND_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"; 
			

	public PHPTHotelsResultsPage(RemoteWebDriver driver) {
		super(driver);
		this.url = "";
	}

	public void selectHotel(String hotelName) throws InterruptedException {
		
		WebElement hotel = driver.findElementByXPath(HOTEL_FOUND_XPATH);
		//if (hotel.getText() == hotelName) {
	    hotel.click();		
		//}
	}
}