package pushCordPurchase;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalMethod {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String Actual;
	
	static int waitcount;
	public static void launchBrowser(String browser, String url) {

		if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
		driver.get(url);
		}
	
	
		public static void waitstatic() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		}

		public static void maximize() {

		driver.manage().window().maximize();
		}

		public static void webwait() {

		wait = new WebDriverWait(driver,waitcount);

		}
		
		
		public static void visibilityElement(WebElement element) {

			int i = 0;
			try {
			wait.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception e) {
			if (i < waitcount) {
			System.out.println("Retrying staleelemnt exception");
			visibilityElement(element);
			} else {
			e.printStackTrace();
			}

			}

			}

			public static void verifyExactText(String Expected) {

			Actual = driver.getTitle();

			if(Actual.equalsIgnoreCase(Expected)) {

			System.out.println("Value Matched :");
			}
			else {
			System.out.println("Value not Matched :");
			}

			}
			
			public static void switchWindow(int expectedcount) {
				
				Set<String> windowHandles = driver.getWindowHandles();
				
				int count=0;
				for (String eachwindow : windowHandles) {
					
					if(count==expectedcount) {
						driver.switchTo().window(eachwindow);
					}
					count++;
				}
			}
			public static void staticWait() throws InterruptedException {
				Thread.sleep(2000);
			}
		
	
}
