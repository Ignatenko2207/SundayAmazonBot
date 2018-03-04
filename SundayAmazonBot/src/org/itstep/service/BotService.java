package org.itstep.service;

import java.util.concurrent.TimeUnit;

import org.itstep.model.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BotService {

	private static final String BASE_URL = "https://www.amazon.com";
	
	public static WebDriver getChromeDriver() {
		
		String mainDir = System.getProperty("user.dir");
		String sep = System.getProperty("file.separator");
		
		String driverPath = mainDir + sep + "lib" + sep + "chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(45, TimeUnit.SECONDS);
		
		Timer.waitSec(3);
				
		return driver;
	}

	public static WebDriver registerAccount(WebDriver driver, Account account) {
		
		driver.get(BASE_URL);
		Timer.waitSec(5);
		
		WebElement registerDivElement = driver.findElement(By.id("nav-flyout-ya-newCust"));
		WebElement registerLinkElement = registerDivElement.findElement(By.tagName("a"));
		String registerLink = registerLinkElement.getAttribute("href");
		
		driver.get(registerLink);
		Timer.waitSec(5);
		
		WebElement inputNameElement = driver.findElement(By.id("ap_customer_name"));
		inputNameElement.sendKeys(account.getFirstName() + " " + account.getSecondName());
		Timer.waitSec(5);
		
		WebElement inputEmailElement = driver.findElement(By.id("ap_email"));
		inputEmailElement.sendKeys(account.getEmail());
		Timer.waitSec(5);
		
		WebElement inputPasswordElement = driver.findElement(By.id("ap_password"));
		inputPasswordElement.sendKeys(account.getPasword());
		Timer.waitSec(5);
		
		WebElement inputCheckElement = driver.findElement(By.id("ap_password_check"));
		inputCheckElement.sendKeys(account.getPasword());
		Timer.waitSec(5);
		
		WebElement inputSubmitElement = driver.findElement(By.id("continue"));
		inputSubmitElement.submit();
		
		Timer.waitSec(5);
		String currentUrl = driver.getCurrentUrl();
		driver.get(currentUrl);
		
		
		if(driver.getPageSource().contains("Hello, ")) {
			
			return driver;
		}
		
		driver.quit();
		return null;
	}
	
	
	public static WebDriver addGoodToCart(WebDriver driver, String asin) {
		
		
		return driver;
	}
}
