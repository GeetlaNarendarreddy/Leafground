package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty",
                "html:target/reports/leafground.html",
        "json:target/reports/leafground.json"},
publish = true)


public class TestRunner {
}