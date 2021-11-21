package com.disc.qa.base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	private static Logger logger = Logger.getLogger("Screenshot.class");
	private Screenshot(){
	}
	public static void takeSnapShot(WebDriver webdriver)  {
	    try{
	    	
	          
	           TakesScreenshot scrShot = ((TakesScreenshot) webdriver);              
	           File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
	           String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());              
	           String filePath="screenshots\\screenshot"+timestamp+".png";
	           File destFile = new File(filePath);
	           FileUtils.copyFile(srcFile, destFile);
	    }catch(Exception e){
	        logger.info( e.getMessage());
	    }      
	}

}
