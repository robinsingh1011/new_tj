package com.login;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature11"
                 ,glue= {"step_definition"}
                 
		)

public class Testrunner {
	
	}


