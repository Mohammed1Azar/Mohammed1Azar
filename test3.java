package testthree;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();  // Automatically downloads the matching driver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        System.out.println("Title: " + driver.getTitle());
	}

}
