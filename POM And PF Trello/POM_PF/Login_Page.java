package POM_And_PF_Trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {

	@FindBy(xpath = "//span[contains(text(),'Continue with Microsoft')]")
	public static WebElement Microsoft;

	@FindBy(name = "loginfmt")
	public static WebElement Email;

	@FindBy(id = "idSIButton9")
	public static WebElement Next;

	@FindBy(name = "passwd")
	public static WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement Sign_in;

	@FindBy(id = "idSIButton9")
	public static WebElement Save_Info;

}
