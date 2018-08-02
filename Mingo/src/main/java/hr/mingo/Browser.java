package hr.mingo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import hr.mingo.variables.GlobalVariables;

public class Browser extends GlobalVariables{
	static WebDriver driver = new ChromeDriver();

	public static void goTo(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Printer\\Desktop\\Projekti\\JavaTesting\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.navigate().to(url);	
	}

	public static String title() {
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
	}

}
