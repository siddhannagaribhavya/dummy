

	package users;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import genericLibrary.Base_Class;
	import io.github.bonigarcia.wdm.WebDriverManager;
	//import pomRepository.feature;
	import pomRepository.features;
		

	public class TC_001  extends Base_Class{

	     @Test
		public void sample() {
			//WebDriverManager.chromedriver().setup();
		//	WebDriver driver =new ChromeDriver();
			features feat=new features(driver);
			feat.apply().click();
			feat.mystore().click();
			feat.dropdownbutton().sendKeys("ANDHRA PRADESH");

	}
	}

