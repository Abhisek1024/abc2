package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resource\\com\\features\\Shortlist\\shortList.feature",
glue= {"com.stepdefination.RLL_240Testinh_FirstCry_Shortlist"},
plugin= {"pretty","html:target/cucumber-reports"},
tags="@Clear_all"
)

public class ShortlistRunner extends AbstractTestNGCucumberTests {
}
