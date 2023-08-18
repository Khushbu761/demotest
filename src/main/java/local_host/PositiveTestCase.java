package local_host;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(priority=1, enabled= false)
public class PositiveTestCase {

	public void GooglePixeldetails() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\local_host\\src\\main\\resources\\chromedriver.exe");

		// create driver
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3001");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//a[1]")).click();
	}

	@Test(priority=2, enabled= false)

	public void OpenCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\local_host\\src\\main\\resources\\chromedriver.exe");

		// create driver
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3001");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[normalize-space()='my cart']")).click();

	}

	@Test(priority=3, enabled=true)

	public void InCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\local_host\\src\\main\\resources\\chromedriver.exe");

		// create driver
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3001");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[normalize-space()='my cart']")).click();
		String Actualresult = driver.getCurrentUrl();
		System.out.println("Actual result : "+ Actualresult);
           Assert.assertEquals(Actualresult,"http://localhost:3001/cart");

	}

}
