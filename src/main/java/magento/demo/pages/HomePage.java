package magento.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	private By account = By.linkText("Account");
	private By register = By.linkText("Register");
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAccountElement() {
		return driver.findElement(account);
	}
	
	public WebElement getRegisterElement() {
		return driver.findElement(register);
	}
	
	public RegisterPage clickOnRegister() {
		getAccountElement().click();
		getRegisterElement().click();
		return new RegisterPage(driver);
	}
	
}
