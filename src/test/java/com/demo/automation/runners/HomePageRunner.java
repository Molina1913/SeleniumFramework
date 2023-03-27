package com.demo.automation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/navigate_to_page.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,  glue = "com.demo.automation.stepdefinitions")
public class HomePageRunner {

}
