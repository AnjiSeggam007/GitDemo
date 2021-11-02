package com.pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {
	@Test
	public void getFirefox() {
		System.setProperty("webdriver.gecko.driver", "G:\\Testing\\Softwares\\Drivers\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
		System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.close();

	//@Test String getChrome() {
			System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\Drivers\\chromedriver.exe");
			System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
			
		}
	 WebDriver driver1 = new ChromeDriver();
	// driver.get("https://www.softwaretestingmaterial.com");
	 //driver.close();
		
	}


