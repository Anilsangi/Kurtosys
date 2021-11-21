package com.disc.qa.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.disc.qa.base.Screenshot;
import com.disc.qa.base.TestBase;

public class ObjectPage extends TestBase {
	
	
	
	@FindBy(xpath="//*[@id=\"18882_231669pi_18882_231669\"]")
	WebElement FirstName;
	@FindBy(xpath="//*[@id=\"18882_231671pi_18882_231671\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"18882_231675pi_18882_231675\"]")
	WebElement company;
	@FindBy(xpath="//*[@id=\"18882_231677pi_18882_231677\"]")
	WebElement industry;
	@FindBy(css="//input[type=\"submit\"]")
	WebElement sendClick;
	
	
	public ObjectPage() {
		PageFactory.initElements(driver, this);
		
	}
	

	
	public void callObjects() throws InterruptedException
	{
		WebElement frame=driver.findElement(By.xpath("//iframe[@loading='lazy']"));
		driver.switchTo().frame(frame);
		
	
		FirstName.sendKeys(prop.getProperty("FirstName"));
		lastname.sendKeys(prop.getProperty("LastName"));//LastName
		company.sendKeys(prop.getProperty("Company"));
		industry.sendKeys(prop.getProperty("Industry"));
		Thread.sleep(1000);
		sendClick.click();
		//Screenshot.takeSnapShot(driver);
		
		
		
		
	}
	

}
