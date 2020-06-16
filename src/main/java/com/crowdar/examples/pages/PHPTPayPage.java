package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.crowdar.core.pageObjects.PageBaseMobile;

public class PHPTPayPage extends PageBaseMobile {

	private static final String CONTINUE_BTN_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Button";
	private static final String INPUT_CCNUMBER_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText[1]";
	private static final String INPUT_CCNAME_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText[2]";
	private static final String INPUT_EXP_MMYY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.EditText[1]";
	private static final String INPUT_CVV_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.EditText[2]";
	private static final String INPUT_NAME_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";
	private static final String INPUT_LASTNAME_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";
	private static final String INPUT_EMAIL_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText";
	private static final String INPUT_PHONE_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";
	private static final String GET_MESSAGE_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView";

	public PHPTPayPage(RemoteWebDriver driver) {
		super(driver);
		this.url = "";
	}

	public void completePaymentInfo(String ccNum, String name, String expMMYY, String cvv) {
		completeField(By.xpath(INPUT_CCNUMBER_XPATH),ccNum);
        completeField(By.xpath(INPUT_CCNAME_XPATH),name);
        completeField(By.xpath(INPUT_EXP_MMYY_XPATH),expMMYY);
        completeField(By.xpath(INPUT_CVV_XPATH), cvv);
		
	}

	public void completePersonalInfo(String name, String lastName, String email, String phone) {
		completeField(By.xpath(INPUT_NAME_XPATH),name);
        completeField(By.xpath(INPUT_LASTNAME_XPATH),lastName);
        completeField(By.xpath(INPUT_EMAIL_XPATH),email);
        completeField(By.xpath(INPUT_PHONE_XPATH),phone);
        
		
	}

	public void clickContinueBtn() {
		super.scrollToElementByAccessibilityId("com.phptravelsnative:id/continue_booking");
		clickElement(By.xpath(CONTINUE_BTN_XPATH));	
	}

	public void ValidateValidationMessage(String okMessage) {
		clickElement(By.xpath(GET_MESSAGE_XPATH));
		Assert.assertEquals(driver.findElement(By.xpath(GET_MESSAGE_XPATH)).getText(),"");
		
	}
}
	
