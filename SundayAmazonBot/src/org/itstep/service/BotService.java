package org.itstep.service;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BotService {
	
	public static WebDriver getFirefoxDriver() {
		
		String mainDir = System.getProperty("user.dir");
		String sep = System.getProperty("file.separator");
		String driverPath = mainDir + sep + "lib" + sep + "geckodriver.exe";				//Путь к библиотеке-драйверу 
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		FirefoxOptions options = new FirefoxOptions();
		
//		options.addArguments("--start-maximized");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(capabilityName, value);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		
		//Ожидание загрузки браузера
		Timer.waitSec(5);
		
		return driver;
		
	}
}
