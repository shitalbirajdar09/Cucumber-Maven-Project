package com.Facebook.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//features/FbLogin.feature",
		glue="com.Facebook.stepdefinations",
		dryRun = false,
		monochrome = true,
		tags="@Smoke",
		publish = true
		
		)


public class TestRunner {

}