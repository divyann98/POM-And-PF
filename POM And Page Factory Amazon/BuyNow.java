package POM_And_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNow
{
	@FindBy(id = "buy-now-button")
	public static WebElement BuyProduct;
}
