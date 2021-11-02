package com.pack2;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

public class CaptureScreenshot {

	@Test
	 public static void captureScreenMethod() throws Exception{
	 System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
	 //File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
	 
	 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
	 driver.close();
	 driver.quit(); 

	}
}