package com.actitime.generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest1 
{
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://demo.actitime.com");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}