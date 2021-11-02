package com.Sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\NewDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.get("https://www.google.com/");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("http://demo.guru99.com/test/selenium-xpath.html");
		d.manage().window().maximize();
		//d.findElement(By.xpath("//*[contains(@name, 'btnK')]")).click();
		d.findElement(By.xpath("//*[@type='submit' or @value='type=LOGIN']")).click();
		d.findElement(By.xpath("//input[@type='submit' AND @name='btnLogin']")).click();
		d.findElement(By.xpath("//label[starts-with(@id,'message18')]")).click();
		d.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		// Following
		
		//*[@type='text']//following::input[1] or [2]
		
		//Ancestor:
		//*[text()='Enterprise Testing']//ancestor::div[1] or [2]
		
		//Child:
		//*[@id='java_technologies']//child::li
		//*[@id='java_technologies']//child::li[12]
		
		//Preceding:
		//Select all nodes that come before the current node
		//*[@type='submit']//preceding::input
		
		//*[@type='submit']//preceding::input[1]
		//*[@type='submit']//preceding::input[2]
		
		//Following-sibling:
		//Select the following siblings of the context node. Siblings are at the same level of the current node
		//It will find the element after the current node
		//*[@type='submit']//following-sibling::input
		
		//Parent:  Selects the parent of the current node
		
		//*[@id='rt-feature']//parent::div
		//*[@id='rt-feature']//parent::div[1] or [2]
		
		//Self:  Selects the current node or ‘self’ means it indicates the node itself
		//One node matching by using “self ” axis. It always finds only one node as it represents self-element.
		//*[@type='password']//self::input
		
		//Descendant: one originating or coming from an ancestral stock
		//*[@id='rt-feature']//descendant::a[1]
		
		
		
		
		
		
		
	}

}
