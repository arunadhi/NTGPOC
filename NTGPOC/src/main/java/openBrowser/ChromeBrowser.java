package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowser {
	
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "E:\\NTG Jenkins\\JenkinsPOC\\driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in");
		system.out.println("Success");
		
	}
	
	

}
