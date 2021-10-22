package POM_And_PF_Trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create_Board 
{
	@FindBy(xpath = "//span[contains(text(),'Create new board')]")
	public static WebElement create_board;

	@FindBy(xpath = "//input[@class='_2C8dwcFUoIOCYP']")
	public static WebElement add_board;

	@FindBy(xpath = "//button[contains(text(),'Create board')]")
	public static WebElement Create;
}
