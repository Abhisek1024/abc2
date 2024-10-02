package com.stepdefination.RLL_240Testinh_FirstCry_Shortlist;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_Shortlist.Homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*******************************************
Project Name:RLL_240Testing_FirstCry
Module Name:shortlist
Script Name : 
Author:
Date of Creation:
Script Description:

********************************************/

public class StepDefination_homePage 
{
	WebDriver driver=new ChromeDriver();
	Homepage ab=new Homepage(driver);
	Logger log1;


	@Given("The user is in the firstcry home page")
	public void the_user_is_in_the_firstcry_home_page() throws InterruptedException {
		ab.login_page();
	}

	@When("The user clicks on login")
	public void the_user_clicks_on_login() throws InterruptedException {
		ab.clickOnLoginButton();
	}

	@And("The user enters the mobile number")
	public void the_user_enters_the_mobile_number() throws InterruptedException {
	    ab.sendMobileNumber();
	}

	@Then("click on continue")
	public void click_on_continue() throws InterruptedException {
		ab.clickOnContinueButton();
	    
	}

	@And("The user enters the provided otp")
	public void the_user_enters_the_provided_otp() {
	    
	}

	@And("The user click on submit")
	public void the_user_click_on_submit() throws InterruptedException {
	    ab.clickOnSubmitButton();
	}

	@Then("The user must able to login")
	public void the_user_must_able_to_login() {
//        WebElement element = driver.findElement(By.xpath("//span[@class='anch myacc_2']"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        String expectedText = "My Account";
//        String actualText = element.getText().trim();
//
//        // Hard assertion
//        Assert.assertEquals("Text does not match!", expectedText, actualText);
//        
//       


    
	}
	//@access_shortlist_01
	@Given("The user in the firstcry home page")
	public void the_user_in_the_firstcry_home_page() {
	   
	}

	@When("^The user search for a (.*)")
	public void the_user_search_for_a_shirt(String search) throws InterruptedException {
		ab.clickOnSearchBar(search);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Wait up to 10 seconds
		log1 = Logger.getLogger(StepDefination_homePage.class);
		log1.info("pass");
	}

	@And("click the product")
	public void click_the_product() throws InterruptedException {
	    ab.clickOnSearchButton();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Wait up to 10 seconds

	    ab.clickOnSearchProduct();
	}

	@And("The user click the product for shortlisting")
	public void the_user_click_the_product_for_shortlisting() throws InterruptedException {
	    ab.clickOnShortlistOption();
	}

	@Then("The user is able to shortlist the shirt")
	public void the_user_is_able_to_shortlist_the_shirt() {
		//span[text()="(1)"]
		WebElement element = driver.findElement(By.xpath("//span[text()='(1)']"));
        String actualText = element.getText();

        // Expected text
        String expectedText = "1";

        // Validate using assertion
        Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}
	//@access_shortlist_02
	@Given("user in the firstcry home page")
	public void user_in_the_firstcry_home_page() {
	    
	}

	@When("^user search for a (.*)")
	public void user_search_for_a_footwear(String search2) {
	    ab.clickOnSearchBar2(search2);
	    
	}
	
	@And("click on the product")
	public void click_on_the_product() throws InterruptedException {
	   ab.clickOnSearchButton();
	   Thread.sleep(5000);
	   String actualTitle = driver.findElement(By.xpath("//span[@class='bd_hl']")).getText();
	   System.out.println("Actual Title: " + actualTitle);
	   Assert.assertEquals(actualTitle, "Footwear", "The actual title does not match the expected title");

	   //Thread.sleep(5000);
	   ab.clickOnSearchProduct2();
	   
	}
	
	@And("user click the product for shortlisting")
	public void user_click_the_product_for_shortlisting() throws InterruptedException {
	    ab.clickOnShortlistOption();
	}

	@Then("The user is able to shortlist the footwear")
	public void the_user_is_able_to_shortlist_the_footwear() {
	   
	}
	 //@Check_item
	@Given("user is in the firstcry home page")
	public void user_is_in_the_firstcry_home_page() throws InterruptedException {
	   ab.login_page();
		ab.clickOnLoginButton();
	   ab.sendMobileNumber();
	   ab.clickOnContinueButton();
	   ab.clickOnSubmitButton();
	}

	@When("The user click on the Shortlist button")
	public void the_user_click_on_the_shortlist_button() {
	   ab.clickOnShortlistButton();
		 //Assert.assertTrue(driver.getTitle().contains("            My Shortlist"));
	   String actualTitle = driver.findElement(By.xpath("//a[@class='txt_dec']")).getText();
	   System.out.println("Actual Title: " + actualTitle);
	   Assert.assertEquals(actualTitle, "My Shortlist", "The actual title does not match the expected title");

	}

	@Then("The user is able to see the shortlisted products")
	public void the_user_is_able_to_see_the_shortlisted_products() {
		
	}
}
	 