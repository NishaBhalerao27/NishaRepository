package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Nisha/Desktop/webElement/Multple%20selectDropDown1.html");

		WebElement dropDownElement = driver.findElement(By.name("menu"));

		Select sel = new Select(dropDownElement);
		
		// read all the options as considers a webelement
		WebElement allOptions = sel.getWrappedElement();
		System.out.println(allOptions.getText());

	}
	
}

