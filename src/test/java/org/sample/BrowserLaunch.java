package org.sample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.registration.Registrationpage;
import org.utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass {

	public static void main(String[] args) throws IOException{
		
		chromeBrowser();	
		urllaunch("https://www.facebook.com/");	
		implicitwait(30);
		windowmaximize();
		Registrationpage R=new Registrationpage();
	    
		
	   
	   
	   
	   
	   
	   
	    
	    
	    
	    
	    
	
		
		
		
		
		
		

	}

	

}
