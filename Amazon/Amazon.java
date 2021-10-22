package Amazon;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import POM_And_PageFactory.BuyNow;
import POM_And_PageFactory.Login;
import POM_And_PageFactory.Search_Products;
import POM_And_PageFactory.Select_Products;

public class Amazon 

{
	WebDriver driver;

	@Test(priority = 1)
	public void LoadUrl()
	{
		System.setProperty("webdriver.chrome.driver","/home/qq379/Selenium/chromedriver");

		driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	public void LoginPage()
	{
		PageFactory.initElements(driver, Login.class);

		Login.login.click();
		Login.Phone_Number.sendKeys("9008128107");
		Login.Continue.click();
		Login.Password.sendKeys("Divya@123");
		Login.Sign_in.click();
	}

	@Test(priority = 3)
	public void Search_Product()
	{
		PageFactory.initElements(driver, Search_Products.class);

		Search_Products.SearchBox.click();
		Search_Products.Search_products.sendKeys("Western Sarees");
		Search_Products.Search.click();
	}

	@Test(priority = 4)
	public void Select_Product()
	{
		PageFactory.initElements(driver, POM_And_PageFactory.Select_Products.class);

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(200,900)");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Women Georgette Saree With Stitched blouse piece'] ")));

		Select_Products.SelectProd.click();

	}

	@Test(priority = 5)
	public void Buy_Now_Product()
	{
		PageFactory.initElements(driver, POM_And_PageFactory.BuyNow.class);

		String ParentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		ArrayList<String> tab = new ArrayList<String>(window);
		driver.switchTo().window(tab.get(1));
		BuyNow.BuyProduct.click();

		driver.close();
		driver.quit();

	}




}
