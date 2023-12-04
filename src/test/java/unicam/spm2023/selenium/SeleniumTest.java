package unicam.spm2023.selenium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void checkProsSite() throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/java/unicam/spm2023/drivers/chromedriver");

		//System.out.println(projectPath)
		WebDriver driver = new ChromeDriver();
		driver.get("https://pros.unicam.it/");

		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "PROS";
		
		//System.out.println(at);		
		Thread.sleep(4000);

		assertEquals(et,at);
		driver.close();
		driver.quit();
		
	}

/*
	@Test
	@Disabled
	void checkProsSiteSearch() throws InterruptedException {
		
		// navigate your driver to mail.google.com
		driver.get("http://pros.unicam.it/");

		Thread.sleep(4000);
		
		//Find Element by className
		driver.findElement(By.className("toggle-search")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.className("search")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.className("search")).sendKeys("bprove");
		
		Thread.sleep(4000);
		
		//TO COMPLETE
			
	}
	
	@Test
	@Disabled
	void checkThisWebAppTitle() throws InterruptedException {
		
		driver.get("http://localhost:80/spm2021/");

		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "SPM 2021";
		
		//System.out.println(at);		
		Thread.sleep(4000);

		Assert.assertEquals(et,at);
		
		
	}
*/
}
