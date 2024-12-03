package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junit {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}
	

	@Test
	void test1() {
		driver.get("https://www.facebook.com/");
	}
	@Disabled 
	@Test
	void test2() {
		driver.get("https://www.flipkart.com/");
	}
	@Test
	void test3() {
		driver.get("https://www.techlearn.in/");
	}
	@Test
	void test4() {
		driver.get("https://www.whatsapp.com/");
		
	}
}