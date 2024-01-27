package task_15;

import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Webdriver_Script {

	public static void main(String[] args) {

		try {
			// open browser
			ChromeDriver driver = new ChromeDriver();

			// search google
			driver.get("https://www.google.co.in/");

			// maximize the window
			driver.manage().window().maximize();

			// close browser
			driver.close();

		} catch (Exception e) {

		}

	}

}
