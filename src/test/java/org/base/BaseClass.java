package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement findElement;

	public static void launchBrowser(String url,String browser) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			break;
			
        case "edge":
        	WebDriverManager.edgedriver().setup();
        	driver=new EdgeDriver();
        	driver.get(url);
			
			break;

		default:
			System.out.println("Enter the Browser Name Correctly");
			break;
		}
	}

	public static WebElement locator(String locator, String attributeValue) {
		if (locator.equals("id")) {
			return driver.findElement(By.id(attributeValue));

		} else if (locator.equals("class")) {
			return driver.findElement(By.className(attributeValue));

		} else if (locator.equals("xpath")) {
			return driver.findElement(By.xpath(attributeValue));

		} else if (locator.equals("cssSelector")) {

			return driver.findElement(By.cssSelector(attributeValue));

		} else if (locator.equals("tagName")) {
			return driver.findElement(By.tagName(attributeValue));

		}
		return findElement;
	}

	public void loginButton(WebElement ref) {

		ref.click();

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void typeText(WebElement ref, String textvalue) {
		ref.sendKeys(textvalue);

	}

}
