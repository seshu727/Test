package Sample.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class App 
{
	protected static WebDriver driver;

	@BeforeTest
	public static void setupp() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seshu\\Desktop\\pit issues\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}

    @Test   
	public void name() {
		System.out.println("done");
	}
}
