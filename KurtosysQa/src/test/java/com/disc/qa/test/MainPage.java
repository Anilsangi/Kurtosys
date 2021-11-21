package com.disc.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.disc.qa.base.Screenshot;
import com.disc.qa.base.TestBase;
import com.disc.qa.pages.HomePage;
import com.disc.qa.pages.ObjectPage;
import com.disc.qa.pages.WhitePaper;

public class MainPage extends TestBase {
	ObjectPage objPage;
	

	public  MainPage() {
		
		super();
		
	}
	@Test
	public void MainPage() throws InterruptedException {
		initialization();
		
		HomePage homepage=new HomePage();
		homepage.lodingPage();
		WhitePaper pageWhite=new WhitePaper();
		
		pageWhite.redirectUcPage();
		Screenshot.takeSnapShot(driver);
		ObjectPage objPage=new ObjectPage();
		objPage.callObjects();
	
	
		
		
	}
}
