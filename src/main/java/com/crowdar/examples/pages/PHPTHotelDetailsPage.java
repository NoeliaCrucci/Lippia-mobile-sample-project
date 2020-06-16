package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.crowdar.core.pageObjects.PageBaseMobile;

public class PHPTHotelDetailsPage extends PageBaseMobile {

	private static final String BOOK_BTN_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView";
	private static final String POSITION_RESOURCE_ID = "com.phptravelsnative:8a147777-26ab-43d8-869c-290cfbd40df5/title";

	public PHPTHotelDetailsPage(RemoteWebDriver driver) {
		super(driver);
		this.url = "";
	}

	public void selectRoom() {
		
		clickElement(By.xpath(BOOK_BTN_XPATH));
		
		
		
	}

}
