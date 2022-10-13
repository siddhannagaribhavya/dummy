
package genericLibrary;

/***
 * 
 * @author Yogita
 *
 */
public interface FrameworkConstants {

	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_PATH = "/decthalon/src/main/resources/drivers/chromedriver.exe";

	String FIREFOX_KEY = "webdriver.gecko.driver";
	String FIREFOX_PATH = "./src/main/resources/drivers/geckodriver.exe";

	String EXCEL_PATH = "./src/test/resources/testData/testData.xlsx";
	String PROPERTYFILE_PATH = "./resources/propertyFile/testData.properties";
	String SCREENSHOT_PATH = "./errorShots/";
	
	int PAGE_LOAD_TIMEOUT = 20;
	int IMPLICIT_TIMEOUT = 20;
	int EXPLICIT_TIMEOUT = 20;

}
