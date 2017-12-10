package workOnGHJ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunGHJ {

	public static void main(String[] args) {
//		System.setProperty("webdriver.driver.chromedriver", 
//				"C:\\Users\\MD ZONAED BHUIYAN\\eclipse-workspace\\Git_Hub_Jen\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\MD ZONAED BHUIYAN\\eclipse-workspace\\Git_Hub_Jen\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		

	}

}
