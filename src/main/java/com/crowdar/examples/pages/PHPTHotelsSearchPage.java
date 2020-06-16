package com.crowdar.examples.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.crowdar.core.Injector;
import com.crowdar.core.pageObjects.PageBaseMobile;

public class PHPTHotelsSearchPage extends PageBaseMobile {

	private static final String HOTELS_PAGE_NAME_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView";
	private static final String SELECTED_DEST_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView";
	
	public PHPTHotelsSearchPage(RemoteWebDriver driver) {
		super(driver);
		this.url = "";
	}

	public String getTitle() {
		WebElement hotelsPageTitle = getWebElement(By.xpath(HOTELS_PAGE_NAME_XPATH)); 
		String title = hotelsPageTitle.getText();
		return title;	
		
	}

	public void selectDestination(String destination) {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement destinationField = getWebElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")); 
		destinationField.click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement destinationField2 = getWebElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		destinationField2.click();
		destinationField2.sendKeys(destination);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement selectedDest = getWebElement(By.xpath(SELECTED_DEST_XPATH));
		selectedDest.click();
	}

	public void clickSearchButton() {
		WebElement searchButton = getWebElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.Button"));
		searchButton.click();
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			}
		
		
	}

}
