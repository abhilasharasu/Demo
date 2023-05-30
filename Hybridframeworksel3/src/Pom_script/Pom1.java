package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_scripts.Base_page;

public class Pom1 extends Base_page
{
	@FindBy(name="email")
	private WebElement usname;
	@FindBy(name="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement loginn;
	
	public Pom1(WebDriver driver)
	{
	      super(driver);
	}
	public void username(String data)
	{
		usname.sendKeys(data);
	}
   public void password(String data1)
   {
	   pwd.sendKeys(data1);
   }
   public void click_button()
   {
	   loginn.click();
   }
}
