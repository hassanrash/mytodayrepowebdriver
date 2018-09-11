package com.pluralsight;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

	public static void main(String[] args) throws Exception {
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/hassanrash/Documents/Tools/chromedriver");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
//				new DesiredCapabilities("firefox", "", Platform.VISTA));
		
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		WebElement searchField = driver.findElement(By.id("lst-ib"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait waittwo = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
//		
//		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
//		imagesLink.click();
//		
//		WebElement imageElement = driver.findElements(By.cssSelector("a[class = rg_l]")).get(0);
//		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
//		imageLink.click();
	}
}
