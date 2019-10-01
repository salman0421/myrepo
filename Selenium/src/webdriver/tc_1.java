package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class tc_1 {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
	System.out.println("sendkeys working");
	
	List<WebElement> sellist=driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div[2]/div/span"));
	System.out.println(sellist.size());
	for(WebElement ls:sellist){
		//String ss=ls.getText()
		System.out.println(ls.getText());
		
		
	}
	System.out.println("dd");
	
	
}
}
