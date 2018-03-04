package org.itstep.service;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BotServiceTest {

	@Ignore
	@Test
	public void testGetChromeDriver() {
		
		WebDriver driver = BotService.getChromeDriver();
		
		assertNotNull(driver);
		
		driver.quit();
	}

}
