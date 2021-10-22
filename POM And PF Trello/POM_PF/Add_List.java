package POM_And_PF_Trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_List
{
	@FindBy(xpath = "//span[contains(text(),'Add another list')]")
	public static WebElement Another_List;

	@FindBy(name = "name")
	public static WebElement List_Name;

	@FindBy(xpath = "//input[@value='Add list']")
	public static WebElement add_list;

}
