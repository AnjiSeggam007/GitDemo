package com.pack2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\NewDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.get("https://www.google.com/");
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)d;
		//scroll down
		jse.executeScript("window.scrollBy(0, 1500);");
		Thread.sleep(5000);
		
		//scroll up
		jse.executeScript("window.scrollBy(0, -1500);");
		Thread.sleep(5000);
		//
		jse.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		Thread.sleep(5000);
	} //catch(Exception e)
	{
		//e.printStackTrace();
	}
}


