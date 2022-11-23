import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import magento.demo.pages.HomePage;

public class RegisterNewAccount {

	public WebDriver driver;
	public HomePage homePage;
	public String expectedResult = "Thank you for registering with Madison Island.";

	@BeforeClass
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		driver.get("http://magento-demo.lexiconn.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void userCanLogin() {
		
		String actualResult = homePage.clickOnRegister().registerNewAccount().getMessage();
		assertEquals(actualResult, expectedResult);
	}
}

