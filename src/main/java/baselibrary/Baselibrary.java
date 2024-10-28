package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrary {
	public static WebDriver driver;
	public void getLaunchUrl(String url)
	{
		String path = "C:\\Users\\sachi\\eclipse-workspace\\CheckboxAssertion\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
}
