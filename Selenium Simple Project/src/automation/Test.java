package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author SANJAY
 *
 */
public class Test {
//	C:\Users\SANJAY\Desktop
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANJAY\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("http://www.bputexam.in");
		driver.findElement(By.name("btnK")).submit();
		driver.findElement(By.className("LC201b DKV0Md")).submit();
	}
}
