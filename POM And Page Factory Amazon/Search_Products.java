package POM_And_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Products 
{
	@FindBy(id = "twotabsearchtextbox")
	public static WebElement SearchBox;


	@FindBy(name = "field-keywords")
	public static WebElement Search_products;

	@FindBy(id = "nav-search-submit-button")
	public static WebElement Search;


}
