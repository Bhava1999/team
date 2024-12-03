package Launchingbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
        driver.quit();		
	}

}
