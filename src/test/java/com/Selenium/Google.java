package com.Selenium;

import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Google {

	WebDriver driver;
	@BeforeClass
	public void setUp(){
		File file=new File("C:/Users/reddyr/AppData/Local/Mozilla/Firefox/Profiles/f1g2gey3.default");
		FirefoxProfile profile=new FirefoxProfile(file);
		driver=new FirefoxDriver(profile);
		
	}
	@Test
	public void test(){
		driver.get("https://google.co.in");
		String title=driver.getTitle();
		System.out.println(title);
		
		Capabilities cap=((RemoteWebDriver)driver).getCapabilities();
		String browser = cap.getBrowserName().toLowerCase();
		String os = cap.getPlatform().toString();
		String ver = cap.getVersion().toString();
		System.out.println(browser  +  ver  +  os);
	}
}
