package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPagePO {
	private WebElement textbox;
	private WebElement checkbox;
	private WebElement radioButton;
	private WebElement webTables;
	private WebElement buttons;
	private WebElement links;
	public ElementsPagePO(WebDriver driver) {
		textbox=driver.findElement(By.xpath("//span[text()='Text Box']"));
		checkbox=driver.findElement(By.xpath("//span[text()='Check Box']"));
		radioButton=driver.findElement(By.xpath("//span[text()='Radio Button']"));
		webTables=driver.findElement(By.xpath("//span[text()='Web Tables']"));
		buttons=driver.findElement(By.xpath("//span[text()='Buttons']"));
		links=driver.findElement(By.xpath("//span[text()='Links']"));
	}
	public void clickOnTextBoxInLeftNavigationBar() {
		textbox.click();
	}
	public void clickOnCheckBoxInLeftNavigationBar() {
		checkbox.click();
	}
	public void clickOnRadioButtonInLeftNavigationBar() {
		radioButton.click();
	}
	public void clickOnWebTablesInLeftNavigationBar() {
		webTables.click();
	}
	public void clickOnButtonsInLeftNavigationBar() {
		buttons.click();
	}
	public void clickOnLinksInLeftNavigationBar() {
		links.click();
	}
}
