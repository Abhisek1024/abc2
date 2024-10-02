package com.pages.RLL_240Testing_FirstCry_Shortlist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		Shortlist ab=new Shortlist(driver);
		

		
		ab.clickOnLoginButton();
		//ab.sendMobileNumber();
	}
}
