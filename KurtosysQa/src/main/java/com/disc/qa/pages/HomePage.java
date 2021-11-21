package com.disc.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.disc.qa.base.TestBase;

public class HomePage extends TestBase
{
	
	
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void lodingPage() throws InterruptedException 
	{
		
		Actions act =new Actions(driver);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"kurtosys-menu-item-59810\"]/a/div/div/span"));
		act.moveToElement(ele).build().perform();
		
		WebElement newEle=driver.findElement(By.xpath("//*[@id=\"kurtosys-menu-item-59810\"]/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div"));
		List<WebElement> listele= newEle.findElements(By.tagName("a"));
		
		for(WebElement menu:listele)
		{
			if(menu.getText().equals("White Papers & eBooks"))
			{
				menu.click();
				break;
			}
		}
		
	}

		
	
	
	
	
}
