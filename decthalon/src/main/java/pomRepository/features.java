package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class features {
	public  features(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[.='APPLY']")
	private WebElement  apply;
	
	@FindBy(xpath="//a[.='My Store']")
	private WebElement mystore;
	
	@FindBy(xpath="//button[@id='dropdownMenuButton']")
	private WebElement dropdownbutton;
	
 
  public WebElement apply() {
   return apply();
  }
   public WebElement mystore() {
	   return mystore();
}
   public WebElement dropdownbutton() {
	   return dropdownbutton();
	  }
   }
