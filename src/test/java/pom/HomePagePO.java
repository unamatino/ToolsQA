package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {
	public WebDriver driver;
	
	public HomePagePO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h5[text()='Elements']")
	private WebElement element;
	
	public WebElement elements() {
		return element;
	}
}
