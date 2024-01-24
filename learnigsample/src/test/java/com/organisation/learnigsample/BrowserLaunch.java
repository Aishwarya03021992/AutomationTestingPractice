package com.organisation.learnigsample;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptException;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		/* Instantiate Chrome Browser */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

//		/* Enter Text Value */
//		WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
//		name.sendKeys("Aishwarya");
//		name.clear();
//		Thread.sleep(1000);
//		name.sendKeys("Aishwarya Kamaraj");
//		Thread.sleep(1000);
//
//		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		email.sendKeys("xyz.gmail.com");
//		Thread.sleep(1000);
//
//		WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
//		phone.sendKeys("123456789");
//		Thread.sleep(1000);
//
//		WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));
//		address.sendKeys("Chennai");
//		Thread.sleep(1000);
//
//		/* Select Gender */
//		WebElement GenderMale = driver.findElement(By.xpath("(//input[@id='male'])[1]"));
//		GenderMale.click();
//		Thread.sleep(1000);
//
//		WebElement GenderFemale = driver.findElement(By.xpath("(//input[@id='female'])[1]"));
//		GenderFemale.click();
//		Thread.sleep(1000);
//
//		/* Checkout the days */
//		WebElement Sunday = driver.findElement(By.xpath("//input[@id='sunday']"));
//		Sunday.click();
//		Thread.sleep(1000);
//
//		WebElement Monday = driver.findElement(By.xpath("//input[@id='monday']"));
//		Monday.click();
//		Thread.sleep(1000);
//
//		WebElement Tuesday = driver.findElement(By.xpath("//input[@id='tuesday']"));
//		Tuesday.click();
//		Thread.sleep(1000);
//
//		WebElement Wednesday = driver.findElement(By.xpath("//input[@id='wednesday']"));
//		Wednesday.click();
//		Thread.sleep(1000);
//
//		WebElement Thursday = driver.findElement(By.xpath("//input[@id='thursday']"));
//		Thursday.click();
//		Thread.sleep(1000);
//
//		WebElement Friday = driver.findElement(By.xpath("//input[@id='friday']"));
//		Friday.click();
//		Thread.sleep(1000);
//
//		WebElement Saturday = driver.findElement(By.xpath("//input[@id='saturday']"));
//		Saturday.click();
//		Thread.sleep(1000);
//		Saturday.click();
//		Thread.sleep(1000);
//
//		/* Select Country */
//		Select CountryDropDown = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
//		CountryDropDown.selectByVisibleText("India");
//		Thread.sleep(1000);
//
//		if (CountryDropDown.isMultiple()) {
//			System.out.println("Multiple Country Selection");
//		} else {
//			System.out.println("Single Country Selection");
//		}
//
//		/* Select Colours */
//		Select Colors = new Select(driver.findElement(By.xpath("//*[@id=\"colors\"]")));
//		Colors.selectByValue("blue");
//		Colors.selectByValue("red");
//		Colors.selectByValue("yellow");
//		Colors.selectByValue("green");
//		Colors.selectByValue("white");
//		Thread.sleep(1000);
//		Colors.deselectByValue("blue");
//		Thread.sleep(1000);
//
//		if (Colors.isMultiple()) {
//			System.out.println("Multiple Color Selection");
//		} else {
//			System.out.println("Single Color Selection");
//		}
//
//		/* Date Picker */
//		WebElement dateBox = driver.findElement(By.xpath("(//input[@id='datepicker'])[1]"));
//		dateBox.sendKeys("01172024");
//		dateBox.clear();
//		Thread.sleep(1000);
//
//		dateBox.sendKeys("02031992");
//		Thread.sleep(1000);
//
//		dateBox.sendKeys(Keys.TAB);
//		Thread.sleep(1000);
//
//		/* Link Selection */
//		WebElement OpenCart = driver.findElement(By.xpath("//a[normalize-space()='open cart']"));
//		OpenCart.click();
//		System.out.println(driver.getTitle());
//		Thread.sleep(1000);
//		driver.navigate().back();
//
//		WebElement orangeHRM = driver.findElement(By.xpath("(//a[normalize-space()='orange HRM'])[1]"));
//		orangeHRM.click();
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().back();
//
//		WebElement Home = driver.findElement(By.xpath("//*[@id=\"blog-pager\"]/a"));
//		Home.click();
//
//		WebElement SubscribeTo = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[4]/div/a"));
//		SubscribeTo.click();
//		driver.navigate().to("https://testautomationpractice.blogspot.com/");
//
//		/* Table Validations */
//
//		List<WebElement> TableColumn = driver.findElements(By.xpath("(//th[normalize-space()='Subject'])[1]"));
//		System.out.println("Number Of Columns" + TableColumn.size());
//
//		List<WebElement> Tablerows = driver.findElements(By.xpath("(//td[normalize-space()='Learn Selenium'])[1]"));
//		System.out.println("Number Of Rows" + Tablerows.size());
//
//		/* Value of 4th Row 3rd Column */
//		WebElement row43 = driver.findElement(By.xpath("(//td[contains(text(),'Javascript')])[1]"));
//		String value43 = row43.getText();
//		System.out.println("The Cell Value is :" + value43);
//
//		/* Value of 6th Row 2nd Column */
//		WebElement row62 = driver.findElement(By.xpath("(//td[contains(text(),'Amit')])[2]"));
//		String value62 = row62.getText();
//		System.out.println("The Cell Value is :" + value62);
		
		/* Drag and Drop*/
		WebElement dragSource = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement dragTarget = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(dragSource, dragTarget).perform();
        Thread.sleep(1000);
        System.out.println("Drag and Drop is Sucessful");
        
        /* Double Click */
        WebElement Field1 = driver.findElement(By.xpath("(//input[@id='field1'])[1]"));
        Field1.sendKeys("Aish");
        
		driver.quit();

		System.out.println("Script Execution is Successful");
	}

}
