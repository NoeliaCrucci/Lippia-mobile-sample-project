package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.crowdar.core.pageObjects.PageBaseMobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class PHPTHomePage extends PageBaseMobile {

	private static final String HOTELS_BTN_XPATH = "//android.support.v7.app.ActionBar.Tab[@content-desc=\"HOTELS\"]/android.widget.TextView";  
			

	public PHPTHomePage(RemoteWebDriver driver) {
		super(driver);
		this.url = "";
	}

	public void clickHotelsButton() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement hotelsButton = driver.findElementByXPath(HOTELS_BTN_XPATH);
		hotelsButton.click();
	}
	
	
	

}
