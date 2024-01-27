package task_15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Somthing {

	public static void main(String[] args) {
		try {

			// open browser
			ChromeDriver driver = new ChromeDriver();
			
			// search google
			driver.get("https://www.google.co.in/");
			
			// maximize the window
			driver.manage().window().maximize();
			
			// search something
			driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver", Keys.ENTER);
			
			// close browser
			driver.close();

		} catch (Exception e) {

		}

	}

}
