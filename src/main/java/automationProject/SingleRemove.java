//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.

package automationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleRemove {
	WebDriver driver;
	By item2 = By.cssSelector("input[type='checkbox'][name='todo[1]']");
	By removeButton = By.cssSelector("input[type='submit'][value='Remove']");
	
	@Test
	public void toggleAll() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/105/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(item2).click();
		driver.findElement(removeButton).click();
		
	//	Assert.assertNotEquals(driver.findElement(item2).getText(), actual, "Item removed successfully");
	}

	// @After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
