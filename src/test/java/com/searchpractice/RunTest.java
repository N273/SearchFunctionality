package com.searchpractice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",plugin = ( "json:target/cucumber-report/cucumber.json")
)
public class RunTest {
}
