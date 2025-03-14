package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/zimrrigudino/Documents/web_drivers/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/contactForm.html");
		
		
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());	
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
