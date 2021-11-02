package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesHandling {

	public static void main(String[] args) {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\NewDriver\\chromedriver.exe");
		 wd = new ChromeDriver();
		//d.get("https://www.google.com/");
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.get("http://demo.guru99.com/test/web-table-element.php");
		wd.manage().window().maximize();
		
		//No of Colomns
		List<WebElement> Colms= wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of colomns of the table are  : "  + Colms.size());
		
		//No of Rows 
		List <WebElement> Rows = wd.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No Rows of the table are : " + Rows.size() );
		
		
/*		//*Code Explanation:

			Here we have first declared Web Driver object “wd” &initialized it to chrome driver.
			We use List <WebElement> to total number of columns in “col”.
			findElements commands returns a list of ALL the elements matching the specified locator
			using findElements and X-path //*[@id=\”leftcontainer\”]/table/thead/tr/th we get all the columns
			Similarly, we repeat the process for rows.

*/	
		}

}
