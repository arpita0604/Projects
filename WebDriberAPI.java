package WebDriverAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriberAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "..\\May27thAutomation\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl = " +CurrentUrl);

		driver.navigate().to("https://www.amazon.in/");
		//driver.getTitle();
		
		String currentTitle = driver.getTitle();
		if(currentTitle.contains("Amazon"))
		{
			System.out.println("USER PASS => USER HAS LANDING ON AMAZON WEBSITE");
			
		}
		else
		{
			System.out.println("USER FAIL => USER HAS NOT LANDING ON AMAZON WEBISTE");
		}
		
		driver.navigate().back();
		System.out.println("Navigated back to Edureka page");
		
		driver.navigate().forward();
		System.out.println("Navigated forward to amazon page again");
		
		driver.manage().deleteAllCookies();
		System.out.println("Deleted all cookies");
		
		driver.navigate().refresh();
		System.out.println("refresh the webpage");
		
		driver.quit();
		
		
	}

}
