package testSuite;
import java.io.ObjectInputStream.GetField;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Faisal\\workspace1\\Selenium\\DriverServer\\geckodriver.exe");
		///////////////////////////////////////---------------------------/////////////////////////////
		FirefoxDriver open=new FirefoxDriver();
		open.get("Https://www.google.com");
		String input="Sony";
		Thread.sleep(2000);
		open.findElementByXPath("//a[@title='No thanks']").click();				
		open.findElementByXPath("//div[@id='sb_ifc0']").click();
		open.findElementByXPath("//div[@id='sb_ifc0']").sendKeys(input);
		open.findElementByXPath("//div[@id='sb_ifc0']").sendKeys(Keys.ENTER);
		List<WebElement> alllinks=open.findElements(By.xpath("//div/a"));
		System.out.println(alllinks.size());
	    for(int i=0;i<alllinks.size();i++){
	        System.out.println(alllinks.get(i).getAttribute("text"));
	        
	}
	}
}
