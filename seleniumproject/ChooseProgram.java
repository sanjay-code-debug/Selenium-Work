package seleniumproject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Program to ask the user to choose the option and after getting user response
 * open the Broswer
 * 
 * Selenium Program
 * 
 * @author SANJAY
 * 
 *         Date-02/07/2019
 */
public class ChooseProgram {
	/**
	 * 
	 */
	public void choose() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose Your Option");
		System.out.println("Enter 1:-Chrome");
		System.out.println("Enter 2:-FireFox");
		int option = input.nextInt();
		switch (option) {
		case 1:
			chrome();
			break;
		case 2:
			fireFox();
			break;
		default:
			System.out.println("Sorry You Enter The Wrong Option");
		}

	}

	/**
	 * chrome() is used to open the chrome
	 */
	public void chrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANJAY\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("Chesse");
		driver.findElement(By.name("btnK")).submit();
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("chesse");
			}
		});
		System.out.println("To Print Page Title" + driver.getTitle());
		driver.quit();
	}

	/**
	 * fireFox() is used to open the FireFox Browser and Search in Google
	 */
	public void fireFox() {
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https:\\www.google.com");
		WebElement element = driver2.findElement(By.className("gLFyf"));
		element.sendKeys("Chesse!");
		element.findElement(By.name("btnK")).submit();
		//element.submit();
		(new WebDriverWait(driver2, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("chesse!");
			}
		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChooseProgram ob = new ChooseProgram();
		ob.choose();
	}
}
