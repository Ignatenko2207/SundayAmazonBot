package org.itstep;

import org.itstep.model.Account;
import org.itstep.service.BotService;
import org.openqa.selenium.WebDriver;

public class BotRunner {

	public static void main(String[] args) {
		
		WebDriver driver =BotService.getChromeDriver();
		
		Account account = new Account("IgnatenkoAlex_15896321@gmail.com", "123456789", "Alex", "Ignatenko");
		
		driver = BotService.registerAccount(driver, account);
		
		if(driver!=null) {
			driver = BotService.addGoodToCart(driver, "asin");
			
			driver.quit();
		}
		
		
	}

}
