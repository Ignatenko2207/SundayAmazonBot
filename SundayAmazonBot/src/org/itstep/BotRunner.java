package org.itstep;

import org.itstep.model.Account;
import org.itstep.service.BotService;
import org.openqa.selenium.WebDriver;

public class BotRunner {

	public static void main(String[] args) {
		WebDriver driver = BotService.getFirefoxDriver();
		
		Account account = new Account("Gergalo_Alex_001@gmail.com", "123456789q", "Alex", "Gergalo");
		driver = BotService.registerAccount(driver, account);
		
		if (driver != null) {
			driver = BotService.addGoodToCart(driver, "");
			driver.quit();
		}
		
		
	}

}
