package web_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws
	InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//shahnawaz hussain//Desktop//Software testing//chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 driver.get("https://www.google.com/");
				 WebElement element = driver.findElement(By.name("q"));
				  element.sendKeys("Test Vagrant");
				  element.submit();
				Thread.sleep(500000);
				
				driver.close();
	}

}
