package com.pack2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\NewDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.get("https://www.google.com/");
		d.get("http://www.naukri.com/");
		d.manage().window().maximize();
		// It will return the parent window name as a String
		String parent = d.getWindowHandle();
		//get.windowhandles(): This method helps to get the handles of all the windows opened
		//set: This method helps to set the window handles in the form of a string.
		Set<String>s = d.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator(); 
		
		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		d.switchTo().window(child_window);
		System.out.println(d.switchTo().window(child_window).getTitle());
		d.close();
		}

		}
		//switch to the parent window
		d.switchTo().window(parent);


	}

}
