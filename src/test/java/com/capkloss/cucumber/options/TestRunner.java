package com.capkloss.cucumber.options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
        glue = "com.capkloss.cucumber.stepdefinitions",
        tags = "@RegTest")
public class TestRunner {

}

