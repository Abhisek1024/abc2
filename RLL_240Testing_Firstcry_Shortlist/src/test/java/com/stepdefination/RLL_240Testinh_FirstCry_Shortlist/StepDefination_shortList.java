package com.stepdefination.RLL_240Testinh_FirstCry_Shortlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_Shortlist.Homepage;
import com.pages.RLL_240Testing_FirstCry_Shortlist.Shortlist;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination_shortList 
{
	WebDriver driver=new ChromeDriver();
	Shortlist cd=new Shortlist(driver);
		//@Add_To_Cart
		@Given("The user is in the shortlist page")
		public void the_user_is_in_the_shortlist_page() throws InterruptedException {
				cd.clickOnLoginButton();
				cd.sendMobileNumber();
				cd.clickOnContinueButton();
				cd.clickOnSubmitButton();
		}

		@When("The user is able to click add to cart")
		public void the_user_is_able_to_click_add_to_cart() throws InterruptedException {
			cd.clickOnShortlistButton();
			cd.clickOnAddToCart();
			 String actualTitle = driver.findElement(By.xpath("//div[@class='adc']")).getText();
			   System.out.println("Actual Title: " + actualTitle);
			   Assert.assertEquals(actualTitle, "Added to cart!", "The actual title does not match the expected title");

		}

		@Then("The user is able cart the product")
		public void the_user_is_able_cart_the_product() {
		   
		}
		//Delete
		@Given("user is in the shortlist page")
		public void user_is_in_the_shortlist_page() throws InterruptedException {
			cd.clickOnLoginButton();
			cd.sendMobileNumber();
			cd.clickOnContinueButton();
			cd.clickOnSubmitButton();
		}

		@When("The user click on the delete sign")
		public void the_user_click_on_the_delete_sign() {
			cd.clickOnShortlistButton();
			cd.clickOnDelete();
		}

		@Then("The slected product shold be removed")
		public void the_slected_product_shold_be_removed() {
		    
		}
		//product_details
		@Given("The user in the shortlist page")
		public void The_user_in_the_shortlist_page() throws InterruptedException {
			cd.clickOnLoginButton();
			cd.sendMobileNumber();
			cd.clickOnContinueButton();
			cd.clickOnSubmitButton();
			cd.clickOnShortlistButton();
		}
		
		@When("The user click on the seleted product")
		public void the_user_click_on_the_seleted_product() {
			
		    cd.clickOnDetails();
		}

		@Then("The user can fetch the product details")
		public void the_user_can_fetch_the_product_details() {
		   
		}
			//Clear_all
		@Given("user in the shortlist page")
		public void user_in_the_shortlist_page() throws InterruptedException {
			cd.clickOnLoginButton();
			cd.sendMobileNumber();
			cd.clickOnContinueButton();
			cd.clickOnSubmitButton();
			cd.clickOnShortlistButton();
		}
			
		@When("The user clicked on the clear all button")
		public void The_user_clicked_on_the_clear_all_button() {
		    cd.clickOnClearAll();
		    String actualTitle = driver.findElement(By.xpath("//div[@id='StartShopping']")).getText();
			   System.out.println("Actual Title: " + actualTitle);
			   Assert.assertEquals(actualTitle, "Start Shopping", "The actual title does not match the expected title");

		}

		@Then("The user can able to clear all the items")
		public void The_user_can_able_to_clear_all_the_items() {
		   
		}
	}
