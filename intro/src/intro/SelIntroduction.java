package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser 
		//Chrome - ChromDriver -> Methods
		//Firefox - FirefoxDriver -> Methods
		
		//Chrome 
		System.setProperty("webdriver.chrome.driver", "/Users/zimrrigudino/Documents/web_drivers/chromedriver" );
		WebDriver driver = new ChromeDriver();
		
		
		//FireFox
		System.setProperty("webdriver.gecko.driver", "/Users/zimrrigudino/Documents/web_drivers/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		
		//Edge 
		System.setProperty("webdriver.edge.driver", "/Users/zimrrigudino/Documents/web_drivers/msedgedriver");
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//close will close tabs
		driver.close();
		//quit will quit the whole script 
		//driver.quit();
	}

}
