package com.demo.automation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/sign_up.feature",
snippets = CucumberOptions.SnippetType.CAMELCASE, glue = "test.java.stepDefinitions")

public class SignUpRunner {

}
