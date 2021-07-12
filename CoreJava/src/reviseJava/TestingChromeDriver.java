package reviseJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestingChromeDriver {

	public static void main(String[] args) {

//		System.setProperty("webdriver.edge.driver","C:\\Users\\shish\\Documents\\eclipse-workspace\\Selenium Dependencies\\msedgedriver.exe");
//		System.setProperty("webdriver.ie.driver","C:\\Users\\shish\\Documents\\eclipse-workspace\\Selenium Dependencies\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shish\\Documents\\eclipse-workspace\\Selenium Dependencies\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://intellipaat.com");
	}

}
  