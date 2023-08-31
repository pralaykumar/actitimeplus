package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChrome 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.setBinary("./binary/chrome.exe");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://www.google.com");
}
}  
