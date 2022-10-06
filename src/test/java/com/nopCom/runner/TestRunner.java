package com.nopCom.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Featurefb/FbLogin.feature",
		glue="stepdefinations",
		dryRun = false,
		monochrome = true,
		tags="@Smoke",
		publish = true
		
		)


public class TestRunner {

}