package magento.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	public WebDriver driver;
	private By message = By.xpath("//li[span='Thank you for registering with Madison Island.']");
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getMessage() {
		return driver.findElement(message).getText();
	}
	
	
	
	

}
