package com.disc.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.disc.qa.base.TestBase;

public class WhitePaper extends TestBase {
	
	public WhitePaper()
	{
		PageFactory.initElements(driver, this);
	}

	public void redirectUcPage()
	{
		WebElement newEle=driver.findElement(By.xpath("//a[contains(text(),'UCITS White Paper')]"));
		newEle.click();
		
	}
}
