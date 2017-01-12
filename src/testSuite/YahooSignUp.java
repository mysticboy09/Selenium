package testSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class YahooSignUp {
	
 	public static ChromeDriver p2;
  @BeforeClass
 public static void openBrowser(){
	 
     p2 = new ChromeDriver();
     p2.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	} 

	@Test
	public static void main() throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Faisal\\workspace1\\Selenium\\DriverServer\\chromedriver.exe");
 
	p2.get("https://login.yahoo.com/?.src=ym&.intl=us&.lang=en-US&.done=https%3a//mail.yahoo.com");
	p2.findElementByXPath("//*[@id='login-signup']").click();
	Thread.sleep(2000);
	p2.findElementByXPath("//div[@class='first-name pure-u-1-2']/input[@id='usernamereg-firstName']").click();
	Thread.sleep(2000);
	p2.findElementByXPath("//div[@class='first-name pure-u-1-2']/input[@id='usernamereg-firstName']").sendKeys("Jose");
	Thread.sleep(2000);
	p2.findElementByXPath("//div/input[@id='usernamereg-lastName']").click();
	
	Thread.sleep(2000);
	p2.findElementByXPath("//div/input[@id='usernamereg-lastName']").sendKeys("Koni");
	Thread.sleep(2000);
	p2.findElementByXPath("//div/input[@id='usernamereg-yid']").click();
	Thread.sleep(2000);
	p2.findElementByXPath("//div/input[@id='usernamereg-yid']").sendKeys("Jose_koni16");
	Thread.sleep(2000);
	p2.findElementByXPath("//div/input[@id='usernamereg-password']").sendKeys("8867309361_Ni");
	
	Thread.sleep(2000);
	
//	FirefoxDriver d1 = new FirefoxDriver();
//    d1.get("https://www.golfclubs.com/");
//    WebElement node=d1.findElement(By.id("node_id"));
//    Select s1 =new Select(node);
//    s1.selectByValue("30");
	
	p2.findElement(By.xpath("//div[@class='puree-dropdown']/select[@name='shortCountryCode']")).click();
	Select sc=new Select(p2.findElement(By.xpath("//div[@class='puree-dropdown']/select[@name='shortCountryCode']")));
	Thread.sleep(2000);
	List<WebElement> country = sc.getOptions();
	
	System.out.println(country.size());
for (int i=0;i<= country.size();i++)
{ System.out.println(country.get(i).getAttribute("text"));
if (country.get(i).getAttribute("text").contains("India")) {
		country.get(i).click();
break;}
}
	 
//sc.selectByValue("IN");s
	Thread.sleep(2000);
	p2.findElementByXPath("//div[@class='phone-number']/input[@id='usernamereg-phone']").click();
	p2.findElementByXPath("//div[@class='phone-number']/input[@id='usernamereg-phone']").click();
	p2.findElementByXPath("//div[@class='phone-number']/input[@id='usernamereg-phone']").sendKeys("8867309361");
	Thread.sleep(2000);

	Select sc1=new Select(p2.findElementByXPath("//div[@id='usernamereg-birthDate']/select[@id='usernamereg-month']"));
	p2.findElementByXPath("//div[@id='usernamereg-birthDate']/select[@id='usernamereg-month']").click();
	sc1.selectByValue("10");
	Thread.sleep(2000);
	Select sc2=new Select(p2.findElementByXPath("//*[@id='usernamereg-day']"));
	sc2.selectByVisibleText("28");
	Thread.sleep(2000);
	Select sc3=new Select(p2.findElementByXPath("//*[@id='usernamereg-year']"));
	sc3.selectByVisibleText("1992");
	//// drop down menu
	p2.findElement(By.xpath("//form[@id='regform']/input[@id='usernamereg-freeformGender']")).click();
	p2.findElement(By.xpath("//ul[@class='reg-gender-list']/li[contains(text(),'Male')]")).click();//
	
//	Select sc4=new Select(p2.findElement(By.xpath("//form[@id='regform']/input[@id='usernamereg-freeformGender']")));
////	Select sc4=new Select(p2.findElementByXPath("//*[@id='usernamereg-freeformGender']"));
//	Thread.sleep(2000);
//	List<WebElement> gender = sc4.getOptions();
//	System.out.println(gender.size());
//	for (int i=0;i<= gender.size();i++)
//	{ System.out.println(gender.get(i).getAttribute("text"));
//	if (gender.get(i).getAttribute("text").contains("Female")) {
//			gender.get(i).click();
//	break;}
//	}

//	sc4.selectByVisibleText("Female");
	
	System.out.println("selected male");
	
	
	}
}
