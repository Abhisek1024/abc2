/*******************************************
Project Name:
Module Name:
Script Name : 
Author:
Date of Creation:
Script Description:

********************************************/




package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resource\\com\\features\\Shortlist\\shortlist.feature",
		glue= {"com.stepdefination.RLL_240Testinh_FirstCry_Shortlist"},
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-reports"},
		tags="@access_shortlist_01"
		)
public class runner {
 
}
