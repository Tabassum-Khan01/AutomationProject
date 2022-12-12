//Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON. 

package automationProject;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAll {

	WebDriver driver;

	@Test
	public void toggleAll() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/105/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("input[type='checkbox'][name='allbox']")).click();
	}

	// @After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
