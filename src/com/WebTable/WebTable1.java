package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\NewDriver\\chromedriver.exe");
		 wd = new ChromeDriver();
		//d.get("https://www.google.com/");
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.get("https://www.bloombergquint.com/markets/equities/stocks-in-indices");
		wd.manage().window().maximize();
		
		// Colomns 
		//List<WebElement> Col = wd.findElements(By.xpath("//*[@class='song-list sno albCol']/ul/li/div[1]/div/span"));
		//System.out.println("No of Comons of table are : " + Col.size());
		
		List<WebElement> Col = wd.findElements(By.xpath("//*[@id='stock-in-indices-landing']/div/div/ul"));
		System.out.println("No of Comons of table are : " + Col.size());
		
		//No of Rows
		//List<WebElement> Rows = wd.findElements(By.xpath(""));
	
		
		//*[@class='song-list sno albCol']/ul/li/div[1]/div/span
		
		//*[@id='stock-in-indices-landing']
		

	}

}
