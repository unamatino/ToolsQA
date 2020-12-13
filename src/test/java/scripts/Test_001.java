package scripts;

import org.openqa.selenium.WebDriver;

import library.BaseTest;
import pom.HomePagePO;

public class Test_001 extends BaseTest {
	public static WebDriver driver;

	public static void main(String[] args) {
		BaseTest basetest = new BaseTest();
		basetest.firefoxBrowserSetUp();
		HomePagePO hpo = new HomePagePO(driver);
		hpo.elements().click();
		basetest.tearDownBrowser();
	}

}
