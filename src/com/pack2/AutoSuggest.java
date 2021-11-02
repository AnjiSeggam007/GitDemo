package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\NewDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.get("https://www.google.com/");
		d.get("http://www.redbus.in/");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='txtSource']")).sendKeys("pune");
		d.findElement(By.xpath(".//*[@id='txtDestination']")).sendKeys("Chennai");
		
	}
}


