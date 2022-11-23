package magento.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	public WebDriver driver;
	private By firstname = By.id("firstname");
	private By lastname = By.id("lastname");
	private By email_address = By.id("email_address");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmation");
	private By registerBtn = By.xpath("//button[@type='submit' and span='Register']");
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstname() {
		return driver.findElement(firstname);
	}

	public WebElement getLastname() {
		return driver.findElement(lastname);
	}

	public WebElement getEmail_address() {
		return driver.findElement(email_address);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getConfirmPassword() {
		return driver.findElement(confirmPassword);
	}

	public WebElement getRegisterBtn() {
		return driver.findElement(registerBtn);
	}
	
	public DashboardPage registerNewAccount() {
		getFirstname().sendKeys("Ahmed111");
		getLastname().sendKeys("Desouky111");
		getEmail_address().sendKeys("ahmeddesouky1991111@gmail.com");
		getPassword().sendKeys("P@ssw0rd");
		getConfirmPassword().sendKeys("P@ssw0rd");
		getRegisterBtn().click();
		return new DashboardPage(driver);
	}
	
	
}
