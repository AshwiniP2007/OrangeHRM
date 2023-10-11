package businessfunction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutBaseClass 
{
	public static WebDriver driver =null;

	public static void launchapplication()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}
	public static void closeapplication()
	{
		driver.close();
		driver.quit();
	}
}