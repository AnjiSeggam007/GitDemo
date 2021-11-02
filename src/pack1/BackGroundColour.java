package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackGroundColour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Testing\\Softwares\\NewDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.get("https://www.google.com/");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://www.centerparcs.co.uk/");
		d.manage().window().maximize();
		String str = d.findElement(By.xpath("//a[@class='btn'][1]")).getText();
		System.out.println(str);
	}

}
