package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = "stepdefinitions",                // Package for step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Plugins for output
        monochrome = true                        // Better console output
)
public class TestRunner {
}
