package POM_And_PF_Trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Card 
{
	@FindBy(xpath="(//span[contains(text(),'Add a card')])[4]")
	  public static WebElement addcard;
	  
	  @FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
	  public static WebElement titlecard;
}
