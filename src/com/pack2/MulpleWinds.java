package com.pack2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulpleWinds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\NewDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.naukri.com/");
		// It will return the parent window name as a String
		String parentwindow = d.getWindowHandle();
		//get.windowhandles(): This method helps to get the handles of all the windows opened
		//set: This method helps to set the window handles in the form of a string.
		Set<String> s = d.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();
		while(I1.hasNext()) {
			String childwindow = I1.next();
			if(!parentwindow.equals(childwindow))
			{
				d.switchTo().window(childwindow);
				System.out.println(d.switchTo().window(childwindow).getTitle());
				d.close();
				}
			
		}
		//switch to the parent window
				d.switchTo().window(parentwindow);

	}

}
