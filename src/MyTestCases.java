import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	
	
	WebDriver driver = new ChromeDriver();
	
	
	String theWebsite = "https://www.saucedemo.com";
	String username = "standard_user";
	String password = "secret_sauce";
	
	
	@BeforeTest
	public void mySetUp() {
		
		driver.get(theWebsite);
		
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void Login() {
		
		WebElement UsernameInput =  driver.findElement(By.id("user-name"));
		UsernameInput.sendKeys(username);
		
		WebElement PasswordInput = driver.findElement(By.id("password"));
		PasswordInput.sendKeys(password);
		
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();
}
	 
	@Test(priority = 2)
	public void AddToCart() throws InterruptedException {
		
	List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));

	for(int i = 0; i < AddToCartButtons.size(); i++ ) {
		
		AddToCartButtons.get(i).click();
	}
	
	}
	
	
	@AfterTest
	public void AfterTesting() {}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
